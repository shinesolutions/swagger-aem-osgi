package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString securityPreferencesName;
 /**
   * Get securityPreferencesName
   * @return securityPreferencesName
  **/
  @JsonProperty("security.preferences.name")
  public ConfigNodePropertyString getSecurityPreferencesName() {
    return securityPreferencesName;
  }

  public void setSecurityPreferencesName(ConfigNodePropertyString securityPreferencesName) {
    this.securityPreferencesName = securityPreferencesName;
  }

  public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties securityPreferencesName(ConfigNodePropertyString securityPreferencesName) {
    this.securityPreferencesName = securityPreferencesName;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties = (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties) o;
    return Objects.equals(this.securityPreferencesName, comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.securityPreferencesName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityPreferencesName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {\n");
    
    sb.append("    securityPreferencesName: ").append(toIndentedString(securityPreferencesName)).append("\n");
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

