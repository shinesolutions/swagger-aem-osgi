package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingHapiImplHApiUtilImplProperties   {
  
  private ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype = null;
  private ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype = null;
  private ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths = null;
  private ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl = null;
  private ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled = null;

  /**
   **/
  
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

