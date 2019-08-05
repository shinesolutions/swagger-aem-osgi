package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties   {
  @JsonProperty("hc.tags")
  private ConfigNodePropertyArray hcTags = null;

  @JsonProperty("account.logins")
  private ConfigNodePropertyArray accountLogins = null;

  @JsonProperty("console.logins")
  private ConfigNodePropertyArray consoleLogins = null;

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getConsoleLogins() {
    return consoleLogins;
  }

  public void setConsoleLogins(ConfigNodePropertyArray consoleLogins) {
    this.consoleLogins = consoleLogins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

