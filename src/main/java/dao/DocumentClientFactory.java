package dao;

import com.microsoft.azure.documentdb.ConnectionPolicy;
import com.microsoft.azure.documentdb.ConsistencyLevel;
import com.microsoft.azure.documentdb.DocumentClient;

public class DocumentClientFactory {
    private static final String HOST = "https://componentes.documents.azure.com:443/";
    private static final String MASTER_KEY = "CDZxlCOcwWTEo4WsNxx1PAcGlRniX1T1g8HmEnuxG8k2HVrWtE4RGkkF9EGLkSryjTcqZlbyWdmxE1kosycOkw==";

    private static DocumentClient documentClient = new DocumentClient(HOST, MASTER_KEY,
            ConnectionPolicy.GetDefault(), ConsistencyLevel.Session);

    public static DocumentClient getDocumentClient() {
        return documentClient;
    }

}
