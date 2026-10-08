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
 * OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties
 */

@JsonTypeName("orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString davRoot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean davCreateAbsoluteUri;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString davRealm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray collectionTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray filterPrefixes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString filterTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString filterUris;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString typeCollections;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString typeNoncollections;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString typeContent;

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRoot(@Nullable ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
    return this;
  }

  /**
   * Get davRoot
   * @return davRoot
   */
  @Valid 
  @Schema(name = "dav.root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dav.root")
  public @Nullable ConfigNodePropertyString getDavRoot() {
    return davRoot;
  }

  @JsonProperty("dav.root")
  public void setDavRoot(@Nullable ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davCreateAbsoluteUri(@Nullable ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

  /**
   * Get davCreateAbsoluteUri
   * @return davCreateAbsoluteUri
   */
  @Valid 
  @Schema(name = "dav.create-absolute-uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dav.create-absolute-uri")
  public @Nullable ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  @JsonProperty("dav.create-absolute-uri")
  public void setDavCreateAbsoluteUri(@Nullable ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRealm(@Nullable ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
    return this;
  }

  /**
   * Get davRealm
   * @return davRealm
   */
  @Valid 
  @Schema(name = "dav.realm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dav.realm")
  public @Nullable ConfigNodePropertyString getDavRealm() {
    return davRealm;
  }

  @JsonProperty("dav.realm")
  public void setDavRealm(@Nullable ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties collectionTypes(@Nullable ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
    return this;
  }

  /**
   * Get collectionTypes
   * @return collectionTypes
   */
  @Valid 
  @Schema(name = "collection.types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collection.types")
  public @Nullable ConfigNodePropertyArray getCollectionTypes() {
    return collectionTypes;
  }

  @JsonProperty("collection.types")
  public void setCollectionTypes(@Nullable ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterPrefixes(@Nullable ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
    return this;
  }

  /**
   * Get filterPrefixes
   * @return filterPrefixes
   */
  @Valid 
  @Schema(name = "filter.prefixes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.prefixes")
  public @Nullable ConfigNodePropertyArray getFilterPrefixes() {
    return filterPrefixes;
  }

  @JsonProperty("filter.prefixes")
  public void setFilterPrefixes(@Nullable ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterTypes(@Nullable ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
    return this;
  }

  /**
   * Get filterTypes
   * @return filterTypes
   */
  @Valid 
  @Schema(name = "filter.types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.types")
  public @Nullable ConfigNodePropertyString getFilterTypes() {
    return filterTypes;
  }

  @JsonProperty("filter.types")
  public void setFilterTypes(@Nullable ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterUris(@Nullable ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
    return this;
  }

  /**
   * Get filterUris
   * @return filterUris
   */
  @Valid 
  @Schema(name = "filter.uris", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.uris")
  public @Nullable ConfigNodePropertyString getFilterUris() {
    return filterUris;
  }

  @JsonProperty("filter.uris")
  public void setFilterUris(@Nullable ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeCollections(@Nullable ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
    return this;
  }

  /**
   * Get typeCollections
   * @return typeCollections
   */
  @Valid 
  @Schema(name = "type.collections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type.collections")
  public @Nullable ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }

  @JsonProperty("type.collections")
  public void setTypeCollections(@Nullable ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeNoncollections(@Nullable ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
    return this;
  }

  /**
   * Get typeNoncollections
   * @return typeNoncollections
   */
  @Valid 
  @Schema(name = "type.noncollections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type.noncollections")
  public @Nullable ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }

  @JsonProperty("type.noncollections")
  public void setTypeNoncollections(@Nullable ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeContent(@Nullable ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
    return this;
  }

  /**
   * Get typeContent
   * @return typeContent
   */
  @Valid 
  @Schema(name = "type.content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type.content")
  public @Nullable ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }

  @JsonProperty("type.content")
  public void setTypeContent(@Nullable ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties = (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties) o;
    return Objects.equals(this.davRoot, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.davRoot) &&
        Objects.equals(this.davCreateAbsoluteUri, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.davCreateAbsoluteUri) &&
        Objects.equals(this.davRealm, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.davRealm) &&
        Objects.equals(this.collectionTypes, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.collectionTypes) &&
        Objects.equals(this.filterPrefixes, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.filterPrefixes) &&
        Objects.equals(this.filterTypes, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.filterTypes) &&
        Objects.equals(this.filterUris, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.filterUris) &&
        Objects.equals(this.typeCollections, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.typeCollections) &&
        Objects.equals(this.typeNoncollections, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.typeNoncollections) &&
        Objects.equals(this.typeContent, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.typeContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(davRoot, davCreateAbsoluteUri, davRealm, collectionTypes, filterPrefixes, filterTypes, filterUris, typeCollections, typeNoncollections, typeContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {\n");
    sb.append("    davRoot: ").append(toIndentedString(davRoot)).append("\n");
    sb.append("    davCreateAbsoluteUri: ").append(toIndentedString(davCreateAbsoluteUri)).append("\n");
    sb.append("    davRealm: ").append(toIndentedString(davRealm)).append("\n");
    sb.append("    collectionTypes: ").append(toIndentedString(collectionTypes)).append("\n");
    sb.append("    filterPrefixes: ").append(toIndentedString(filterPrefixes)).append("\n");
    sb.append("    filterTypes: ").append(toIndentedString(filterTypes)).append("\n");
    sb.append("    filterUris: ").append(toIndentedString(filterUris)).append("\n");
    sb.append("    typeCollections: ").append(toIndentedString(typeCollections)).append("\n");
    sb.append("    typeNoncollections: ").append(toIndentedString(typeNoncollections)).append("\n");
    sb.append("    typeContent: ").append(toIndentedString(typeContent)).append("\n");
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

