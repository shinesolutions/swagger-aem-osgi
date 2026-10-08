package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString davRoot;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean davCreateAbsoluteUri;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString davRealm;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray collectionTypes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray filterPrefixes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString filterTypes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString filterUris;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeCollections;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeNoncollections;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString typeContent;
 /**
  * Get davRoot
  * @return davRoot
  */
  @JsonProperty("dav.root")
  public ConfigNodePropertyString getDavRoot() {
    return davRoot;
  }

  /**
   * Sets the <code>davRoot</code> property.
   */
 public void setDavRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
  }

  /**
   * Sets the <code>davRoot</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
    return this;
  }

 /**
  * Get davCreateAbsoluteUri
  * @return davCreateAbsoluteUri
  */
  @JsonProperty("dav.create-absolute-uri")
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  /**
   * Sets the <code>davCreateAbsoluteUri</code> property.
   */
 public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  /**
   * Sets the <code>davCreateAbsoluteUri</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

 /**
  * Get davRealm
  * @return davRealm
  */
  @JsonProperty("dav.realm")
  public ConfigNodePropertyString getDavRealm() {
    return davRealm;
  }

  /**
   * Sets the <code>davRealm</code> property.
   */
 public void setDavRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
  }

  /**
   * Sets the <code>davRealm</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties davRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
    return this;
  }

 /**
  * Get collectionTypes
  * @return collectionTypes
  */
  @JsonProperty("collection.types")
  public ConfigNodePropertyArray getCollectionTypes() {
    return collectionTypes;
  }

  /**
   * Sets the <code>collectionTypes</code> property.
   */
 public void setCollectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

  /**
   * Sets the <code>collectionTypes</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties collectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
    return this;
  }

 /**
  * Get filterPrefixes
  * @return filterPrefixes
  */
  @JsonProperty("filter.prefixes")
  public ConfigNodePropertyArray getFilterPrefixes() {
    return filterPrefixes;
  }

  /**
   * Sets the <code>filterPrefixes</code> property.
   */
 public void setFilterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
  }

  /**
   * Sets the <code>filterPrefixes</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
    return this;
  }

 /**
  * Get filterTypes
  * @return filterTypes
  */
  @JsonProperty("filter.types")
  public ConfigNodePropertyString getFilterTypes() {
    return filterTypes;
  }

  /**
   * Sets the <code>filterTypes</code> property.
   */
 public void setFilterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
  }

  /**
   * Sets the <code>filterTypes</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
    return this;
  }

 /**
  * Get filterUris
  * @return filterUris
  */
  @JsonProperty("filter.uris")
  public ConfigNodePropertyString getFilterUris() {
    return filterUris;
  }

  /**
   * Sets the <code>filterUris</code> property.
   */
 public void setFilterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
  }

  /**
   * Sets the <code>filterUris</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties filterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
    return this;
  }

 /**
  * Get typeCollections
  * @return typeCollections
  */
  @JsonProperty("type.collections")
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }

  /**
   * Sets the <code>typeCollections</code> property.
   */
 public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  /**
   * Sets the <code>typeCollections</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
    return this;
  }

 /**
  * Get typeNoncollections
  * @return typeNoncollections
  */
  @JsonProperty("type.noncollections")
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }

  /**
   * Sets the <code>typeNoncollections</code> property.
   */
 public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  /**
   * Sets the <code>typeNoncollections</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
    return this;
  }

 /**
  * Get typeContent
  * @return typeContent
  */
  @JsonProperty("type.content")
  public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }

  /**
   * Sets the <code>typeContent</code> property.
   */
 public void setTypeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
  }

  /**
   * Sets the <code>typeContent</code> property.
   */
  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties typeContent(ConfigNodePropertyString typeContent) {
    this.typeContent = typeContent;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

