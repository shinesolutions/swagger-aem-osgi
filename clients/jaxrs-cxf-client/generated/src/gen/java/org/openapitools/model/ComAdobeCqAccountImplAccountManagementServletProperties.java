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

public class ComAdobeCqAccountImplAccountManagementServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail = null;
 /**
   * Get cqAccountmanagerConfigInformnewaccountMail
   * @return cqAccountmanagerConfigInformnewaccountMail
  **/
  @JsonProperty("cq.accountmanager.config.informnewaccount.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigInformnewaccountMail() {
    return cqAccountmanagerConfigInformnewaccountMail;
  }

  public void setCqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
  }

  public ComAdobeCqAccountImplAccountManagementServletProperties cqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
    return this;
  }

 /**
   * Get cqAccountmanagerConfigInformnewpwdMail
   * @return cqAccountmanagerConfigInformnewpwdMail
  **/
  @JsonProperty("cq.accountmanager.config.informnewpwd.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigInformnewpwdMail() {
    return cqAccountmanagerConfigInformnewpwdMail;
  }

  public void setCqAccountmanagerConfigInformnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail) {
    this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
  }

  public ComAdobeCqAccountImplAccountManagementServletProperties cqAccountmanagerConfigInformnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail) {
    this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqAccountImplAccountManagementServletProperties {\n");
    
    sb.append("    cqAccountmanagerConfigInformnewaccountMail: ").append(toIndentedString(cqAccountmanagerConfigInformnewaccountMail)).append("\n");
    sb.append("    cqAccountmanagerConfigInformnewpwdMail: ").append(toIndentedString(cqAccountmanagerConfigInformnewpwdMail)).append("\n");
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

