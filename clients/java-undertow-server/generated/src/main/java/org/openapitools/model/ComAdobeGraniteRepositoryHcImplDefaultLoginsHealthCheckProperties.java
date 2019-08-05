package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyArray accountLogins = null;
  private ConfigNodePropertyArray consoleLogins = null;

  /**
   **/
  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  /**
   **/
  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties accountLogins(ConfigNodePropertyArray accountLogins) {
    this.accountLogins = accountLogins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("account.logins")
  public ConfigNodePropertyArray getAccountLogins() {
    return accountLogins;
  }
  public void setAccountLogins(ConfigNodePropertyArray accountLogins) {
    this.accountLogins = accountLogins;
  }

  /**
   **/
  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties consoleLogins(ConfigNodePropertyArray consoleLogins) {
    this.consoleLogins = consoleLogins;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("console.logins")
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
    return Objects.equals(hcTags, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.hcTags) &&
        Objects.equals(accountLogins, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.accountLogins) &&
        Objects.equals(consoleLogins, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.consoleLogins);
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

