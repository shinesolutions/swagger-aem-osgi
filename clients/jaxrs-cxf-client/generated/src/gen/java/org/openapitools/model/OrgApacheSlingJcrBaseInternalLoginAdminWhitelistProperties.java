package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean whitelistBypass = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString whitelistBundlesRegexp = null;
 /**
   * Get whitelistBypass
   * @return whitelistBypass
  **/
  @JsonProperty("whitelist.bypass")
  public ConfigNodePropertyBoolean getWhitelistBypass() {
    return whitelistBypass;
  }

  public void setWhitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
    this.whitelistBypass = whitelistBypass;
    return this;
  }

 /**
   * Get whitelistBundlesRegexp
   * @return whitelistBundlesRegexp
  **/
  @JsonProperty("whitelist.bundles.regexp")
  public ConfigNodePropertyString getWhitelistBundlesRegexp() {
    return whitelistBundlesRegexp;
  }

  public void setWhitelistBundlesRegexp(ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties whitelistBundlesRegexp(ConfigNodePropertyString whitelistBundlesRegexp) {
    this.whitelistBundlesRegexp = whitelistBundlesRegexp;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

