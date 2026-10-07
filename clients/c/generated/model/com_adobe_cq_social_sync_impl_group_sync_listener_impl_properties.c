#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties.h"



static com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_create_internal(
    config_node_property_array_t *nodetypes,
    config_node_property_array_t *ignorableprops,
    config_node_property_string_t *ignorablenodes,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *distfolders
    ) {
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t));
    if (!com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t));
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var->nodetypes = nodetypes;
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var->ignorableprops = ignorableprops;
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var->ignorablenodes = ignorablenodes;
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var->enabled = enabled;
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var->distfolders = distfolders;
    return com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_create(
    config_node_property_array_t *nodetypes,
    config_node_property_array_t *ignorableprops,
    config_node_property_string_t *ignorablenodes,
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *distfolders
    ) {
    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *result = com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_create_internal (
        nodetypes,
        ignorableprops,
        ignorablenodes,
        enabled,
        distfolders
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties) {
    if(NULL == com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes) {
        config_node_property_array_free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes);
        com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes = NULL;
    }
    if (com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops) {
        config_node_property_array_free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops);
        com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops = NULL;
    }
    if (com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes) {
        config_node_property_string_free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes);
        com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes = NULL;
    }
    if (com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled) {
        config_node_property_boolean_free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled);
        com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled = NULL;
    }
    if (com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders) {
        config_node_property_string_free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders);
        com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders = NULL;
    }
    free(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties);
}

cJSON *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_convertToJSON(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes
    if(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes) {
    cJSON *nodetypes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes);
    if(nodetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nodetypes", nodetypes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops
    if(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops) {
    cJSON *ignorableprops_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops);
    if(ignorableprops_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ignorableprops", ignorableprops_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes
    if(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes) {
    cJSON *ignorablenodes_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes);
    if(ignorablenodes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ignorablenodes", ignorablenodes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled
    if(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders
    if(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders) {
    cJSON *distfolders_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders);
    if(distfolders_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "distfolders", distfolders_local_JSON);
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

com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_sync_impl_group_sync_listener_impl_propertiesJSON){

    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_t *com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes
    config_node_property_array_t *nodetypes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops
    config_node_property_array_t *ignorableprops_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes
    config_node_property_string_t *ignorablenodes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders
    config_node_property_string_t *distfolders_local_nonprim = NULL;

    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->nodetypes
    cJSON *nodetypes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_group_sync_listener_impl_propertiesJSON, "nodetypes");
    if (cJSON_IsNull(nodetypes)) {
        nodetypes = NULL;
    }
    if (nodetypes) { 
    nodetypes_local_nonprim = config_node_property_array_parseFromJSON(nodetypes); //nonprimitive
    }

    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorableprops
    cJSON *ignorableprops = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_group_sync_listener_impl_propertiesJSON, "ignorableprops");
    if (cJSON_IsNull(ignorableprops)) {
        ignorableprops = NULL;
    }
    if (ignorableprops) { 
    ignorableprops_local_nonprim = config_node_property_array_parseFromJSON(ignorableprops); //nonprimitive
    }

    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->ignorablenodes
    cJSON *ignorablenodes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_group_sync_listener_impl_propertiesJSON, "ignorablenodes");
    if (cJSON_IsNull(ignorablenodes)) {
        ignorablenodes = NULL;
    }
    if (ignorablenodes) { 
    ignorablenodes_local_nonprim = config_node_property_string_parseFromJSON(ignorablenodes); //nonprimitive
    }

    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_group_sync_listener_impl_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties->distfolders
    cJSON *distfolders = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_group_sync_listener_impl_propertiesJSON, "distfolders");
    if (cJSON_IsNull(distfolders)) {
        distfolders = NULL;
    }
    if (distfolders) { 
    distfolders_local_nonprim = config_node_property_string_parseFromJSON(distfolders); //nonprimitive
    }



    com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var = com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_create_internal (
        nodetypes ? nodetypes_local_nonprim : NULL,
        ignorableprops ? ignorableprops_local_nonprim : NULL,
        ignorablenodes ? ignorablenodes_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL,
        distfolders ? distfolders_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_sync_impl_group_sync_listener_impl_properties_local_var;
end:
    if (nodetypes_local_nonprim) {
        config_node_property_array_free(nodetypes_local_nonprim);
        nodetypes_local_nonprim = NULL;
    }
    if (ignorableprops_local_nonprim) {
        config_node_property_array_free(ignorableprops_local_nonprim);
        ignorableprops_local_nonprim = NULL;
    }
    if (ignorablenodes_local_nonprim) {
        config_node_property_string_free(ignorablenodes_local_nonprim);
        ignorablenodes_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (distfolders_local_nonprim) {
        config_node_property_string_free(distfolders_local_nonprim);
        distfolders_local_nonprim = NULL;
    }
    return NULL;

}
