package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqAccountApiAccountManagementServiceProperties   {
  
  private ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod;
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail;
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail;

  public ComAdobeCqAccountApiAccountManagementServiceProperties () {

  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties (ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod, ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail, ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
  }

    
  @JsonProperty("cq.accountmanager.token.validity.period")
  public ConfigNodePropertyInteger getCqAccountmanagerTokenValidityPeriod() {
    return cqAccountmanagerTokenValidityPeriod;
  }
  public void setCqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
  }

    
  @JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewaccountMail() {
    return cqAccountmanagerConfigRequestnewaccountMail;
  }
  public void setCqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
  }

    
  @JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewpwdMail() {
    return cqAccountmanagerConfigRequestnewpwdMail;
  }
  public void setCqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAccountApiAccountManagementServiceProperties comAdobeCqAccountApiAccountManagementServiceProperties = (ComAdobeCqAccountApiAccountManagementServiceProperties) o;
    return Objects.equals(cqAccountmanagerTokenValidityPeriod, comAdobeCqAccountApiAccountManagementServiceProperties.cqAccountmanagerTokenValidityPeriod) &&
        Objects.equals(cqAccountmanagerConfigRequestnewaccountMail, comAdobeCqAccountApiAccountManagementServiceProperties.cqAccountmanagerConfigRequestnewaccountMail) &&
        Objects.equals(cqAccountmanagerConfigRequestnewpwdMail, comAdobeCqAccountApiAccountManagementServiceProperties.cqAccountmanagerConfigRequestnewpwdMail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAccountmanagerTokenValidityPeriod, cqAccountmanagerConfigRequestnewaccountMail, cqAccountmanagerConfigRequestnewpwdMail);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
