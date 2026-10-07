package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqAccountApiAccountManagementServiceProperties
 */

@JsonTypeName("comAdobeCqAccountApiAccountManagementServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqAccountApiAccountManagementServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail;

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerTokenValidityPeriod(@Nullable ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
    return this;
  }

  /**
   * Get cqAccountmanagerTokenValidityPeriod
   * @return cqAccountmanagerTokenValidityPeriod
   */
  @Valid 
  @Schema(name = "cq.accountmanager.token.validity.period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.accountmanager.token.validity.period")
  public @Nullable ConfigNodePropertyInteger getCqAccountmanagerTokenValidityPeriod() {
    return cqAccountmanagerTokenValidityPeriod;
  }

  @JsonProperty("cq.accountmanager.token.validity.period")
  public void setCqAccountmanagerTokenValidityPeriod(@Nullable ConfigNodePropertyInteger cqAccountmanagerTokenValidityPeriod) {
    this.cqAccountmanagerTokenValidityPeriod = cqAccountmanagerTokenValidityPeriod;
  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewaccountMail(@Nullable ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
    return this;
  }

  /**
   * Get cqAccountmanagerConfigRequestnewaccountMail
   * @return cqAccountmanagerConfigRequestnewaccountMail
   */
  @Valid 
  @Schema(name = "cq.accountmanager.config.requestnewaccount.mail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
  public @Nullable ConfigNodePropertyString getCqAccountmanagerConfigRequestnewaccountMail() {
    return cqAccountmanagerConfigRequestnewaccountMail;
  }

  @JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
  public void setCqAccountmanagerConfigRequestnewaccountMail(@Nullable ConfigNodePropertyString cqAccountmanagerConfigRequestnewaccountMail) {
    this.cqAccountmanagerConfigRequestnewaccountMail = cqAccountmanagerConfigRequestnewaccountMail;
  }

  public ComAdobeCqAccountApiAccountManagementServiceProperties cqAccountmanagerConfigRequestnewpwdMail(@Nullable ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
    this.cqAccountmanagerConfigRequestnewpwdMail = cqAccountmanagerConfigRequestnewpwdMail;
    return this;
  }

  /**
   * Get cqAccountmanagerConfigRequestnewpwdMail
   * @return cqAccountmanagerConfigRequestnewpwdMail
   */
  @Valid 
  @Schema(name = "cq.accountmanager.config.requestnewpwd.mail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
  public @Nullable ConfigNodePropertyString getCqAccountmanagerConfigRequestnewpwdMail() {
    return cqAccountmanagerConfigRequestnewpwdMail;
  }

  @JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
  public void setCqAccountmanagerConfigRequestnewpwdMail(@Nullable ConfigNodePropertyString cqAccountmanagerConfigRequestnewpwdMail) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

