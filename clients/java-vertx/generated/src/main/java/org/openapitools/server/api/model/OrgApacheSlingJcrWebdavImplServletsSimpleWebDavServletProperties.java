package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties () {

  }

  public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties (ConfigNodePropertyString davRoot, ConfigNodePropertyBoolean davCreateAbsoluteUri, ConfigNodePropertyString davRealm, ConfigNodePropertyArray collectionTypes, ConfigNodePropertyArray filterPrefixes, ConfigNodePropertyString filterTypes, ConfigNodePropertyString filterUris, ConfigNodePropertyString typeCollections, ConfigNodePropertyString typeNoncollections, ConfigNodePropertyString typeContent) {
    this.davRoot = davRoot;
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    this.davRealm = davRealm;
    this.collectionTypes = collectionTypes;
    this.filterPrefixes = filterPrefixes;
    this.filterTypes = filterTypes;
    this.filterUris = filterUris;
    this.typeCollections = typeCollections;
    this.typeNoncollections = typeNoncollections;
    this.typeContent = typeContent;
  }

    
  @JsonProperty("dav.root")
  public ConfigNodePropertyString getDavRoot() {
    return davRoot;
  }
  public void setDavRoot(ConfigNodePropertyString davRoot) {
    this.davRoot = davRoot;
  }

    
  @JsonProperty("dav.create-absolute-uri")
  public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }
  public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

    
  @JsonProperty("dav.realm")
  public ConfigNodePropertyString getDavRealm() {
    return davRealm;
  }
  public void setDavRealm(ConfigNodePropertyString davRealm) {
    this.davRealm = davRealm;
  }

    
  @JsonProperty("collection.types")
  public ConfigNodePropertyArray getCollectionTypes() {
    return collectionTypes;
  }
  public void setCollectionTypes(ConfigNodePropertyArray collectionTypes) {
    this.collectionTypes = collectionTypes;
  }

    
  @JsonProperty("filter.prefixes")
  public ConfigNodePropertyArray getFilterPrefixes() {
    return filterPrefixes;
  }
  public void setFilterPrefixes(ConfigNodePropertyArray filterPrefixes) {
    this.filterPrefixes = filterPrefixes;
  }

    
  @JsonProperty("filter.types")
  public ConfigNodePropertyString getFilterTypes() {
    return filterTypes;
  }
  public void setFilterTypes(ConfigNodePropertyString filterTypes) {
    this.filterTypes = filterTypes;
  }

    
  @JsonProperty("filter.uris")
  public ConfigNodePropertyString getFilterUris() {
    return filterUris;
  }
  public void setFilterUris(ConfigNodePropertyString filterUris) {
    this.filterUris = filterUris;
  }

    
  @JsonProperty("type.collections")
  public ConfigNodePropertyString getTypeCollections() {
    return typeCollections;
  }
  public void setTypeCollections(ConfigNodePropertyString typeCollections) {
    this.typeCollections = typeCollections;
  }

    
  @JsonProperty("type.noncollections")
  public ConfigNodePropertyString getTypeNoncollections() {
    return typeNoncollections;
  }
  public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
    this.typeNoncollections = typeNoncollections;
  }

    
  @JsonProperty("type.content")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
