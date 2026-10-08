package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties   {
  @JsonProperty("whitelist.bypass")
  @Valid

  private ConfigNodePropertyBoolean whitelistBypass;

  @JsonProperty("whitelist.bundles.regexp")
  @Valid

  private ConfigNodePropertyString whitelistBundlesRegexp;

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
    return this;
  }

   /**
   * Get whitelistBypass
   * @return whitelistBypass
  **/
  public ConfigNodePropertyBoolean getWhitelistBypass() {
    return whitelistBypass;
  }

  public void setWhitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBundlesRegexp(ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
    return this;
  }

   /**
   * Get whitelistBundlesRegexp
   * @return whitelistBundlesRegexp
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

