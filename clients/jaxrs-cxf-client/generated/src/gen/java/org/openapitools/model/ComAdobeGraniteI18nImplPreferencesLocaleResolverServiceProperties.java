package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString securityPreferencesName = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

