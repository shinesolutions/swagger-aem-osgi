package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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



@JsonTypeName("orgApacheSlingHapiImplHApiUtilImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHapiImplHApiUtilImplProperties   {
  private ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype;
  private ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype;
  private ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths;
  private ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl;
  private ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled;

  public OrgApacheSlingHapiImplHApiUtilImplProperties() {
  }

  /**
   **/
  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsResourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
    this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.hapi.tools.resourcetype")
  @Valid public ConfigNodePropertyString getOrgApacheSlingHapiToolsResourcetype() {
    return orgApacheSlingHapiToolsResourcetype;
  }

  @JsonProperty("org.apache.sling.hapi.tools.resourcetype")
  public void setOrgApacheSlingHapiToolsResourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
    this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
  }

  /**
   **/
  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsCollectionresourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype) {
    this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.hapi.tools.collectionresourcetype")
  @Valid public ConfigNodePropertyString getOrgApacheSlingHapiToolsCollectionresourcetype() {
    return orgApacheSlingHapiToolsCollectionresourcetype;
  }

  @JsonProperty("org.apache.sling.hapi.tools.collectionresourcetype")
  public void setOrgApacheSlingHapiToolsCollectionresourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype) {
    this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
  }

  /**
   **/
  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsSearchpaths(ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths) {
    this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.hapi.tools.searchpaths")
  @Valid public ConfigNodePropertyArray getOrgApacheSlingHapiToolsSearchpaths() {
    return orgApacheSlingHapiToolsSearchpaths;
  }

  @JsonProperty("org.apache.sling.hapi.tools.searchpaths")
  public void setOrgApacheSlingHapiToolsSearchpaths(ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths) {
    this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
  }

  /**
   **/
  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsExternalurl(ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl) {
    this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.hapi.tools.externalurl")
  @Valid public ConfigNodePropertyString getOrgApacheSlingHapiToolsExternalurl() {
    return orgApacheSlingHapiToolsExternalurl;
  }

  @JsonProperty("org.apache.sling.hapi.tools.externalurl")
  public void setOrgApacheSlingHapiToolsExternalurl(ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl) {
    this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
  }

  /**
   **/
  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsEnabled(ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled) {
    this.orgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.hapi.tools.enabled")
  @Valid public ConfigNodePropertyBoolean getOrgApacheSlingHapiToolsEnabled() {
    return orgApacheSlingHapiToolsEnabled;
  }

  @JsonProperty("org.apache.sling.hapi.tools.enabled")
  public void setOrgApacheSlingHapiToolsEnabled(ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled) {
    this.orgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiImplHApiUtilImplProperties = (OrgApacheSlingHapiImplHApiUtilImplProperties) o;
    return Objects.equals(this.orgApacheSlingHapiToolsResourcetype, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsResourcetype) &&
        Objects.equals(this.orgApacheSlingHapiToolsCollectionresourcetype, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsCollectionresourcetype) &&
        Objects.equals(this.orgApacheSlingHapiToolsSearchpaths, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsSearchpaths) &&
        Objects.equals(this.orgApacheSlingHapiToolsExternalurl, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsExternalurl) &&
        Objects.equals(this.orgApacheSlingHapiToolsEnabled, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingHapiToolsResourcetype, orgApacheSlingHapiToolsCollectionresourcetype, orgApacheSlingHapiToolsSearchpaths, orgApacheSlingHapiToolsExternalurl, orgApacheSlingHapiToolsEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHapiImplHApiUtilImplProperties {\n");
    
    sb.append("    orgApacheSlingHapiToolsResourcetype: ").append(toIndentedString(orgApacheSlingHapiToolsResourcetype)).append("\n");
    sb.append("    orgApacheSlingHapiToolsCollectionresourcetype: ").append(toIndentedString(orgApacheSlingHapiToolsCollectionresourcetype)).append("\n");
    sb.append("    orgApacheSlingHapiToolsSearchpaths: ").append(toIndentedString(orgApacheSlingHapiToolsSearchpaths)).append("\n");
    sb.append("    orgApacheSlingHapiToolsExternalurl: ").append(toIndentedString(orgApacheSlingHapiToolsExternalurl)).append("\n");
    sb.append("    orgApacheSlingHapiToolsEnabled: ").append(toIndentedString(orgApacheSlingHapiToolsEnabled)).append("\n");
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
