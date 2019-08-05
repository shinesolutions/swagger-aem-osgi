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

public class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName = null;
 /**
   * Get orgApacheJackrabbitOakAuthenticationAppName
   * @return orgApacheJackrabbitOakAuthenticationAppName
  **/
  @JsonProperty("org.apache.jackrabbit.oak.authentication.appName")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationAppName() {
    return orgApacheJackrabbitOakAuthenticationAppName;
  }

  public void setOrgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
    return this;
  }

 /**
   * Get orgApacheJackrabbitOakAuthenticationConfigSpiName
   * @return orgApacheJackrabbitOakAuthenticationConfigSpiName
  **/
  @JsonProperty("org.apache.jackrabbit.oak.authentication.configSpiName")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationConfigSpiName() {
    return orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }

  public void setOrgApacheJackrabbitOakAuthenticationConfigSpiName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakAuthenticationConfigSpiName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {\n");
    
    sb.append("    orgApacheJackrabbitOakAuthenticationAppName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationAppName)).append("\n");
    sb.append("    orgApacheJackrabbitOakAuthenticationConfigSpiName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationConfigSpiName)).append("\n");
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

