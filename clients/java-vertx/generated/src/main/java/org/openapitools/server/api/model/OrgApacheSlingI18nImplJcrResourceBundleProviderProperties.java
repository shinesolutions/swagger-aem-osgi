package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties   {
  
  private ConfigNodePropertyString localeDefault = null;
  private ConfigNodePropertyBoolean preloadBundles = null;
  private ConfigNodePropertyInteger invalidationDelay = null;

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties () {

  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties (ConfigNodePropertyString localeDefault, ConfigNodePropertyBoolean preloadBundles, ConfigNodePropertyInteger invalidationDelay) {
    this.localeDefault = localeDefault;
    this.preloadBundles = preloadBundles;
    this.invalidationDelay = invalidationDelay;
  }

    
  @JsonProperty("locale.default")
  public ConfigNodePropertyString getLocaleDefault() {
    return localeDefault;
  }
  public void setLocaleDefault(ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
  }

    
  @JsonProperty("preload.bundles")
  public ConfigNodePropertyBoolean getPreloadBundles() {
    return preloadBundles;
  }
  public void setPreloadBundles(ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
  }

    
  @JsonProperty("invalidation.delay")
  public ConfigNodePropertyInteger getInvalidationDelay() {
    return invalidationDelay;
  }
  public void setInvalidationDelay(ConfigNodePropertyInteger invalidationDelay) {
    this.invalidationDelay = invalidationDelay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingI18nImplJcrResourceBundleProviderProperties orgApacheSlingI18nImplJcrResourceBundleProviderProperties = (OrgApacheSlingI18nImplJcrResourceBundleProviderProperties) o;
    return Objects.equals(localeDefault, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.localeDefault) &&
        Objects.equals(preloadBundles, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.preloadBundles) &&
        Objects.equals(invalidationDelay, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.invalidationDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localeDefault, preloadBundles, invalidationDelay);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
