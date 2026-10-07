#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_hapi_impl_h_api_util_impl_properties.h"



static org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties_create_internal(
    config_node_property_string_t *org_apache_sling_hapi_tools_resourcetype,
    config_node_property_string_t *org_apache_sling_hapi_tools_collectionresourcetype,
    config_node_property_array_t *org_apache_sling_hapi_tools_searchpaths,
    config_node_property_string_t *org_apache_sling_hapi_tools_externalurl,
    config_node_property_boolean_t *org_apache_sling_hapi_tools_enabled
    ) {
    org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var = malloc(sizeof(org_apache_sling_hapi_impl_h_api_util_impl_properties_t));
    if (!org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var, 0, sizeof(org_apache_sling_hapi_impl_h_api_util_impl_properties_t));
    org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var->org_apache_sling_hapi_tools_resourcetype = org_apache_sling_hapi_tools_resourcetype;
    org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var->org_apache_sling_hapi_tools_collectionresourcetype = org_apache_sling_hapi_tools_collectionresourcetype;
    org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var->org_apache_sling_hapi_tools_searchpaths = org_apache_sling_hapi_tools_searchpaths;
    org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var->org_apache_sling_hapi_tools_externalurl = org_apache_sling_hapi_tools_externalurl;
    org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var->org_apache_sling_hapi_tools_enabled = org_apache_sling_hapi_tools_enabled;
    return org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties_create(
    config_node_property_string_t *org_apache_sling_hapi_tools_resourcetype,
    config_node_property_string_t *org_apache_sling_hapi_tools_collectionresourcetype,
    config_node_property_array_t *org_apache_sling_hapi_tools_searchpaths,
    config_node_property_string_t *org_apache_sling_hapi_tools_externalurl,
    config_node_property_boolean_t *org_apache_sling_hapi_tools_enabled
    ) {
    org_apache_sling_hapi_impl_h_api_util_impl_properties_t *result = org_apache_sling_hapi_impl_h_api_util_impl_properties_create_internal (
        org_apache_sling_hapi_tools_resourcetype,
        org_apache_sling_hapi_tools_collectionresourcetype,
        org_apache_sling_hapi_tools_searchpaths,
        org_apache_sling_hapi_tools_externalurl,
        org_apache_sling_hapi_tools_enabled
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_hapi_impl_h_api_util_impl_properties_free(org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties) {
    if(NULL == org_apache_sling_hapi_impl_h_api_util_impl_properties){
        return ;
    }
    if(org_apache_sling_hapi_impl_h_api_util_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_hapi_impl_h_api_util_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype) {
        config_node_property_string_free(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype);
        org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype = NULL;
    }
    if (org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype) {
        config_node_property_string_free(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype);
        org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype = NULL;
    }
    if (org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths) {
        config_node_property_array_free(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths);
        org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths = NULL;
    }
    if (org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl) {
        config_node_property_string_free(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl);
        org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl = NULL;
    }
    if (org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled) {
        config_node_property_boolean_free(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled);
        org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled = NULL;
    }
    free(org_apache_sling_hapi_impl_h_api_util_impl_properties);
}

cJSON *org_apache_sling_hapi_impl_h_api_util_impl_properties_convertToJSON(org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype
    if(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype) {
    cJSON *org_apache_sling_hapi_tools_resourcetype_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype);
    if(org_apache_sling_hapi_tools_resourcetype_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.hapi.tools.resourcetype", org_apache_sling_hapi_tools_resourcetype_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype
    if(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype) {
    cJSON *org_apache_sling_hapi_tools_collectionresourcetype_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype);
    if(org_apache_sling_hapi_tools_collectionresourcetype_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.hapi.tools.collectionresourcetype", org_apache_sling_hapi_tools_collectionresourcetype_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths
    if(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths) {
    cJSON *org_apache_sling_hapi_tools_searchpaths_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths);
    if(org_apache_sling_hapi_tools_searchpaths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.hapi.tools.searchpaths", org_apache_sling_hapi_tools_searchpaths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl
    if(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl) {
    cJSON *org_apache_sling_hapi_tools_externalurl_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl);
    if(org_apache_sling_hapi_tools_externalurl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.hapi.tools.externalurl", org_apache_sling_hapi_tools_externalurl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled
    if(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled) {
    cJSON *org_apache_sling_hapi_tools_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled);
    if(org_apache_sling_hapi_tools_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.hapi.tools.enabled", org_apache_sling_hapi_tools_enabled_local_JSON);
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

org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties_parseFromJSON(cJSON *org_apache_sling_hapi_impl_h_api_util_impl_propertiesJSON){

    org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype
    config_node_property_string_t *org_apache_sling_hapi_tools_resourcetype_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype
    config_node_property_string_t *org_apache_sling_hapi_tools_collectionresourcetype_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths
    config_node_property_array_t *org_apache_sling_hapi_tools_searchpaths_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl
    config_node_property_string_t *org_apache_sling_hapi_tools_externalurl_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled
    config_node_property_boolean_t *org_apache_sling_hapi_tools_enabled_local_nonprim = NULL;

    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_resourcetype
    cJSON *org_apache_sling_hapi_tools_resourcetype = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hapi_impl_h_api_util_impl_propertiesJSON, "org.apache.sling.hapi.tools.resourcetype");
    if (cJSON_IsNull(org_apache_sling_hapi_tools_resourcetype)) {
        org_apache_sling_hapi_tools_resourcetype = NULL;
    }
    if (org_apache_sling_hapi_tools_resourcetype) { 
    org_apache_sling_hapi_tools_resourcetype_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_hapi_tools_resourcetype); //nonprimitive
    }

    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_collectionresourcetype
    cJSON *org_apache_sling_hapi_tools_collectionresourcetype = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hapi_impl_h_api_util_impl_propertiesJSON, "org.apache.sling.hapi.tools.collectionresourcetype");
    if (cJSON_IsNull(org_apache_sling_hapi_tools_collectionresourcetype)) {
        org_apache_sling_hapi_tools_collectionresourcetype = NULL;
    }
    if (org_apache_sling_hapi_tools_collectionresourcetype) { 
    org_apache_sling_hapi_tools_collectionresourcetype_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_hapi_tools_collectionresourcetype); //nonprimitive
    }

    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_searchpaths
    cJSON *org_apache_sling_hapi_tools_searchpaths = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hapi_impl_h_api_util_impl_propertiesJSON, "org.apache.sling.hapi.tools.searchpaths");
    if (cJSON_IsNull(org_apache_sling_hapi_tools_searchpaths)) {
        org_apache_sling_hapi_tools_searchpaths = NULL;
    }
    if (org_apache_sling_hapi_tools_searchpaths) { 
    org_apache_sling_hapi_tools_searchpaths_local_nonprim = config_node_property_array_parseFromJSON(org_apache_sling_hapi_tools_searchpaths); //nonprimitive
    }

    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_externalurl
    cJSON *org_apache_sling_hapi_tools_externalurl = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hapi_impl_h_api_util_impl_propertiesJSON, "org.apache.sling.hapi.tools.externalurl");
    if (cJSON_IsNull(org_apache_sling_hapi_tools_externalurl)) {
        org_apache_sling_hapi_tools_externalurl = NULL;
    }
    if (org_apache_sling_hapi_tools_externalurl) { 
    org_apache_sling_hapi_tools_externalurl_local_nonprim = config_node_property_string_parseFromJSON(org_apache_sling_hapi_tools_externalurl); //nonprimitive
    }

    // org_apache_sling_hapi_impl_h_api_util_impl_properties->org_apache_sling_hapi_tools_enabled
    cJSON *org_apache_sling_hapi_tools_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hapi_impl_h_api_util_impl_propertiesJSON, "org.apache.sling.hapi.tools.enabled");
    if (cJSON_IsNull(org_apache_sling_hapi_tools_enabled)) {
        org_apache_sling_hapi_tools_enabled = NULL;
    }
    if (org_apache_sling_hapi_tools_enabled) { 
    org_apache_sling_hapi_tools_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_sling_hapi_tools_enabled); //nonprimitive
    }



    org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var = org_apache_sling_hapi_impl_h_api_util_impl_properties_create_internal (
        org_apache_sling_hapi_tools_resourcetype ? org_apache_sling_hapi_tools_resourcetype_local_nonprim : NULL,
        org_apache_sling_hapi_tools_collectionresourcetype ? org_apache_sling_hapi_tools_collectionresourcetype_local_nonprim : NULL,
        org_apache_sling_hapi_tools_searchpaths ? org_apache_sling_hapi_tools_searchpaths_local_nonprim : NULL,
        org_apache_sling_hapi_tools_externalurl ? org_apache_sling_hapi_tools_externalurl_local_nonprim : NULL,
        org_apache_sling_hapi_tools_enabled ? org_apache_sling_hapi_tools_enabled_local_nonprim : NULL
        );

    if (!org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_hapi_impl_h_api_util_impl_properties_local_var;
end:
    if (org_apache_sling_hapi_tools_resourcetype_local_nonprim) {
        config_node_property_string_free(org_apache_sling_hapi_tools_resourcetype_local_nonprim);
        org_apache_sling_hapi_tools_resourcetype_local_nonprim = NULL;
    }
    if (org_apache_sling_hapi_tools_collectionresourcetype_local_nonprim) {
        config_node_property_string_free(org_apache_sling_hapi_tools_collectionresourcetype_local_nonprim);
        org_apache_sling_hapi_tools_collectionresourcetype_local_nonprim = NULL;
    }
    if (org_apache_sling_hapi_tools_searchpaths_local_nonprim) {
        config_node_property_array_free(org_apache_sling_hapi_tools_searchpaths_local_nonprim);
        org_apache_sling_hapi_tools_searchpaths_local_nonprim = NULL;
    }
    if (org_apache_sling_hapi_tools_externalurl_local_nonprim) {
        config_node_property_string_free(org_apache_sling_hapi_tools_externalurl_local_nonprim);
        org_apache_sling_hapi_tools_externalurl_local_nonprim = NULL;
    }
    if (org_apache_sling_hapi_tools_enabled_local_nonprim) {
        config_node_property_boolean_free(org_apache_sling_hapi_tools_enabled_local_nonprim);
        org_apache_sling_hapi_tools_enabled_local_nonprim = NULL;
    }
    return NULL;

}
