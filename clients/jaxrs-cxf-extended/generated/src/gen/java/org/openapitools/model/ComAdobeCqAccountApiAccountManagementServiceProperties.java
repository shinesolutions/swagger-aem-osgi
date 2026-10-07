package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqAccountApiAccountManagementServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail;
 /**
  * Get cqAccountmanagerTokenValidityPeriod
  * @return cqAccountmanagerTokenValidityPeriod
  */
  @JsonProperty("cq.accountmanager.token.validity.period")
  public ConfigNodePropertyInteger getCqAccountmanagerTokenValidityPeriod() {
    return cqAccountmanagerTokenValidityPeriod;
  }

  /**
   * Sets the <code>cqAccountmanagerTokenValidityPeriod</code> property.
   */
 public void setCqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
  }

  /**
   * Sets the <code>cqAccountmanagerTokenValidityPeriod</code> property.
   */
  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
    return this;
  }

 /**
  * Get cqAccountmanagerConfigRequestnewaccountMail
  * @return cqAccountmanagerConfigRequestnewaccountMail
  */
  @JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewaccountMail() {
    return cqAccountmanagerConfigRequestnewaccountMail;
  }

  /**
   * Sets the <code>cqAccountmanagerConfigRequestnewaccountMail</code> property.
   */
 public void setCqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
  }

  /**
   * Sets the <code>cqAccountmanagerConfigRequestnewaccountMail</code> property.
   */
  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
    return this;
  }

 /**
  * Get cqAccountmanagerConfigRequestnewpwdMail
  * @return cqAccountmanagerConfigRequestnewpwdMail
  */
  @JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewpwdMail() {
    return cqAccountmanagerConfigRequestnewpwdMail;
  }

  /**
   * Sets the <code>cqAccountmanagerConfigRequestnewpwdMail</code> property.
   */
 public void setCqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
  }

  /**
   * Sets the <code>cqAccountmanagerConfigRequestnewpwdMail</code> property.
   */
  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewpwdMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

