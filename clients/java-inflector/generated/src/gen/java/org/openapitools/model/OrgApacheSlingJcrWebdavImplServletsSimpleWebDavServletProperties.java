package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties   {
  @JsonProperty("dav.root")
  private ConfigNodePropertyString davRoot = null;

  @JsonProperty("dav.create-absolute-uri")
  private ConfigNodePropertyBoolean davCreateAbsoluteUri = null;

  @JsonProperty("dav.realm")
  private ConfigNodePropertyString davRealm = null;

  @JsonProperty("collection.types")
  private ConfigNodePropertyArray collectionTypes = null;

  @JsonProperty("filter.prefixes")
  private ConfigNodePropertyArray filterPrefixes = null;

  @JsonProperty("filter.types")
  private ConfigNodePropertyString filterTypes = null;

  @JsonProperty("filter.uris")
  private ConfigNodePropertyString filterUris = null;

  @JsonProperty("type.collections")
  private ConfigNodePropertyString typeCollections = null;

  @JsonProperty("type.noncollections")
  private ConfigNodePropertyString typeNoncollections = null;

  @JsonProperty("type.content")
  private ConfigNodePropertyString typeContent = null;

  /**
   **/
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dav.root")
  public ConfigNodePropertyString getDavRoot() {
    return davRoot;
  }
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
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }
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
  public ConfigNodePropertyString getDavRealm() {
    return davRealm;
  }
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
  public ConfigNodePropertyArray getCollectionTypes() {
    return collectionTypes;
  }
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
  public ConfigNodePropertyArray getFilterPrefixes() {
    return filterPrefixes;
  }
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
  public ConfigNodePropertyString getFilterTypes() {
    return filterTypes;
  }
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
  public ConfigNodePropertyString getFilterUris() {
    return filterUris;
  }
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
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }
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
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }
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
  public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }
  public void setTypeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties = (OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties) o;
    return Objects.equals(davRoot, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.davRoot) &&
        Objects.equals(davCreateAbsoluteUri, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.davCreateAbsoluteUri) &&
        Objects.equals(davRealm, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.davRealm) &&
        Objects.equals(collectionTypes, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.collectionTypes) &&
        Objects.equals(filterPrefixes, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.filterPrefixes) &&
        Objects.equals(filterTypes, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.filterTypes) &&
        Objects.equals(filterUris, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.filterUris) &&
        Objects.equals(typeCollections, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.typeCollections) &&
        Objects.equals(typeNoncollections, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.typeNoncollections) &&
        Objects.equals(typeContent, orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.typeContent);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

