#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties.h"



static org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_create_internal(
    config_node_property_string_t *dav_root,
    config_node_property_boolean_t *dav_create_absolute_uri,
    config_node_property_string_t *dav_realm,
    config_node_property_array_t *collection_types,
    config_node_property_array_t *filter_prefixes,
    config_node_property_string_t *filter_types,
    config_node_property_string_t *filter_uris,
    config_node_property_string_t *type_collections,
    config_node_property_string_t *type_noncollections,
    config_node_property_string_t *type_content
    ) {
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var = malloc(sizeof(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t));
    if (!org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var, 0, sizeof(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t));
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->dav_root = dav_root;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->dav_create_absolute_uri = dav_create_absolute_uri;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->dav_realm = dav_realm;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->collection_types = collection_types;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->filter_prefixes = filter_prefixes;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->filter_types = filter_types;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->filter_uris = filter_uris;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->type_collections = type_collections;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->type_noncollections = type_noncollections;
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var->type_content = type_content;
    return org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_create(
    config_node_property_string_t *dav_root,
    config_node_property_boolean_t *dav_create_absolute_uri,
    config_node_property_string_t *dav_realm,
    config_node_property_array_t *collection_types,
    config_node_property_array_t *filter_prefixes,
    config_node_property_string_t *filter_types,
    config_node_property_string_t *filter_uris,
    config_node_property_string_t *type_collections,
    config_node_property_string_t *type_noncollections,
    config_node_property_string_t *type_content
    ) {
    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *result = org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_create_internal (
        dav_root,
        dav_create_absolute_uri,
        dav_realm,
        collection_types,
        filter_prefixes,
        filter_types,
        filter_uris,
        type_collections,
        type_noncollections,
        type_content
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties) {
    if(NULL == org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties){
        return ;
    }
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri) {
        config_node_property_boolean_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types) {
        config_node_property_array_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes) {
        config_node_property_array_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections = NULL;
    }
    if (org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content) {
        config_node_property_string_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content);
        org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content = NULL;
    }
    free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties);
}

