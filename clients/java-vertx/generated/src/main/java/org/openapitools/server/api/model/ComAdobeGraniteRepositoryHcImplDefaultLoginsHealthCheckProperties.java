package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties   {
  
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyArray accountLogins = null;
  private ConfigNodePropertyArray consoleLogins = null;

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties () {

  }

  public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties (ConfigNodePropertyArray hcTags, ConfigNodePropertyArray accountLogins, ConfigNodePropertyArray consoleLogins) {
    this.hcTags = hcTags;
    this.accountLogins = accountLogins;
    this.consoleLogins = consoleLogins;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

    
  @JsonProperty("account.logins")
  public ConfigNodePropertyArray getAccountLogins() {
    return accountLogins;
  }
  public void setAccountLogins(ConfigNodePropertyArray accountLogins) {
    this.accountLogins = accountLogins;
  }

    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
