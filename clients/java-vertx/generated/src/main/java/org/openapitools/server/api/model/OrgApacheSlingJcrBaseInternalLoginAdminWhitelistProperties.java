package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties   {
  
  private ConfigNodePropertyBoolean whitelistBypass = null;
  private ConfigNodePropertyString whitelistBundlesRegexp = null;

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties () {

  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties (ConfigNodePropertyBoolean whitelistBypass, ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBypass = whitelistBypass;
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
  }

    
  @JsonProperty("whitelist.bypass")
  public ConfigNodePropertyBoolean getWhitelistBypass() {
    return whitelistBypass;
  }
  public void setWhitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
  }

    
  @JsonProperty("whitelist.bundles.regexp")
  public ConfigNodePropertyString getWhitelistBundlesRegexp() {
    return whitelistBundlesRegexp;
  }
  public void setWhitelistBundlesRegexp(ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties = (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties) o;
    return Objects.equals(whitelistBypass, orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.whitelistBypass) &&
        Objects.equals(whitelistBundlesRegexp, orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.whitelistBundlesRegexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelistBypass, whitelistBundlesRegexp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {\n");
    
    sb.append("    whitelistBypass: ").append(toIndentedString(whitelistBypass)).append("\n");
    sb.append("    whitelistBundlesRegexp: ").append(toIndentedString(whitelistBundlesRegexp)).append("\n");
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
