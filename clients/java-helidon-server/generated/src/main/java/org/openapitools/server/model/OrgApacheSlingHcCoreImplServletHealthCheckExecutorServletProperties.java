package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties   {

    private ConfigNodePropertyString servletPath;
    private ConfigNodePropertyBoolean disabled;
    private ConfigNodePropertyString corsAccessControlAllowOrigin;

    /**
     * Default constructor.
     */
    public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.
     *
     * @param servletPath servletPath
     * @param disabled disabled
     * @param corsAccessControlAllowOrigin corsAccessControlAllowOrigin
     */
    public OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(
        ConfigNodePropertyString servletPath, 
        ConfigNodePropertyBoolean disabled, 
        ConfigNodePropertyString corsAccessControlAllowOrigin
    ) {
        this.servletPath = servletPath;
        this.disabled = disabled;
        this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
    }



    /**
     * Get servletPath
     * @return servletPath
     */
    public ConfigNodePropertyString getServletPath() {
        return servletPath;
    }

    public void setServletPath(ConfigNodePropertyString servletPath) {
        this.servletPath = servletPath;
    }

    /**
     * Get disabled
     * @return disabled
     */
    public ConfigNodePropertyBoolean getDisabled() {
        return disabled;
    }

    public void setDisabled(ConfigNodePropertyBoolean disabled) {
        this.disabled = disabled;
    }

    /**
     * Get corsAccessControlAllowOrigin
     * @return corsAccessControlAllowOrigin
     */
    public ConfigNodePropertyString getCorsAccessControlAllowOrigin() {
        return corsAccessControlAllowOrigin;
    }

    public void setCorsAccessControlAllowOrigin(ConfigNodePropertyString corsAccessControlAllowOrigin) {
        this.corsAccessControlAllowOrigin = corsAccessControlAllowOrigin;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {\n");
        
        sb.append("    servletPath: ").append(toIndentedString(servletPath)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    corsAccessControlAllowOrigin: ").append(toIndentedString(corsAccessControlAllowOrigin)).append("\n");
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

