package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingHapiImplHApiUtilImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("org.apache.sling.hapi.tools.resourcetype")
  private ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype;

  @JsonProperty("org.apache.sling.hapi.tools.collectionresourcetype")
  private ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype;

  @JsonProperty("org.apache.sling.hapi.tools.searchpaths")
  private ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths;

  @JsonProperty("org.apache.sling.hapi.tools.externalurl")
  private ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl;

  @JsonProperty("org.apache.sling.hapi.tools.enabled")
  private ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled;

  /**
   * 
   * @return orgApacheSlingHapiToolsResourcetype
   */
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsResourcetype() {
    return orgApacheSlingHapiToolsResourcetype;
  }

  public void setOrgApacheSlingHapiToolsResourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
    this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
  }

  /**
   * 
   * @return orgApacheSlingHapiToolsCollectionresourcetype
   */
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsCollectionresourcetype() {
    return orgApacheSlingHapiToolsCollectionresourcetype;
  }

  public void setOrgApacheSlingHapiToolsCollectionresourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype) {
    this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
  }

  /**
   * 
   * @return orgApacheSlingHapiToolsSearchpaths
   */
  public ConfigNodePropertyArray getOrgApacheSlingHapiToolsSearchpaths() {
    return orgApacheSlingHapiToolsSearchpaths;
  }

  public void setOrgApacheSlingHapiToolsSearchpaths(ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths) {
    this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
  }

  /**
   * 
   * @return orgApacheSlingHapiToolsExternalurl
   */
  public ConfigNodePropertyString getOrgApacheSlingHapiToolsExternalurl() {
    return orgApacheSlingHapiToolsExternalurl;
  }

  public void setOrgApacheSlingHapiToolsExternalurl(ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl) {
    this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
  }

  /**
   * 
   * @return orgApacheSlingHapiToolsEnabled
   */
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
