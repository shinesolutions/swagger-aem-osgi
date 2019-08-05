package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray hcTags = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray accountLogins = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray consoleLogins = null;
 /**
   * Get hcTags
   * @return hcTags
  **/
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

 /**
   * Get accountLogins
   * @return accountLogins
  **/
  @JsonProperty("account.logins")
  public ConfigNodePropertyArray getAccountLogins() {
    return accountLogins;
  }

  public void setAccountLogins(ConfigNodePropertyArray accountLogins) {
    this.accountLogins = accountLogins;
  }

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties accountLogins(ConfigNodePropertyArray accountLogins) {
    this.accountLogins = accountLogins;
    return this;
  }

 /**
   * Get consoleLogins
   * @return consoleLogins
  **/
  @JsonProperty("console.logins")
  public ConfigNodePropertyArray getConsoleLogins() {
    return consoleLogins;
  }

  public void setConsoleLogins(ConfigNodePropertyArray consoleLogins) {
    this.consoleLogins = consoleLogins;
  }

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties consoleLogins(ConfigNodePropertyArray consoleLogins) {
    this.consoleLogins = consoleLogins;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {\n");
    
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    accountLogins: ").append(toIndentedString(accountLogins)).append("\n");
    sb.append("    consoleLogins: ").append(toIndentedString(consoleLogins)).append("\n");
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

