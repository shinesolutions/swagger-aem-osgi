package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqAccountApiAccountManagementServiceProperties   {
  
  private ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod;
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail;
  private ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.accountmanager.token.validity.period")
  @Valid
  public ConfigNodePropertyInteger getCqAccountmanagerTokenValidityPeriod() {
    return cqAccountmanagerTokenValidityPeriod;
  }
  public void setCqAccountmanagerTokenValidityPeriod(ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
  @Valid
  public ConfigNodePropertyString getCqAccountmanagerConfigRequestnewaccountMail() {
    return cqAccountmanagerConfigRequestnewaccountMail;
  }
  public void setCqAccountmanagerConfigRequestnewaccountMail(ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
  @Valid
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

