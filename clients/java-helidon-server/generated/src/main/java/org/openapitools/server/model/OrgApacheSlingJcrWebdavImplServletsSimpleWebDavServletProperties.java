package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.
     *
     * @param davRoot davRoot
     * @param davCreateAbsoluteUri davCreateAbsoluteUri
     * @param davRealm davRealm
     * @param collectionTypes collectionTypes
     * @param filterPrefixes filterPrefixes
     * @param filterTypes filterTypes
     * @param filterUris filterUris
     * @param typeCollections typeCollections
     * @param typeNoncollections typeNoncollections
     * @param typeContent typeContent
     */
    public OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(
        ConfigNodePropertyString davRoot, 
        ConfigNodePropertyBoolean davCreateAbsoluteUri, 
        ConfigNodePropertyString davRealm, 
        ConfigNodePropertyArray collectionTypes, 
        ConfigNodePropertyArray filterPrefixes, 
        ConfigNodePropertyString filterTypes, 
        ConfigNodePropertyString filterUris, 
        ConfigNodePropertyString typeCollections, 
        ConfigNodePropertyString typeNoncollections, 
        ConfigNodePropertyString typeContent
    ) {
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



    /**
     * Get davRoot
     * @return davRoot
     */
    public ConfigNodePropertyString getDavRoot() {
        return davRoot;
    }

    public void setDavRoot(ConfigNodePropertyString davRoot) {
        this.davRoot = davRoot;
    }

    /**
     * Get davCreateAbsoluteUri
     * @return davCreateAbsoluteUri
     */
    public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
        return davCreateAbsoluteUri;
    }

    public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
        this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    }

    /**
     * Get davRealm
     * @return davRealm
     */
    public ConfigNodePropertyString getDavRealm() {
        return davRealm;
    }

    public void setDavRealm(ConfigNodePropertyString davRealm) {
        this.davRealm = davRealm;
    }

    /**
     * Get collectionTypes
     * @return collectionTypes
     */
    public ConfigNodePropertyArray getCollectionTypes() {
        return collectionTypes;
    }

    public void setCollectionTypes(ConfigNodePropertyArray collectionTypes) {
        this.collectionTypes = collectionTypes;
    }

    /**
     * Get filterPrefixes
     * @return filterPrefixes
     */
    public ConfigNodePropertyArray getFilterPrefixes() {
        return filterPrefixes;
    }

    public void setFilterPrefixes(ConfigNodePropertyArray filterPrefixes) {
        this.filterPrefixes = filterPrefixes;
    }

    /**
     * Get filterTypes
     * @return filterTypes
     */
    public ConfigNodePropertyString getFilterTypes() {
        return filterTypes;
    }

    public void setFilterTypes(ConfigNodePropertyString filterTypes) {
        this.filterTypes = filterTypes;
    }

    /**
     * Get filterUris
     * @return filterUris
     */
    public ConfigNodePropertyString getFilterUris() {
        return filterUris;
    }

    public void setFilterUris(ConfigNodePropertyString filterUris) {
        this.filterUris = filterUris;
    }

    /**
     * Get typeCollections
     * @return typeCollections
     */
    public ConfigNodePropertyString getTypeCollections() {
        return typeCollections;
    }

    public void setTypeCollections(ConfigNodePropertyString typeCollections) {
        this.typeCollections = typeCollections;
    }

    /**
     * Get typeNoncollections
     * @return typeNoncollections
     */
    public ConfigNodePropertyString getTypeNoncollections() {
        return typeNoncollections;
    }

    public void setTypeNoncollections(ConfigNodePropertyString typeNoncollections) {
        this.typeNoncollections = typeNoncollections;
    }

    /**
     * Get typeContent
     * @return typeContent
     */
    public ConfigNodePropertyString getTypeContent() {
        return typeContent;
    }

    public void setTypeContent(ConfigNodePropertyString typeContent) {
        this.typeContent = typeContent;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

