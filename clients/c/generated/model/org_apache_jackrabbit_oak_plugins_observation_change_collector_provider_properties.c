#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties.h"



static org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_create_internal(
    config_node_property_integer_t *max_items,
    config_node_property_integer_t *max_path_depth,
    config_node_property_boolean_t *enabled
    ) {
    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t));
    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var->max_items = max_items;
    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var->max_path_depth = max_path_depth;
    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var->enabled = enabled;
    return org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_create(
    config_node_property_integer_t *max_items,
    config_node_property_integer_t *max_path_depth,
    config_node_property_boolean_t *enabled
    ) {
    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *result = org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_create_internal (
        max_items,
        max_path_depth,
        enabled
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_free(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items);
        org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth);
        org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled);
        org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items
    if(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items) {
    cJSON *max_items_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items);
    if(max_items_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxItems", max_items_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth
    if(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth) {
    cJSON *max_path_depth_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth);
    if(max_path_depth_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxPathDepth", max_path_depth_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled
    if(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
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

org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_t *org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items
    config_node_property_integer_t *max_items_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth
    config_node_property_integer_t *max_path_depth_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_items
    cJSON *max_items = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_propertiesJSON, "maxItems");
    if (cJSON_IsNull(max_items)) {
        max_items = NULL;
    }
    if (max_items) { 
    max_items_local_nonprim = config_node_property_integer_parseFromJSON(max_items); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->max_path_depth
    cJSON *max_path_depth = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_propertiesJSON, "maxPathDepth");
    if (cJSON_IsNull(max_path_depth)) {
        max_path_depth = NULL;
    }
    if (max_path_depth) { 
    max_path_depth_local_nonprim = config_node_property_integer_parseFromJSON(max_path_depth); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var = org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_create_internal (
        max_items ? max_items_local_nonprim : NULL,
        max_path_depth ? max_path_depth_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_properties_local_var;
end:
    if (max_items_local_nonprim) {
        config_node_property_integer_free(max_items_local_nonprim);
        max_items_local_nonprim = NULL;
    }
    if (max_path_depth_local_nonprim) {
        config_node_property_integer_free(max_path_depth_local_nonprim);
        max_path_depth_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    return NULL;

}
