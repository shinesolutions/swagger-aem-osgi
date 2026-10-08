package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties   {
  private ConfigNodePropertyString whitelistName;
  private ConfigNodePropertyArray whitelistBundles;

  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties() {
  }

  /**
   **/
  public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties whitelistName(ConfigNodePropertyString whitelistName) {
    this.whitelistName = whitelistName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("whitelist.name")
  @Valid public ConfigNodePropertyString getWhitelistName() {
    return whitelistName;
  }

  @JsonProperty("whitelist.name")
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
  @Valid public ConfigNodePropertyArray getWhitelistBundles() {
    return whitelistBundles;
  }

  @JsonProperty("whitelist.bundles")
  public void setWhitelistBundles(ConfigNodePropertyArray whitelistBundles) {
    this.whitelistBundles = whitelistBundles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties = (OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties) o;
    return Objects.equals(this.whitelistName, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistName) &&
        Objects.equals(this.whitelistBundles, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.whitelistBundles);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
