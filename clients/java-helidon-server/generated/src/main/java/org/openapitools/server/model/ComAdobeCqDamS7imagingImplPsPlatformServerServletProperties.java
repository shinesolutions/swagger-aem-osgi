package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties   {

    private ConfigNodePropertyBoolean cacheEnable;
    private ConfigNodePropertyArray cacheRootPaths;
    private ConfigNodePropertyInteger cacheMaxSize;
    private ConfigNodePropertyInteger cacheMaxEntries;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.
     *
     * @param cacheEnable cacheEnable
     * @param cacheRootPaths cacheRootPaths
     * @param cacheMaxSize cacheMaxSize
     * @param cacheMaxEntries cacheMaxEntries
     */
    public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(
        ConfigNodePropertyBoolean cacheEnable, 
        ConfigNodePropertyArray cacheRootPaths, 
        ConfigNodePropertyInteger cacheMaxSize, 
        ConfigNodePropertyInteger cacheMaxEntries
    ) {
        this.cacheEnable = cacheEnable;
        this.cacheRootPaths = cacheRootPaths;
        this.cacheMaxSize = cacheMaxSize;
        this.cacheMaxEntries = cacheMaxEntries;
    }



    /**
     * Get cacheEnable
     * @return cacheEnable
     */
    public ConfigNodePropertyBoolean getCacheEnable() {
        return cacheEnable;
    }

    public void setCacheEnable(ConfigNodePropertyBoolean cacheEnable) {
        this.cacheEnable = cacheEnable;
    }

    /**
     * Get cacheRootPaths
     * @return cacheRootPaths
     */
    public ConfigNodePropertyArray getCacheRootPaths() {
        return cacheRootPaths;
    }

    public void setCacheRootPaths(ConfigNodePropertyArray cacheRootPaths) {
        this.cacheRootPaths = cacheRootPaths;
    }

    /**
     * Get cacheMaxSize
     * @return cacheMaxSize
     */
    public ConfigNodePropertyInteger getCacheMaxSize() {
        return cacheMaxSize;
    }

    public void setCacheMaxSize(ConfigNodePropertyInteger cacheMaxSize) {
        this.cacheMaxSize = cacheMaxSize;
    }

    /**
     * Get cacheMaxEntries
     * @return cacheMaxEntries
     */
    public ConfigNodePropertyInteger getCacheMaxEntries() {
        return cacheMaxEntries;
    }

    public void setCacheMaxEntries(ConfigNodePropertyInteger cacheMaxEntries) {
        this.cacheMaxEntries = cacheMaxEntries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {\n");
        
        sb.append("    cacheEnable: ").append(toIndentedString(cacheEnable)).append("\n");
        sb.append("    cacheRootPaths: ").append(toIndentedString(cacheRootPaths)).append("\n");
        sb.append("    cacheMaxSize: ").append(toIndentedString(cacheMaxSize)).append("\n");
        sb.append("    cacheMaxEntries: ").append(toIndentedString(cacheMaxEntries)).append("\n");
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

