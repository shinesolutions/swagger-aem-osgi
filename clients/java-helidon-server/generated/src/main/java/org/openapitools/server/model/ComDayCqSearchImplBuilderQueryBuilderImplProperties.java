package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqSearchImplBuilderQueryBuilderImplProperties   {

    private ConfigNodePropertyArray excerptProperties;
    private ConfigNodePropertyInteger cacheMaxEntries;
    private ConfigNodePropertyInteger cacheEntryLifetime;
    private ConfigNodePropertyBoolean xpathUnion;

    /**
     * Default constructor.
     */
    public ComDayCqSearchImplBuilderQueryBuilderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqSearchImplBuilderQueryBuilderImplProperties.
     *
     * @param excerptProperties excerptProperties
     * @param cacheMaxEntries cacheMaxEntries
     * @param cacheEntryLifetime cacheEntryLifetime
     * @param xpathUnion xpathUnion
     */
    public ComDayCqSearchImplBuilderQueryBuilderImplProperties(
        ConfigNodePropertyArray excerptProperties, 
        ConfigNodePropertyInteger cacheMaxEntries, 
        ConfigNodePropertyInteger cacheEntryLifetime, 
        ConfigNodePropertyBoolean xpathUnion
    ) {
        this.excerptProperties = excerptProperties;
        this.cacheMaxEntries = cacheMaxEntries;
        this.cacheEntryLifetime = cacheEntryLifetime;
        this.xpathUnion = xpathUnion;
    }



    /**
     * Get excerptProperties
     * @return excerptProperties
     */
    public ConfigNodePropertyArray getExcerptProperties() {
        return excerptProperties;
    }

    public void setExcerptProperties(ConfigNodePropertyArray excerptProperties) {
        this.excerptProperties = excerptProperties;
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
     * Get cacheEntryLifetime
     * @return cacheEntryLifetime
     */
    public ConfigNodePropertyInteger getCacheEntryLifetime() {
        return cacheEntryLifetime;
    }

    public void setCacheEntryLifetime(ConfigNodePropertyInteger cacheEntryLifetime) {
        this.cacheEntryLifetime = cacheEntryLifetime;
    }

    /**
     * Get xpathUnion
     * @return xpathUnion
     */
    public ConfigNodePropertyBoolean getXpathUnion() {
        return xpathUnion;
    }

    public void setXpathUnion(ConfigNodePropertyBoolean xpathUnion) {
        this.xpathUnion = xpathUnion;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqSearchImplBuilderQueryBuilderImplProperties {\n");
        
        sb.append("    excerptProperties: ").append(toIndentedString(excerptProperties)).append("\n");
        sb.append("    cacheMaxEntries: ").append(toIndentedString(cacheMaxEntries)).append("\n");
        sb.append("    cacheEntryLifetime: ").append(toIndentedString(cacheEntryLifetime)).append("\n");
        sb.append("    xpathUnion: ").append(toIndentedString(xpathUnion)).append("\n");
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

