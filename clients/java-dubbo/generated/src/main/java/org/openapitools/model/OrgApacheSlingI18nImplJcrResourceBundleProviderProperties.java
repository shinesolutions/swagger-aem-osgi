package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("locale.default")
  private ConfigNodePropertyString localeDefault;

  @JsonProperty("preload.bundles")
  private ConfigNodePropertyBoolean preloadBundles;

  @JsonProperty("invalidation.delay")
  private ConfigNodePropertyInteger invalidationDelay;

  /**
   * 
   * @return localeDefault
   */
  public ConfigNodePropertyString getLocaleDefault() {
    return localeDefault;
  }

  public void setLocaleDefault(ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
  }

  /**
   * 
   * @return preloadBundles
   */
  public ConfigNodePropertyBoolean getPreloadBundles() {
    return preloadBundles;
  }

  public void setPreloadBundles(ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
  }

  /**
   * 
   * @return invalidationDelay
   */
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
    return Objects.equals(this.localeDefault, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.localeDefault) &&
        Objects.equals(this.preloadBundles, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.preloadBundles) &&
        Objects.equals(this.invalidationDelay, orgApacheSlingI18nImplJcrResourceBundleProviderProperties.invalidationDelay);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
