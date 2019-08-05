package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqAccountImplAccountManagementServletProperties   {
  
  private ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail = null;
  private ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail = null;

  public ComAdobeCqAccountImplAccountManagementServletProperties () {

  }

  public ComAdobeCqAccountImplAccountManagementServletProperties (ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail, ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
    this.cqAccountmanagerConfigInformnewpwdMail = cqAccountmanagerConfigInformnewpwdMail;
  }

    
  @JsonProperty("cq.accountmanager.config.informnewaccount.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigInformnewaccountMail() {
    return cqAccountmanagerConfigInformnewaccountMail;
  }
  public void setCqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
  }

    
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
