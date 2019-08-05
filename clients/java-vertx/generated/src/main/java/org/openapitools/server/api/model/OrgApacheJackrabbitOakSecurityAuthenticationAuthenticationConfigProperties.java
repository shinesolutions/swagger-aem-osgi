package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties   {
  
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName = null;
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName = null;

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties () {

  }

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties (ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName, ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }

    
  @JsonProperty("org.apache.jackrabbit.oak.authentication.appName")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationAppName() {
    return orgApacheJackrabbitOakAuthenticationAppName;
  }
  public void setOrgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
  }

    
  @JsonProperty("org.apache.jackrabbit.oak.authentication.configSpiName")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationConfigSpiName() {
    return orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }
  public void setOrgApacheJackrabbitOakAuthenticationConfigSpiName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties = (OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties) o;
    return Objects.equals(orgApacheJackrabbitOakAuthenticationAppName, orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.orgApacheJackrabbitOakAuthenticationAppName) &&
        Objects.equals(orgApacheJackrabbitOakAuthenticationConfigSpiName, orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.orgApacheJackrabbitOakAuthenticationConfigSpiName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheJackrabbitOakAuthenticationAppName, orgApacheJackrabbitOakAuthenticationConfigSpiName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {\n");
    
    sb.append("    orgApacheJackrabbitOakAuthenticationAppName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationAppName)).append("\n");
    sb.append("    orgApacheJackrabbitOakAuthenticationConfigSpiName: ").append(toIndentedString(orgApacheJackrabbitOakAuthenticationConfigSpiName)).append("\n");
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
