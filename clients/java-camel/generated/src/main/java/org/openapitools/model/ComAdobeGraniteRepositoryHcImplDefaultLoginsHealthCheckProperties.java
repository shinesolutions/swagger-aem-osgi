package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
 */

@JsonTypeName("comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {

  private ConfigNodePropertyArray hcTags;

  private ConfigNodePropertyArray accountLogins;

  private ConfigNodePropertyArray consoleLogins;

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties accountLogins(ConfigNodePropertyArray accountLogins) {
    this.accountLogins = accountLogins;
    return this;
  }

  /**
   * Get accountLogins
   * @return accountLogins
   */
  @Valid 
  @Schema(name = "account.logins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account.logins")
  public ConfigNodePropertyArray getAccountLogins() {
    return accountLogins;
  }

  public void setAccountLogins(ConfigNodePropertyArray accountLogins) {
    this.accountLogins = accountLogins;
  }

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties consoleLogins(ConfigNodePropertyArray consoleLogins) {
    this.consoleLogins = consoleLogins;
    return this;
  }

  /**
   * Get consoleLogins
   * @return consoleLogins
   */
  @Valid 
  @Schema(name = "console.logins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("console.logins")
  public ConfigNodePropertyArray getConsoleLogins() {
    return consoleLogins;
  }

  public void setConsoleLogins(ConfigNodePropertyArray consoleLogins) {
    this.consoleLogins = consoleLogins;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties = (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.hcTags) &&
        Objects.equals(this.accountLogins, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.accountLogins) &&
        Objects.equals(this.consoleLogins, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.consoleLogins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, accountLogins, consoleLogins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    accountLogins: ").append(toIndentedString(accountLogins)).append("\n");
    sb.append("    consoleLogins: ").append(toIndentedString(consoleLogins)).append("\n");
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