cJSON *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root) {
    cJSON *dav_root_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root);
    if(dav_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dav.root", dav_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri) {
    cJSON *dav_create_absolute_uri_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri);
    if(dav_create_absolute_uri_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dav.create-absolute-uri", dav_create_absolute_uri_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm) {
    cJSON *dav_realm_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm);
    if(dav_realm_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dav.realm", dav_realm_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types) {
    cJSON *collection_types_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types);
    if(collection_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "collection.types", collection_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes) {
    cJSON *filter_prefixes_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes);
    if(filter_prefixes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.prefixes", filter_prefixes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types) {
    cJSON *filter_types_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types);
    if(filter_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.types", filter_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris) {
    cJSON *filter_uris_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris);
    if(filter_uris_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.uris", filter_uris_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections) {
    cJSON *type_collections_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections);
    if(type_collections_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type.collections", type_collections_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections) {
    cJSON *type_noncollections_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections);
    if(type_noncollections_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type.noncollections", type_noncollections_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content
    if(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content) {
    cJSON *type_content_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content);
    if(type_content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type.content", type_content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_parseFromJSON(cJSON *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON){

    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root
    config_node_property_string_t *dav_root_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri
    config_node_property_boolean_t *dav_create_absolute_uri_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm
    config_node_property_string_t *dav_realm_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types
    config_node_property_array_t *collection_types_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes
    config_node_property_array_t *filter_prefixes_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types
    config_node_property_string_t *filter_types_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris
    config_node_property_string_t *filter_uris_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections
    config_node_property_string_t *type_collections_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections
    config_node_property_string_t *type_noncollections_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content
    config_node_property_string_t *type_content_local_nonprim = NULL;

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_root
    cJSON *dav_root = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "dav.root");
    if (cJSON_IsNull(dav_root)) {
        dav_root = NULL;
    }
    if (dav_root) { 
    dav_root_local_nonprim = config_node_property_string_parseFromJSON(dav_root); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_create_absolute_uri
    cJSON *dav_create_absolute_uri = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "dav.create-absolute-uri");
    if (cJSON_IsNull(dav_create_absolute_uri)) {
        dav_create_absolute_uri = NULL;
    }
    if (dav_create_absolute_uri) { 
    dav_create_absolute_uri_local_nonprim = config_node_property_boolean_parseFromJSON(dav_create_absolute_uri); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->dav_realm
    cJSON *dav_realm = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "dav.realm");
    if (cJSON_IsNull(dav_realm)) {
        dav_realm = NULL;
    }
    if (dav_realm) { 
    dav_realm_local_nonprim = config_node_property_string_parseFromJSON(dav_realm); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->collection_types
    cJSON *collection_types = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "collection.types");
    if (cJSON_IsNull(collection_types)) {
        collection_types = NULL;
    }
    if (collection_types) { 
    collection_types_local_nonprim = config_node_property_array_parseFromJSON(collection_types); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_prefixes
    cJSON *filter_prefixes = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "filter.prefixes");
    if (cJSON_IsNull(filter_prefixes)) {
        filter_prefixes = NULL;
    }
    if (filter_prefixes) { 
    filter_prefixes_local_nonprim = config_node_property_array_parseFromJSON(filter_prefixes); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_types
    cJSON *filter_types = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "filter.types");
    if (cJSON_IsNull(filter_types)) {
        filter_types = NULL;
    }
    if (filter_types) { 
    filter_types_local_nonprim = config_node_property_string_parseFromJSON(filter_types); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->filter_uris
    cJSON *filter_uris = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "filter.uris");
    if (cJSON_IsNull(filter_uris)) {
        filter_uris = NULL;
    }
    if (filter_uris) { 
    filter_uris_local_nonprim = config_node_property_string_parseFromJSON(filter_uris); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_collections
    cJSON *type_collections = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "type.collections");
    if (cJSON_IsNull(type_collections)) {
        type_collections = NULL;
    }
    if (type_collections) { 
    type_collections_local_nonprim = config_node_property_string_parseFromJSON(type_collections); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_noncollections
    cJSON *type_noncollections = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "type.noncollections");
    if (cJSON_IsNull(type_noncollections)) {
        type_noncollections = NULL;
    }
    if (type_noncollections) { 
    type_noncollections_local_nonprim = config_node_property_string_parseFromJSON(type_noncollections); //nonprimitive
    }

    // org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties->type_content
    cJSON *type_content = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON, "type.content");
    if (cJSON_IsNull(type_content)) {
        type_content = NULL;
    }
    if (type_content) { 
    type_content_local_nonprim = config_node_property_string_parseFromJSON(type_content); //nonprimitive
    }



    org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var = org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_create_internal (
        dav_root ? dav_root_local_nonprim : NULL,
        dav_create_absolute_uri ? dav_create_absolute_uri_local_nonprim : NULL,
        dav_realm ? dav_realm_local_nonprim : NULL,
        collection_types ? collection_types_local_nonprim : NULL,
        filter_prefixes ? filter_prefixes_local_nonprim : NULL,
        filter_types ? filter_types_local_nonprim : NULL,
        filter_uris ? filter_uris_local_nonprim : NULL,
        type_collections ? type_collections_local_nonprim : NULL,
        type_noncollections ? type_noncollections_local_nonprim : NULL,
        type_content ? type_content_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_local_var;
end:
    if (dav_root_local_nonprim) {
        config_node_property_string_free(dav_root_local_nonprim);
        dav_root_local_nonprim = NULL;
    }
    if (dav_create_absolute_uri_local_nonprim) {
        config_node_property_boolean_free(dav_create_absolute_uri_local_nonprim);
        dav_create_absolute_uri_local_nonprim = NULL;
    }
    if (dav_realm_local_nonprim) {
        config_node_property_string_free(dav_realm_local_nonprim);
        dav_realm_local_nonprim = NULL;
    }
    if (collection_types_local_nonprim) {
        config_node_property_array_free(collection_types_local_nonprim);
        collection_types_local_nonprim = NULL;
    }
    if (filter_prefixes_local_nonprim) {
        config_node_property_array_free(filter_prefixes_local_nonprim);
        filter_prefixes_local_nonprim = NULL;
    }
    if (filter_types_local_nonprim) {
        config_node_property_string_free(filter_types_local_nonprim);
        filter_types_local_nonprim = NULL;
    }
    if (filter_uris_local_nonprim) {
        config_node_property_string_free(filter_uris_local_nonprim);
        filter_uris_local_nonprim = NULL;
    }
    if (type_collections_local_nonprim) {
        config_node_property_string_free(type_collections_local_nonprim);
        type_collections_local_nonprim = NULL;
    }
    if (type_noncollections_local_nonprim) {
        config_node_property_string_free(type_noncollections_local_nonprim);
        type_noncollections_local_nonprim = NULL;
    }
    if (type_content_local_nonprim) {
        config_node_property_string_free(type_content_local_nonprim);
        type_content_local_nonprim = NULL;
    }
    return NULL;

}
