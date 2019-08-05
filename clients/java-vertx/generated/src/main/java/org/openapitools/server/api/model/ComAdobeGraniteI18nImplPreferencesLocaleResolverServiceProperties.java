package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties   {
  
  private ConfigNodePropertyString securityPreferencesName = null;

  public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties () {

  }

  public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties (ConfigNodePropertyString securityPreferencesName) {
    this.securityPreferencesName = securityPreferencesName;
  }

    
  @JsonProperty("security.preferences.name")
  public ConfigNodePropertyString getSecurityPreferencesName() {
    return securityPreferencesName;
  }
  public void setSecurityPreferencesName(ConfigNodePropertyString securityPreferencesName) {
    this.securityPreferencesName = securityPreferencesName;
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
    return Objects.equals(securityPreferencesName, comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.securityPreferencesName);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
