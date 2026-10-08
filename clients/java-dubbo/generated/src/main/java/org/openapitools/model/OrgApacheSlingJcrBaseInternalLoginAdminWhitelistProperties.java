package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("whitelist.bypass")
  private ConfigNodePropertyBoolean whitelistBypass;

  @JsonProperty("whitelist.bundles.regexp")
  private ConfigNodePropertyString whitelistBundlesRegexp;

  /**
   * 
   * @return whitelistBypass
   */
  public ConfigNodePropertyBoolean getWhitelistBypass() {
    return whitelistBypass;
  }

  public void setWhitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
  }

  /**
   * 
   * @return whitelistBundlesRegexp
   */
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
    return Objects.equals(this.whitelistBypass, orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.whitelistBypass) &&
        Objects.equals(this.whitelistBundlesRegexp, orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.whitelistBundlesRegexp);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
