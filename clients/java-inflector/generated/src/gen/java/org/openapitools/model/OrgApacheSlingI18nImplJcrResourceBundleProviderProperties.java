package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties   {
  @JsonProperty("locale.default")
  private ConfigNodePropertyString localeDefault;

  @JsonProperty("preload.bundles")
  private ConfigNodePropertyBoolean preloadBundles;

  @JsonProperty("invalidation.delay")
  private ConfigNodePropertyInteger invalidationDelay;

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties localeDefault(ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("locale.default")
  public ConfigNodePropertyString getLocaleDefault() {
    return localeDefault;
  }
  public void setLocaleDefault(ConfigNodePropertyString localeDefault) {
    this.localeDefault = localeDefault;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties preloadBundles(ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preload.bundles")
  public ConfigNodePropertyBoolean getPreloadBundles() {
    return preloadBundles;
  }
  public void setPreloadBundles(ConfigNodePropertyBoolean preloadBundles) {
    this.preloadBundles = preloadBundles;
  }

  /**
   **/
  public OrgApacheSlingI18nImplJcrResourceBundleProviderProperties invalidationDelay(ConfigNodePropertyInteger invalidationDelay) {
    this.invalidationDelay = invalidationDelay;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

