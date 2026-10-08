package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties   {
  
  private ConfigNodePropertyBoolean whitelistBypass;

  private ConfigNodePropertyString whitelistBundlesRegexp;

  /**
   **/
  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("whitelist.bypass")
  public ConfigNodePropertyBoolean getWhitelistBypass() {
    return whitelistBypass;
  }
  public void setWhitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
  }


  /**
   **/
  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBundlesRegexp(ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

