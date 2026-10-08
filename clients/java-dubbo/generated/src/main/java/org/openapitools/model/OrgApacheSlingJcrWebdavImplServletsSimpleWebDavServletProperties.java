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

public class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dav.root")
  private ConfigNodePropertyString davRoot;

  @JsonProperty("dav.create-absolute-uri")
  private ConfigNodePropertyBoolean davCreateAbsoluteUri;

  @JsonProperty("dav.realm")
  private ConfigNodePropertyString davRealm;

  @JsonProperty("collection.types")
  private ConfigNodePropertyArray collectionTypes;

  @JsonProperty("filter.prefixes")
  private ConfigNodePropertyArray filterPrefixes;

  @JsonProperty("filter.types")
  private ConfigNodePropertyString filterTypes;

  @JsonProperty("filter.uris")
  private ConfigNodePropertyString filterUris;

  @JsonProperty("type.collections")
  private ConfigNodePropertyString typeCollections;

  @JsonProperty("type.noncollections")
  private ConfigNodePropertyString typeNoncollections;

  @JsonProperty("type.content")
  private ConfigNodePropertyString typeContent;

  /**
   * 
   * @return davRoot
   */
  public ConfigNodePropertyString getDavRoot() {
    return davRoot;
  }

  public void setDavRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
  }

  /**
   * 
   * @return davCreateAbsoluteUri
   */
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  /**
   * 
   * @return davRealm
   */
  public ConfigNodePropertyString getDavRealm() {
    return davRealm;
  }

  public void setDavRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
  }

  /**
   * 
   * @return collectionTypes
   */
  public ConfigNodePropertyArray getCollectionTypes() {
    return collectionTypes;
  }

  public void setCollectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

  /**
   * 
   * @return filterPrefixes
   */
  public ConfigNodePropertyArray getFilterPrefixes() {
    return filterPrefixes;
  }

  public void setFilterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
  }

  /**
   * 
   * @return filterTypes
   */
  public ConfigNodePropertyString getFilterTypes() {
    return filterTypes;
  }

  public void setFilterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
  }

  /**
   * 
   * @return filterUris
   */
  public ConfigNodePropertyString getFilterUris() {
    return filterUris;
  }

  public void setFilterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
  }

  /**
   * 
   * @return typeCollections
   */
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }

  public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

  /**
   * 
   * @return typeNoncollections
   */
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }

  public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

  /**
   * 
   * @return typeContent
   */
  public ConfigNodePropertyString getTypeContent() {
    return typeContent;
  }

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
