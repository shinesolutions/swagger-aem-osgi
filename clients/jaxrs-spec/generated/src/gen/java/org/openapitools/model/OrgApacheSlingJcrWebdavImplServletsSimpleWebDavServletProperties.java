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



@JsonTypeName("orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties   {
  private ConfigNodePropertyString davRoot;
  private ConfigNodePropertyBoolean davCreateAbsoluteUri;
  private ConfigNodePropertyString davRealm;
  private ConfigNodePropertyArray collectionTypes;
  private ConfigNodePropertyArray filterPrefixes;
  private ConfigNodePropertyString filterTypes;
  private ConfigNodePropertyString filterUris;
  private ConfigNodePropertyString typeCollections;
  private ConfigNodePropertyString typeNoncollections;
  private ConfigNodePropertyString typeContent;

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties() {
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dav.root")
  @Valid public ConfigNodePropertyString getDavRoot() {
    return davRoot;
  }

  @JsonProperty("dav.root")
  public void setDavRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dav.create-absolute-uri")
  @Valid public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  @JsonProperty("dav.create-absolute-uri")
  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dav.realm")
  @Valid public ConfigNodePropertyString getDavRealm() {
    return davRealm;
  }

  @JsonProperty("dav.realm")
  public void setDavRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties collectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("collection.types")
  @Valid public ConfigNodePropertyArray getCollectionTypes() {
    return collectionTypes;
  }

  @JsonProperty("collection.types")
  public void setCollectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.prefixes")
  @Valid public ConfigNodePropertyArray getFilterPrefixes() {
    return filterPrefixes;
  }

  @JsonProperty("filter.prefixes")
  public void setFilterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.types")
  @Valid public ConfigNodePropertyString getFilterTypes() {
    return filterTypes;
  }

  @JsonProperty("filter.types")
  public void setFilterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filter.uris")
  @Valid public ConfigNodePropertyString getFilterUris() {
    return filterUris;
  }

  @JsonProperty("filter.uris")
  public void setFilterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type.collections")
  @Valid public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }

  @JsonProperty("type.collections")
  public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type.noncollections")
  @Valid public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }

  @JsonProperty("type.noncollections")
  public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type.content")
  @Valid public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }

  @JsonProperty("type.content")
  public void setTypeContent(ConfigNodePropertyString typeContent) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
