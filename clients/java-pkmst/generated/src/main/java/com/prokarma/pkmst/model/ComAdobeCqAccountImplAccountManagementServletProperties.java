package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqAccountImplAccountManagementServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqAccountImplAccountManagementServletProperties   {
  @JsonProperty("cq.accountmanager.config.informnewaccount.mail")
  private ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail = null;

  @JsonProperty("cq.accountmanager.config.informnewpwd.mail")
  private ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail = null;

  public ComAdobeCqAccountImplAccountManagementServletProperties cqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
    return this;
  }

   /**
   * Get cqAccountmanagerConfigInformnewaccountMail
   * @return cqAccountmanagerConfigInformnewaccountMail
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCqAccountmanagerConfigInformnewaccountMail() {
    return cqAccountmanagerConfigInformnewaccountMail;
  }

  public void setCqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
  }

  public ComAdobeCqAccountImplAccountManagementServletProperties cqAccountmanagerConfigInformnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail) {
    this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
    return this;
  }

   /**
   * Get cqAccountmanagerConfigInformnewpwdMail
   * @return cqAccountmanagerConfigInformnewpwdMail
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCqAccountmanagerConfigInformnewpwdMail() {
    return cqAccountmanagerConfigInformnewpwdMail;
  }

  public void setCqAccountmanagerConfigInformnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail) {
    this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAccountImplAccountManagementServletProperties comAdobeCqAccountImplAccountManagementServletProperties = (ComAdobeCqAccountImplAccountManagementServletProperties) o;
    return Objects.equals(this.cqAccountmanagerConfigInformnewaccountMail, comAdobeCqAccountImplAccountManagementServletProperties.cqAccountmanagerConfigInformnewaccountMail) &&
        Objects.equals(this.cqAccountmanagerConfigInformnewpwdMail, comAdobeCqAccountImplAccountManagementServletProperties.cqAccountmanagerConfigInformnewpwdMail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAccountmanagerConfigInformnewaccountMail, cqAccountmanagerConfigInformnewpwdMail);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

