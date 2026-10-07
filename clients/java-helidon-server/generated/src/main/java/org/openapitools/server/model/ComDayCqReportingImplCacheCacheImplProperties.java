package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReportingImplCacheCacheImplProperties   {

    private ConfigNodePropertyBoolean repcacheEnable;
    private ConfigNodePropertyInteger repcacheTtl;
    private ConfigNodePropertyInteger repcacheMax;

    /**
     * Default constructor.
     */
    public ComDayCqReportingImplCacheCacheImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReportingImplCacheCacheImplProperties.
     *
     * @param repcacheEnable repcacheEnable
     * @param repcacheTtl repcacheTtl
     * @param repcacheMax repcacheMax
     */
    public ComDayCqReportingImplCacheCacheImplProperties(
        ConfigNodePropertyBoolean repcacheEnable, 
        ConfigNodePropertyInteger repcacheTtl, 
        ConfigNodePropertyInteger repcacheMax
    ) {
        this.repcacheEnable = repcacheEnable;
        this.repcacheTtl = repcacheTtl;
        this.repcacheMax = repcacheMax;
    }



    /**
     * Get repcacheEnable
     * @return repcacheEnable
     */
    public ConfigNodePropertyBoolean getRepcacheEnable() {
        return repcacheEnable;
    }

    public void setRepcacheEnable(ConfigNodePropertyBoolean repcacheEnable) {
        this.repcacheEnable = repcacheEnable;
    }

    /**
     * Get repcacheTtl
     * @return repcacheTtl
     */
    public ConfigNodePropertyInteger getRepcacheTtl() {
        return repcacheTtl;
    }

    public void setRepcacheTtl(ConfigNodePropertyInteger repcacheTtl) {
        this.repcacheTtl = repcacheTtl;
    }

    /**
     * Get repcacheMax
     * @return repcacheMax
     */
    public ConfigNodePropertyInteger getRepcacheMax() {
        return repcacheMax;
    }

    public void setRepcacheMax(ConfigNodePropertyInteger repcacheMax) {
        this.repcacheMax = repcacheMax;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReportingImplCacheCacheImplProperties {\n");
        
        sb.append("    repcacheEnable: ").append(toIndentedString(repcacheEnable)).append("\n");
        sb.append("    repcacheTtl: ").append(toIndentedString(repcacheTtl)).append("\n");
        sb.append("    repcacheMax: ").append(toIndentedString(repcacheMax)).append("\n");
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

