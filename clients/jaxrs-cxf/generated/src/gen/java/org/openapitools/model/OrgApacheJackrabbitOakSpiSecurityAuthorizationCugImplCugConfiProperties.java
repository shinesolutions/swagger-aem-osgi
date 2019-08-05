package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cugSupportedPaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cugEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger configurationRanking = null;
 /**
   * Get cugSupportedPaths
   * @return cugSupportedPaths
  **/
  @JsonProperty("cugSupportedPaths")
  public ConfigNodePropertyArray getCugSupportedPaths() {
    return cugSupportedPaths;
  }

  public void setCugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugSupportedPaths(ConfigNodePropertyArray cugSupportedPaths) {
    this.cugSupportedPaths = cugSupportedPaths;
    return this;
  }

 /**
   * Get cugEnabled
   * @return cugEnabled
  **/
  @JsonProperty("cugEnabled")
  public ConfigNodePropertyBoolean getCugEnabled() {
    return cugEnabled;
  }

  public void setCugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties cugEnabled(ConfigNodePropertyBoolean cugEnabled) {
    this.cugEnabled = cugEnabled;
    return this;
  }

 /**
   * Get configurationRanking
   * @return configurationRanking
  **/
  @JsonProperty("configurationRanking")
  public ConfigNodePropertyInteger getConfigurationRanking() {
    return configurationRanking;
  }

  public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties configurationRanking(ConfigNodePropertyInteger configurationRanking) {
    this.configurationRanking = configurationRanking;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties {\n");
    
    sb.append("    cugSupportedPaths: ").append(toIndentedString(cugSupportedPaths)).append("\n");
    sb.append("    cugEnabled: ").append(toIndentedString(cugEnabled)).append("\n");
    sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
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

