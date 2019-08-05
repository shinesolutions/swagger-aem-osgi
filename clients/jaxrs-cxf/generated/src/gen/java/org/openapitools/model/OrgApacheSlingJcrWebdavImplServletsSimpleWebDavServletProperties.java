package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString davRoot = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean davCreateAbsoluteUri = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString davRealm = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray collectionTypes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray filterPrefixes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString filterTypes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString filterUris = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeCollections = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeNoncollections = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeContent = null;
 /**
   * Get davRoot
   * @return davRoot
  **/
  @JsonProperty("dav.root")
  public ConfigNodePropertyString getDavRoot() {
    return davRoot;
  }

  public void setDavRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
    return this;
  }

 /**
   * Get davCreateAbsoluteUri
   * @return davCreateAbsoluteUri
  **/
  @JsonProperty("dav.create-absolute-uri")
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

 /**
   * Get davRealm
   * @return davRealm
  **/
  @JsonProperty("dav.realm")
  public ConfigNodePropertyString getDavRealm() {
    return davRealm;
  }

  public void setDavRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
    return this;
  }

 /**
   * Get collectionTypes
   * @return collectionTypes
  **/
  @JsonProperty("collection.types")
  public ConfigNodePropertyArray getCollectionTypes() {
    return collectionTypes;
  }

  public void setCollectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties collectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
    return this;
  }

 /**
   * Get filterPrefixes
   * @return filterPrefixes
  **/
  @JsonProperty("filter.prefixes")
  public ConfigNodePropertyArray getFilterPrefixes() {
    return filterPrefixes;
  }

  public void setFilterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
    return this;
  }

 /**
   * Get filterTypes
   * @return filterTypes
  **/
  @JsonProperty("filter.types")
  public ConfigNodePropertyString getFilterTypes() {
    return filterTypes;
  }

  public void setFilterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
    return this;
  }

 /**
   * Get filterUris
   * @return filterUris
  **/
  @JsonProperty("filter.uris")
  public ConfigNodePropertyString getFilterUris() {
    return filterUris;
  }

  public void setFilterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
    return this;
  }

 /**
   * Get typeCollections
   * @return typeCollections
  **/
  @JsonProperty("type.collections")
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }

  public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
    return this;
  }

 /**
   * Get typeNoncollections
   * @return typeNoncollections
  **/
  @JsonProperty("type.noncollections")
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }

  public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
    return this;
  }

 /**
   * Get typeContent
   * @return typeContent
  **/
  @JsonProperty("type.content")
  public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }

  public void setTypeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

