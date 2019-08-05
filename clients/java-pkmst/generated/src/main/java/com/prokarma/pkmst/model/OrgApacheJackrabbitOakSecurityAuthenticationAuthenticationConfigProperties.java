package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties   {
  @JsonProperty("org.apache.jackrabbit.oak.authentication.appName")
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName = null;

  @JsonProperty("org.apache.jackrabbit.oak.authentication.configSpiName")
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName = null;

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
    return this;
  }

   /**
   * Get orgApacheJackrabbitOakAuthenticationAppName
   * @return orgApacheJackrabbitOakAuthenticationAppName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationAppName() {
    return orgApacheJackrabbitOakAuthenticationAppName;
  }

  public void setOrgApacheJackrabbitOakAuthenticationAppName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationAppName) {
    this.orgApacheJackrabbitOakAuthenticationAppName = orgApacheJackrabbitOakAuthenticationAppName;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties orgApacheJackrabbitOakAuthenticationConfigSpiName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
    return this;
  }

   /**
   * Get orgApacheJackrabbitOakAuthenticationConfigSpiName
   * @return orgApacheJackrabbitOakAuthenticationConfigSpiName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthenticationConfigSpiName() {
    return orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }

  public void setOrgApacheJackrabbitOakAuthenticationConfigSpiName(ConfigNodePropertyString orgApacheJackrabbitOakAuthenticationConfigSpiName) {
    this.orgApacheJackrabbitOakAuthenticationConfigSpiName = orgApacheJackrabbitOakAuthenticationConfigSpiName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

