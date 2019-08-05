package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqAccountImplAccountManagementServletProperties   {
  

  private ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail = null;

  private ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.accountmanager.config.informnewaccount.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigInformnewaccountMail() {
    return cqAccountmanagerConfigInformnewaccountMail;
  }
  public void setCqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.accountmanager.config.informnewpwd.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigInformnewpwdMail() {
    return cqAccountmanagerConfigInformnewpwdMail;
  }
  public void setCqAccountmanagerConfigInformnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail) {
    this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAccountImplAccountManagementServletProperties comAdobeCqAccountImplAccountManagementServletProperties = (ComAdobeCqAccountImplAccountManagementServletProperties) o;
    return Objects.equals(cqAccountmanagerConfigInformnewaccountMail, comAdobeCqAccountImplAccountManagementServletProperties.cqAccountmanagerConfigInformnewaccountMail) &&
        Objects.equals(cqAccountmanagerConfigInformnewpwdMail, comAdobeCqAccountImplAccountManagementServletProperties.cqAccountmanagerConfigInformnewpwdMail);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

