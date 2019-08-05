package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString whitelistName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray whitelistBundles = null;
 /**
   * Get whitelistName
   * @return whitelistName
  **/
  @JsonProperty("whitelist.name")
  public ConfigNodePropertyString getWhitelistName() {
    return whitelistName;
  }

  public void setWhitelistName(ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistName(ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
    return this;
  }

 /**
   * Get whitelistBundles
   * @return whitelistBundles
  **/
  @JsonProperty("whitelist.bundles")
  public ConfigNodePropertyArray getWhitelistBundles() {
    return whitelistBundles;
  }

  public void setWhitelistBundles(ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
  }

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistBundles(ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {\n");
    
    sb.append("    whitelistName: ").append(toIndentedString(whitelistName)).append("\n");
    sb.append("    whitelistBundles: ").append(toIndentedString(whitelistBundles)).append("\n");
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

