/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyArray;
import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingHapiImplHApiUtilImplProperties {
  
  @SerializedName("org.apache.sling.hapi.tools.resourcetype")
  private ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype = null;
  @SerializedName("org.apache.sling.hapi.tools.collectionresourcetype")
  private ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype = null;
  @SerializedName("org.apache.sling.hapi.tools.searchpaths")
  private ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths = null;
  @SerializedName("org.apache.sling.hapi.tools.externalurl")
  private ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl = null;
  @SerializedName("org.apache.sling.hapi.tools.enabled")
  private ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsResourcetype() {
    return orgApacheSlingHapiToolsResourcetype;
  }
  public void setOrgApacheSlingHapiToolsResourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
    this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsCollectionresourcetype() {
    return orgApacheSlingHapiToolsCollectionresourcetype;
  }
  public void setOrgApacheSlingHapiToolsCollectionresourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype) {
    this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOrgApacheSlingHapiToolsSearchpaths() {
    return orgApacheSlingHapiToolsSearchpaths;
  }
  public void setOrgApacheSlingHapiToolsSearchpaths(ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths) {
    this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsExternalurl() {
    return orgApacheSlingHapiToolsExternalurl;
  }
  public void setOrgApacheSlingHapiToolsExternalurl(ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl) {
    this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOrgApacheSlingHapiToolsEnabled() {
    return orgApacheSlingHapiToolsEnabled;
  }
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
    return (this.orgApacheSlingHapiToolsResourcetype == null ? orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsResourcetype == null : this.orgApacheSlingHapiToolsResourcetype.equals(orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsResourcetype)) &&
        (this.orgApacheSlingHapiToolsCollectionresourcetype == null ? orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsCollectionresourcetype == null : this.orgApacheSlingHapiToolsCollectionresourcetype.equals(orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsCollectionresourcetype)) &&
        (this.orgApacheSlingHapiToolsSearchpaths == null ? orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsSearchpaths == null : this.orgApacheSlingHapiToolsSearchpaths.equals(orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsSearchpaths)) &&
        (this.orgApacheSlingHapiToolsExternalurl == null ? orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsExternalurl == null : this.orgApacheSlingHapiToolsExternalurl.equals(orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsExternalurl)) &&
        (this.orgApacheSlingHapiToolsEnabled == null ? orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsEnabled == null : this.orgApacheSlingHapiToolsEnabled.equals(orgApacheSlingHapiImplHApiUtilImplProperties.orgApacheSlingHapiToolsEnabled));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orgApacheSlingHapiToolsResourcetype == null ? 0: this.orgApacheSlingHapiToolsResourcetype.hashCode());
    result = 31 * result + (this.orgApacheSlingHapiToolsCollectionresourcetype == null ? 0: this.orgApacheSlingHapiToolsCollectionresourcetype.hashCode());
    result = 31 * result + (this.orgApacheSlingHapiToolsSearchpaths == null ? 0: this.orgApacheSlingHapiToolsSearchpaths.hashCode());
    result = 31 * result + (this.orgApacheSlingHapiToolsExternalurl == null ? 0: this.orgApacheSlingHapiToolsExternalurl.hashCode());
    result = 31 * result + (this.orgApacheSlingHapiToolsEnabled == null ? 0: this.orgApacheSlingHapiToolsEnabled.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHapiImplHApiUtilImplProperties {\n");
    
    sb.append("  orgApacheSlingHapiToolsResourcetype: ").append(orgApacheSlingHapiToolsResourcetype).append("\n");
    sb.append("  orgApacheSlingHapiToolsCollectionresourcetype: ").append(orgApacheSlingHapiToolsCollectionresourcetype).append("\n");
    sb.append("  orgApacheSlingHapiToolsSearchpaths: ").append(orgApacheSlingHapiToolsSearchpaths).append("\n");
    sb.append("  orgApacheSlingHapiToolsExternalurl: ").append(orgApacheSlingHapiToolsExternalurl).append("\n");
    sb.append("  orgApacheSlingHapiToolsEnabled: ").append(orgApacheSlingHapiToolsEnabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}