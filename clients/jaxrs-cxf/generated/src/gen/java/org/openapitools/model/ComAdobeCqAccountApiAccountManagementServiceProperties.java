package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
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

public class ComAdobeCqAccountApiAccountManagementServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail = null;
 /**
   * Get cqAccountmanagerTokenValidityPeriod
   * @return cqAccountmanagerTokenValidityPeriod
  **/
  @JsonProperty("cq.accountmanager.token.validity.period")
  public ConfigNodePropertyInteger getCqAccountmanagerTokenValidityPeriod() {
    return cqAccountmanagerTokenValidityPeriod;
  }

  public void setCqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
    return this;
  }

 /**
   * Get cqAccountmanagerConfigRequestnewaccountMail
   * @return cqAccountmanagerConfigRequestnewaccountMail
  **/
  @JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewaccountMail() {
    return cqAccountmanagerConfigRequestnewaccountMail;
  }

  public void setCqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
    return this;
  }

 /**
   * Get cqAccountmanagerConfigRequestnewpwdMail
   * @return cqAccountmanagerConfigRequestnewpwdMail
  **/
  @JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewpwdMail() {
    return cqAccountmanagerConfigRequestnewpwdMail;
  }

  public void setCqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqAccountApiAccountManagementServiceProperties {\n");
    
    sb.append("    cqAccountmanagerTokenValidityPeriod: ").append(toIndentedString(cqAccountmanagerTokenValidityPeriod)).append("\n");
    sb.append("    cqAccountmanagerConfigRequestnewaccountMail: ").append(toIndentedString(cqAccountmanagerConfigRequestnewaccountMail)).append("\n");
    sb.append("    cqAccountmanagerConfigRequestnewpwdMail: ").append(toIndentedString(cqAccountmanagerConfigRequestnewpwdMail)).append("\n");
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

