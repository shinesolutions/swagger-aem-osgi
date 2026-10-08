package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingHapiImplHApiUtilImplProperties
 */

@JsonTypeName("orgApacheSlingHapiImplHApiUtilImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHapiImplHApiUtilImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled;

  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsResourcetype(@Nullable ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
    this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
    return this;
  }

  /**
   * Get orgApacheSlingHapiToolsResourcetype
   * @return orgApacheSlingHapiToolsResourcetype
   */
  @Valid 
  @Schema(name = "org.apache.sling.hapi.tools.resourcetype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.hapi.tools.resourcetype")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingHapiToolsResourcetype() {
    return orgApacheSlingHapiToolsResourcetype;
  }

  @JsonProperty("org.apache.sling.hapi.tools.resourcetype")
  public void setOrgApacheSlingHapiToolsResourcetype(@Nullable ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
    this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
  }

  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsCollectionresourcetype(@Nullable ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype) {
    this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
    return this;
  }

  /**
   * Get orgApacheSlingHapiToolsCollectionresourcetype
   * @return orgApacheSlingHapiToolsCollectionresourcetype
   */
  @Valid 
  @Schema(name = "org.apache.sling.hapi.tools.collectionresourcetype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.hapi.tools.collectionresourcetype")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingHapiToolsCollectionresourcetype() {
    return orgApacheSlingHapiToolsCollectionresourcetype;
  }

  @JsonProperty("org.apache.sling.hapi.tools.collectionresourcetype")
  public void setOrgApacheSlingHapiToolsCollectionresourcetype(@Nullable ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype) {
    this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
  }

  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsSearchpaths(@Nullable ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths) {
    this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
    return this;
  }

  /**
   * Get orgApacheSlingHapiToolsSearchpaths
   * @return orgApacheSlingHapiToolsSearchpaths
   */
  @Valid 
  @Schema(name = "org.apache.sling.hapi.tools.searchpaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.hapi.tools.searchpaths")
  public @Nullable ConfigNodePropertyArray getOrgApacheSlingHapiToolsSearchpaths() {
    return orgApacheSlingHapiToolsSearchpaths;
  }

  @JsonProperty("org.apache.sling.hapi.tools.searchpaths")
  public void setOrgApacheSlingHapiToolsSearchpaths(@Nullable ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths) {
    this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
  }

  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsExternalurl(@Nullable ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl) {
    this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
    return this;
  }

  /**
   * Get orgApacheSlingHapiToolsExternalurl
   * @return orgApacheSlingHapiToolsExternalurl
   */
  @Valid 
  @Schema(name = "org.apache.sling.hapi.tools.externalurl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.hapi.tools.externalurl")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingHapiToolsExternalurl() {
    return orgApacheSlingHapiToolsExternalurl;
  }

  @JsonProperty("org.apache.sling.hapi.tools.externalurl")
  public void setOrgApacheSlingHapiToolsExternalurl(@Nullable ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl) {
    this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
  }

  public OrgApacheSlingHapiImplHApiUtilImplProperties orgApacheSlingHapiToolsEnabled(@Nullable ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled) {
    this.orgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled;
    return this;
  }

  /**
   * Get orgApacheSlingHapiToolsEnabled
   * @return orgApacheSlingHapiToolsEnabled
   */
  @Valid 
  @Schema(name = "org.apache.sling.hapi.tools.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.hapi.tools.enabled")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheSlingHapiToolsEnabled() {
    return orgApacheSlingHapiToolsEnabled;
  }

  @JsonProperty("org.apache.sling.hapi.tools.enabled")
  public void setOrgApacheSlingHapiToolsEnabled(@Nullable ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

