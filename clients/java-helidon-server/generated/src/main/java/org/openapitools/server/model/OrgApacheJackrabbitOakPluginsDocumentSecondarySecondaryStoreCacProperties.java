package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties   {

    private ConfigNodePropertyArray includedPaths;
    private ConfigNodePropertyBoolean enableAsyncObserver;
    private ConfigNodePropertyInteger observerQueueSize;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.
     *
     * @param includedPaths includedPaths
     * @param enableAsyncObserver enableAsyncObserver
     * @param observerQueueSize observerQueueSize
     */
    public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(
        ConfigNodePropertyArray includedPaths, 
        ConfigNodePropertyBoolean enableAsyncObserver, 
        ConfigNodePropertyInteger observerQueueSize
    ) {
        this.includedPaths = includedPaths;
        this.enableAsyncObserver = enableAsyncObserver;
        this.observerQueueSize = observerQueueSize;
    }



    /**
     * Get includedPaths
     * @return includedPaths
     */
    public ConfigNodePropertyArray getIncludedPaths() {
        return includedPaths;
    }

    public void setIncludedPaths(ConfigNodePropertyArray includedPaths) {
        this.includedPaths = includedPaths;
    }

    /**
     * Get enableAsyncObserver
     * @return enableAsyncObserver
     */
    public ConfigNodePropertyBoolean getEnableAsyncObserver() {
        return enableAsyncObserver;
    }

    public void setEnableAsyncObserver(ConfigNodePropertyBoolean enableAsyncObserver) {
        this.enableAsyncObserver = enableAsyncObserver;
    }

    /**
     * Get observerQueueSize
     * @return observerQueueSize
     */
    public ConfigNodePropertyInteger getObserverQueueSize() {
        return observerQueueSize;
    }

    public void setObserverQueueSize(ConfigNodePropertyInteger observerQueueSize) {
        this.observerQueueSize = observerQueueSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties {\n");
        
        sb.append("    includedPaths: ").append(toIndentedString(includedPaths)).append("\n");
        sb.append("    enableAsyncObserver: ").append(toIndentedString(enableAsyncObserver)).append("\n");
        sb.append("    observerQueueSize: ").append(toIndentedString(observerQueueSize)).append("\n");
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

