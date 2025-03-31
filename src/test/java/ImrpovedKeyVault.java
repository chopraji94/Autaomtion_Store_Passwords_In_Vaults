import io.restassured.response.Response;
import org.json.JSONObject;
import javax.crypto.spec.SecretKeySpec;
import java.util.Properties;
import static io.restassured.RestAssured.*;

public class ImrpovedKeyVault  {

    private static String TENANT_ID;
    private static String CLIENT_ID;
    private static String CLIENT_SECRET;
    private static String VAULT_NAME = "newkeyvaultforauto";
    private static  String SECRET_NAME = "username";
    private static Properties prop;

    public static void main(String[] args) throws Exception {

        prop = PropertyReader.StoreProperties();
        SecretKeySpec secretKey = Util.generateKey(prop.getProperty("secret.key"));
        TENANT_ID = Util.decrypt(prop.getProperty("tenant.id"), secretKey);
        CLIENT_ID = Util.decrypt(prop.getProperty("client.id"), secretKey);
        CLIENT_SECRET = Util.decrypt(prop.getProperty("client.secret"), secretKey);

        String accessToken = getAccessToken();
        String secretValue = getSecretValue(accessToken);

        System.out.println(secretValue);
    }


    private static String getSecretValue(String accessToken) {
        String secretUrl = "https://" + VAULT_NAME + ".vault.azure.net/secrets/" + SECRET_NAME + "?api-version=7.3";

        Response response = given()
                .header("Authorization", "Bearer " + accessToken)
                .header("Content-Type", "application/json")
                .get(secretUrl);

        JSONObject jsonResponse = new JSONObject(response.getBody().asString());
        return jsonResponse.getString("value");
    }

    private static String getAccessToken(){
        String tokenUrl = "https://login.microsoftonline.com/" + TENANT_ID + "/oauth2/v2.0/token";

        Response response = given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("grant_type", "client_credentials")
                .formParam("client_id", CLIENT_ID)
                .formParam("client_secret", CLIENT_SECRET)
                .formParam("scope", "https://vault.azure.net/.default")
                .post(tokenUrl);

        JSONObject jsonResponse = new JSONObject(response.getBody().asString());
        return jsonResponse.getString("access_token");
    }
}

