package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties   {

    private ConfigNodePropertyString accountName;
    private ConfigNodePropertyString containerName;
    private ConfigNodePropertyString accessKey;
    private ConfigNodePropertyString rootPath;
    private ConfigNodePropertyString connectionURL;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
     *
     * @param accountName accountName
     * @param containerName containerName
     * @param accessKey accessKey
     * @param rootPath rootPath
     * @param connectionURL connectionURL
     */
    public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(
        ConfigNodePropertyString accountName, 
        ConfigNodePropertyString containerName, 
        ConfigNodePropertyString accessKey, 
        ConfigNodePropertyString rootPath, 
        ConfigNodePropertyString connectionURL
    ) {
        this.accountName = accountName;
        this.containerName = containerName;
        this.accessKey = accessKey;
        this.rootPath = rootPath;
        this.connectionURL = connectionURL;
    }



    /**
     * Get accountName
     * @return accountName
     */
    public ConfigNodePropertyString getAccountName() {
        return accountName;
    }

    public void setAccountName(ConfigNodePropertyString accountName) {
        this.accountName = accountName;
    }

    /**
     * Get containerName
     * @return containerName
     */
    public ConfigNodePropertyString getContainerName() {
        return containerName;
    }

    public void setContainerName(ConfigNodePropertyString containerName) {
        this.containerName = containerName;
    }

    /**
     * Get accessKey
     * @return accessKey
     */
    public ConfigNodePropertyString getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(ConfigNodePropertyString accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * Get rootPath
     * @return rootPath
     */
    public ConfigNodePropertyString getRootPath() {
        return rootPath;
    }

    public void setRootPath(ConfigNodePropertyString rootPath) {
        this.rootPath = rootPath;
    }

    /**
     * Get connectionURL
     * @return connectionURL
     */
    public ConfigNodePropertyString getConnectionURL() {
        return connectionURL;
    }

    public void setConnectionURL(ConfigNodePropertyString connectionURL) {
        this.connectionURL = connectionURL;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {\n");
        
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
        sb.append("    connectionURL: ").append(toIndentedString(connectionURL)).append("\n");
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

