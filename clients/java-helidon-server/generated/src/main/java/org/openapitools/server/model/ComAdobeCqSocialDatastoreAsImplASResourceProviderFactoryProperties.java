package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties   {

    private ConfigNodePropertyString versionId;
    private ConfigNodePropertyBoolean cacheOn;
    private ConfigNodePropertyInteger concurrencyLevel;
    private ConfigNodePropertyInteger cacheStartSize;
    private ConfigNodePropertyInteger cacheTtl;
    private ConfigNodePropertyInteger cacheSize;
    private ConfigNodePropertyInteger timeLimit;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.
     *
     * @param versionId versionId
     * @param cacheOn cacheOn
     * @param concurrencyLevel concurrencyLevel
     * @param cacheStartSize cacheStartSize
     * @param cacheTtl cacheTtl
     * @param cacheSize cacheSize
     * @param timeLimit timeLimit
     */
    public ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(
        ConfigNodePropertyString versionId, 
        ConfigNodePropertyBoolean cacheOn, 
        ConfigNodePropertyInteger concurrencyLevel, 
        ConfigNodePropertyInteger cacheStartSize, 
        ConfigNodePropertyInteger cacheTtl, 
        ConfigNodePropertyInteger cacheSize, 
        ConfigNodePropertyInteger timeLimit
    ) {
        this.versionId = versionId;
        this.cacheOn = cacheOn;
        this.concurrencyLevel = concurrencyLevel;
        this.cacheStartSize = cacheStartSize;
        this.cacheTtl = cacheTtl;
        this.cacheSize = cacheSize;
        this.timeLimit = timeLimit;
    }



    /**
     * Get versionId
     * @return versionId
     */
    public ConfigNodePropertyString getVersionId() {
        return versionId;
    }

    public void setVersionId(ConfigNodePropertyString versionId) {
        this.versionId = versionId;
    }

    /**
     * Get cacheOn
     * @return cacheOn
     */
    public ConfigNodePropertyBoolean getCacheOn() {
        return cacheOn;
    }

    public void setCacheOn(ConfigNodePropertyBoolean cacheOn) {
        this.cacheOn = cacheOn;
    }

    /**
     * Get concurrencyLevel
     * @return concurrencyLevel
     */
    public ConfigNodePropertyInteger getConcurrencyLevel() {
        return concurrencyLevel;
    }

    public void setConcurrencyLevel(ConfigNodePropertyInteger concurrencyLevel) {
        this.concurrencyLevel = concurrencyLevel;
    }

    /**
     * Get cacheStartSize
     * @return cacheStartSize
     */
    public ConfigNodePropertyInteger getCacheStartSize() {
        return cacheStartSize;
    }

    public void setCacheStartSize(ConfigNodePropertyInteger cacheStartSize) {
        this.cacheStartSize = cacheStartSize;
    }

    /**
     * Get cacheTtl
     * @return cacheTtl
     */
    public ConfigNodePropertyInteger getCacheTtl() {
        return cacheTtl;
    }

    public void setCacheTtl(ConfigNodePropertyInteger cacheTtl) {
        this.cacheTtl = cacheTtl;
    }

    /**
     * Get cacheSize
     * @return cacheSize
     */
    public ConfigNodePropertyInteger getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(ConfigNodePropertyInteger cacheSize) {
        this.cacheSize = cacheSize;
    }

    /**
     * Get timeLimit
     * @return timeLimit
     */
    public ConfigNodePropertyInteger getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(ConfigNodePropertyInteger timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {\n");
        
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    cacheOn: ").append(toIndentedString(cacheOn)).append("\n");
        sb.append("    concurrencyLevel: ").append(toIndentedString(concurrencyLevel)).append("\n");
        sb.append("    cacheStartSize: ").append(toIndentedString(cacheStartSize)).append("\n");
        sb.append("    cacheTtl: ").append(toIndentedString(cacheTtl)).append("\n");
        sb.append("    cacheSize: ").append(toIndentedString(cacheSize)).append("\n");
        sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
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

