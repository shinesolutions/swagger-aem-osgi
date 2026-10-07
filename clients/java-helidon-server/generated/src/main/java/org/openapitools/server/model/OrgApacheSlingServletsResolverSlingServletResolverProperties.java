package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingServletsResolverSlingServletResolverProperties   {

    private ConfigNodePropertyString servletresolverServletRoot;
    private ConfigNodePropertyInteger servletresolverCacheSize;
    private ConfigNodePropertyArray servletresolverPaths;
    private ConfigNodePropertyArray servletresolverDefaultExtensions;

    /**
     * Default constructor.
     */
    public OrgApacheSlingServletsResolverSlingServletResolverProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingServletsResolverSlingServletResolverProperties.
     *
     * @param servletresolverServletRoot servletresolverServletRoot
     * @param servletresolverCacheSize servletresolverCacheSize
     * @param servletresolverPaths servletresolverPaths
     * @param servletresolverDefaultExtensions servletresolverDefaultExtensions
     */
    public OrgApacheSlingServletsResolverSlingServletResolverProperties(
        ConfigNodePropertyString servletresolverServletRoot, 
        ConfigNodePropertyInteger servletresolverCacheSize, 
        ConfigNodePropertyArray servletresolverPaths, 
        ConfigNodePropertyArray servletresolverDefaultExtensions
    ) {
        this.servletresolverServletRoot = servletresolverServletRoot;
        this.servletresolverCacheSize = servletresolverCacheSize;
        this.servletresolverPaths = servletresolverPaths;
        this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
    }



    /**
     * Get servletresolverServletRoot
     * @return servletresolverServletRoot
     */
    public ConfigNodePropertyString getServletresolverServletRoot() {
        return servletresolverServletRoot;
    }

    public void setServletresolverServletRoot(ConfigNodePropertyString servletresolverServletRoot) {
        this.servletresolverServletRoot = servletresolverServletRoot;
    }

    /**
     * Get servletresolverCacheSize
     * @return servletresolverCacheSize
     */
    public ConfigNodePropertyInteger getServletresolverCacheSize() {
        return servletresolverCacheSize;
    }

    public void setServletresolverCacheSize(ConfigNodePropertyInteger servletresolverCacheSize) {
        this.servletresolverCacheSize = servletresolverCacheSize;
    }

    /**
     * Get servletresolverPaths
     * @return servletresolverPaths
     */
    public ConfigNodePropertyArray getServletresolverPaths() {
        return servletresolverPaths;
    }

    public void setServletresolverPaths(ConfigNodePropertyArray servletresolverPaths) {
        this.servletresolverPaths = servletresolverPaths;
    }

    /**
     * Get servletresolverDefaultExtensions
     * @return servletresolverDefaultExtensions
     */
    public ConfigNodePropertyArray getServletresolverDefaultExtensions() {
        return servletresolverDefaultExtensions;
    }

    public void setServletresolverDefaultExtensions(ConfigNodePropertyArray servletresolverDefaultExtensions) {
        this.servletresolverDefaultExtensions = servletresolverDefaultExtensions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingServletsResolverSlingServletResolverProperties {\n");
        
        sb.append("    servletresolverServletRoot: ").append(toIndentedString(servletresolverServletRoot)).append("\n");
        sb.append("    servletresolverCacheSize: ").append(toIndentedString(servletresolverCacheSize)).append("\n");
        sb.append("    servletresolverPaths: ").append(toIndentedString(servletresolverPaths)).append("\n");
        sb.append("    servletresolverDefaultExtensions: ").append(toIndentedString(servletresolverDefaultExtensions)).append("\n");
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

