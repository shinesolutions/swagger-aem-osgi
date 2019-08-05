package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties   {
  @JsonProperty("locale.default")
  private ConfigNodePropertyString localeDefault = null;

  @JsonProperty("preload.bundles")
  private ConfigNodePropertyBoolean preloadBundles = null;

  @JsonProperty("invalidation.delay")
  private ConfigNodePropertyInteger invalidationDelay = null;

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties localeDefault(ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
    return this;
  }

   /**
   * Get localeDefault
   * @return localeDefault
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getLocaleDefault() {
    return localeDefault;
  }

  public void setLocaleDefault(ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties preloadBundles(ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
    return this;
  }

   /**
   * Get preloadBundles
   * @return preloadBundles
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPreloadBundles() {
    return preloadBundles;
  }

  public void setPreloadBundles(ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
  }

  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties invalidationDelay(ConfigNodePropertyInteger invalidationDelay) {
    this.invalidationDelay = invalidationDelay;
    return this;
  }

   /**
   * Get invalidationDelay
   * @return invalidationDelay
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getInvalidationDelay() {
    return invalidationDelay;
  }

  public void setInvalidationDelay(ConfigNodePropertyInteger invalidationDelay) {
    this.invalidationDelay = invalidationDelay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

