package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties   {

    private ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl;
    private ConfigNodePropertyArray devhostnamepatterns;
    private ConfigNodePropertyInteger connectionTimeout;
    private ConfigNodePropertyInteger socketTimeout;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.
     *
     * @param cqAnalyticsSitecatalystServiceDatacenterUrl cqAnalyticsSitecatalystServiceDatacenterUrl
     * @param devhostnamepatterns devhostnamepatterns
     * @param connectionTimeout connectionTimeout
     * @param socketTimeout socketTimeout
     */
    public ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(
        ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl, 
        ConfigNodePropertyArray devhostnamepatterns, 
        ConfigNodePropertyInteger connectionTimeout, 
        ConfigNodePropertyInteger socketTimeout
    ) {
        this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
        this.devhostnamepatterns = devhostnamepatterns;
        this.connectionTimeout = connectionTimeout;
        this.socketTimeout = socketTimeout;
    }



    /**
     * Get cqAnalyticsSitecatalystServiceDatacenterUrl
     * @return cqAnalyticsSitecatalystServiceDatacenterUrl
     */
    public ConfigNodePropertyArray getCqAnalyticsSitecatalystServiceDatacenterUrl() {
        return cqAnalyticsSitecatalystServiceDatacenterUrl;
    }

    public void setCqAnalyticsSitecatalystServiceDatacenterUrl(ConfigNodePropertyArray cqAnalyticsSitecatalystServiceDatacenterUrl) {
        this.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl;
    }

    /**
     * Get devhostnamepatterns
     * @return devhostnamepatterns
     */
    public ConfigNodePropertyArray getDevhostnamepatterns() {
        return devhostnamepatterns;
    }

    public void setDevhostnamepatterns(ConfigNodePropertyArray devhostnamepatterns) {
        this.devhostnamepatterns = devhostnamepatterns;
    }

    /**
     * Get connectionTimeout
     * @return connectionTimeout
     */
    public ConfigNodePropertyInteger getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(ConfigNodePropertyInteger connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * Get socketTimeout
     * @return socketTimeout
     */
    public ConfigNodePropertyInteger getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(ConfigNodePropertyInteger socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {\n");
        
        sb.append("    cqAnalyticsSitecatalystServiceDatacenterUrl: ").append(toIndentedString(cqAnalyticsSitecatalystServiceDatacenterUrl)).append("\n");
        sb.append("    devhostnamepatterns: ").append(toIndentedString(devhostnamepatterns)).append("\n");
        sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
        sb.append("    socketTimeout: ").append(toIndentedString(socketTimeout)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

