package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties   {

    private ConfigNodePropertyString localeDefault;
    private ConfigNodePropertyBoolean preloadBundles;
    private ConfigNodePropertyInteger invalidationDelay;

    /**
     * Default constructor.
     */
    public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.
     *
     * @param localeDefault localeDefault
     * @param preloadBundles preloadBundles
     * @param invalidationDelay invalidationDelay
     */
    public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(
        ConfigNodePropertyString localeDefault, 
        ConfigNodePropertyBoolean preloadBundles, 
        ConfigNodePropertyInteger invalidationDelay
    ) {
        this.localeDefault = localeDefault;
        this.preloadBundles = preloadBundles;
        this.invalidationDelay = invalidationDelay;
    }



    /**
     * Get localeDefault
     * @return localeDefault
     */
    public ConfigNodePropertyString getLocaleDefault() {
        return localeDefault;
    }

    public void setLocaleDefault(ConfigNodePropertyString localeDefault) {
        this.localeDefault = localeDefault;
    }

    /**
     * Get preloadBundles
     * @return preloadBundles
     */
    public ConfigNodePropertyBoolean getPreloadBundles() {
        return preloadBundles;
    }

    public void setPreloadBundles(ConfigNodePropertyBoolean preloadBundles) {
        this.preloadBundles = preloadBundles;
    }

    /**
     * Get invalidationDelay
     * @return invalidationDelay
     */
    public ConfigNodePropertyInteger getInvalidationDelay() {
        return invalidationDelay;
    }

    public void setInvalidationDelay(ConfigNodePropertyInteger invalidationDelay) {
        this.invalidationDelay = invalidationDelay;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {\n");
        
        sb.append("    localeDefault: ").append(toIndentedString(localeDefault)).append("\n");
        sb.append("    preloadBundles: ").append(toIndentedString(preloadBundles)).append("\n");
        sb.append("    invalidationDelay: ").append(toIndentedString(invalidationDelay)).append("\n");
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

