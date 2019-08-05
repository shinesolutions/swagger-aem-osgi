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
public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties   {
  
  private ConfigNodePropertyString davRoot = null;
  private ConfigNodePropertyBoolean davCreateAbsoluteUri = null;
  private ConfigNodePropertyString davRealm = null;
  private ConfigNodePropertyArray collectionTypes = null;
  private ConfigNodePropertyArray filterPrefixes = null;
  private ConfigNodePropertyString filterTypes = null;
  private ConfigNodePropertyString filterUris = null;
  private ConfigNodePropertyString typeCollections = null;
  private ConfigNodePropertyString typeNoncollections = null;
  private ConfigNodePropertyString typeContent = null;

  /**
   **/
  
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

