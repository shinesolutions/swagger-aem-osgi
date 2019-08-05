package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingHapiImplHApiUtilImplProperties   {
  
  private @Valid ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype = null;
  private @Valid ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype = null;
  private @Valid ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths = null;
  private @Valid ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl = null;
  private @Valid ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled = null;

  /**
   **/
  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsResourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
    this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.hapi.tools.resourcetype")
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsResourcetype() {
    return orgApacheSlingHapiToolsResourcetype;
  }
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
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsCollectionresourcetype() {
    return orgApacheSlingHapiToolsCollectionresourcetype;
  }
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
  public ConfigNodePropertyArray getOrgApacheSlingHapiToolsSearchpaths() {
    return orgApacheSlingHapiToolsSearchpaths;
  }
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
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsExternalurl() {
    return orgApacheSlingHapiToolsExternalurl;
  }
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
  public ConfigNodePropertyBoolean getOrgApacheSlingHapiToolsEnabled() {
    return orgApacheSlingHapiToolsEnabled;
  }
  public void setOrgApacheSlingHapiToolsEnabled(ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled) {
    this.orgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiImplHApiUtilImplProperties = (OrgApacheSlingHapiImplHApiUtilImplProperties) o;
    return Objects.equals(orgApacheSlingHapiToolsResourcetype, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsResourcetype) &&
        Objects.equals(orgApacheSlingHapiToolsCollectionresourcetype, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsCollectionresourcetype) &&
        Objects.equals(orgApacheSlingHapiToolsSearchpaths, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsSearchpaths) &&
        Objects.equals(orgApacheSlingHapiToolsExternalurl, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsExternalurl) &&
        Objects.equals(orgApacheSlingHapiToolsEnabled, orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsEnabled);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

