package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqAccountImplAccountManagementServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqAccountImplAccountManagementServletProperties   {
  @JsonProperty("cq.accountmanager.config.informnewaccount.mail")
  @Valid

  private ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail;

  @JsonProperty("cq.accountmanager.config.informnewpwd.mail")
  @Valid

  private ConfigNodePropertyString cqAccountmanagerConfigInformnewpwdMail;

  public ComAdobeCqAccountImplAccountManagementServletProperties cqAccountmanagerConfigInformnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigInformnewaccountMail) {
    this.cqAccountmanagerConfigInformnewaccountMail = cqAccountmanagerConfigInformnewaccountMail;
    return this;
  }

   /**
   * Get cqAccountmanagerConfigInformnewaccountMail
   * @return cqAccountmanagerConfigInformnewaccountMail
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

