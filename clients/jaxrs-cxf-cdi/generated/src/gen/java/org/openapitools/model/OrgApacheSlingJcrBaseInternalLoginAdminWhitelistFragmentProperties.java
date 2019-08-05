package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties   {
  
  private ConfigNodePropertyString whitelistName = null;

  private ConfigNodePropertyArray whitelistBundles = null;


  /**
   **/
  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistName(ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("whitelist.name")
  public ConfigNodePropertyString getWhitelistName() {
    return whitelistName;
  }
  public void setWhitelistName(ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
  }


  /**
   **/
  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistBundles(ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("whitelist.bundles")
  public ConfigNodePropertyArray getWhitelistBundles() {
    return whitelistBundles;
  }
  public void setWhitelistBundles(ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties = (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties) o;
    return Objects.equals(whitelistName, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistName) &&
        Objects.equals(whitelistBundles, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistBundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelistName, whitelistBundles);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

