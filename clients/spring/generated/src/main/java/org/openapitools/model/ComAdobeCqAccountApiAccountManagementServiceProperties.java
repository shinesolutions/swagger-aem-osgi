package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqAccountApiAccountManagementServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqAccountApiAccountManagementServiceProperties   {
  @JsonProperty("cq.accountmanager.token.validity.period")
  private ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod = null;

  @JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail = null;

  @JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail = null;

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
    return this;
  }

  /**
   * Get cqAccountmanagerTokenValidityPeriod
   * @return cqAccountmanagerTokenValidityPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqAccountmanagerTokenValidityPeriod() {
    return cqAccountmanagerTokenValidityPeriod;
  }

  public void setCqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
    return this;
  }

  /**
   * Get cqAccountmanagerConfigRequestnewaccountMail
   * @return cqAccountmanagerConfigRequestnewaccountMail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewaccountMail() {
    return cqAccountmanagerConfigRequestnewaccountMail;
  }

  public void setCqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
    return this;
  }

  /**
   * Get cqAccountmanagerConfigRequestnewpwdMail
   * @return cqAccountmanagerConfigRequestnewpwdMail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewpwdMail() {
    return cqAccountmanagerConfigRequestnewpwdMail;
  }

  public void setCqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAccountApiAccountManagementServiceProperties comAdobeCqAccountApiAccountManagementServiceProperties = (ComAdobeCqAccountApiAccountManagementServiceProperties) o;
    return Objects.equals(this.cqAccountmanagerTokenValidityPeriod, comAdobeCqAccountApiAccountManagementServiceProperties.cqAccountmanagerTokenValidityPeriod) &&
        Objects.equals(this.cqAccountmanagerConfigRequestnewaccountMail, comAdobeCqAccountApiAccountManagementServiceProperties.cqAccountmanagerConfigRequestnewaccountMail) &&
        Objects.equals(this.cqAccountmanagerConfigRequestnewpwdMail, comAdobeCqAccountApiAccountManagementServiceProperties.cqAccountmanagerConfigRequestnewpwdMail);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

