package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("org.apache.jackrabbit.oak.authentication.appName")
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName;

  @JsonProperty("org.apache.jackrabbit.oak.authentication.configSpiName")
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName;

  /**
   * 
   * @return orgApacheJackrabbitOakAuthenticationAppName
   */
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationAppName() {
    return orgApacheJackrabbitOakAuthenticationAppName;
  }

  public void setOrgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
  }

  /**
   * 
   * @return orgApacheJackrabbitOakAuthenticationConfigSpiName
   */
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
    return Objects.equals(this.orgApacheJackrabbitOakAuthenticationAppName, orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.orgApacheJackrabbitOakAuthenticationAppName) &&
        Objects.equals(this.orgApacheJackrabbitOakAuthenticationConfigSpiName, orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.orgApacheJackrabbitOakAuthenticationConfigSpiName);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
