#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_compatrouter_impl_switch_mapping_config_properties.h"



static com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_create_internal(
    config_node_property_string_t *group,
    config_node_property_array_t *ids
    ) {
    com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var = malloc(sizeof(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t));
    if (!com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var, 0, sizeof(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t));
    com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var->_library_owned = 1;
    com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var->group = group;
    com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var->ids = ids;
    return com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_create(
    config_node_property_string_t *group,
    config_node_property_array_t *ids
    ) {
    com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *result = com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_create_internal (
        group,
        ids
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_free(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties) {
    if(NULL == com_adobe_granite_compatrouter_impl_switch_mapping_config_properties){
        return ;
    }
    if(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group) {
        config_node_property_string_free(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group);
        com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group = NULL;
    }
    if (com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids) {
        config_node_property_array_free(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids);
        com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids = NULL;
    }
    free(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties);
}

cJSON *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_convertToJSON(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group
    if(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group) {
    cJSON *group_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group);
    if(group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group", group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids
    if(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids) {
    cJSON *ids_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids);
    if(ids_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ids", ids_local_JSON);
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

com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_parseFromJSON(cJSON *com_adobe_granite_compatrouter_impl_switch_mapping_config_propertiesJSON){

    com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_t *com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group
    config_node_property_string_t *group_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids
    config_node_property_array_t *ids_local_nonprim = NULL;

    // com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->group
    cJSON *group = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_compatrouter_impl_switch_mapping_config_propertiesJSON, "group");
    if (cJSON_IsNull(group)) {
        group = NULL;
    }
    if (group) { 
    group_local_nonprim = config_node_property_string_parseFromJSON(group); //nonprimitive
    }

    // com_adobe_granite_compatrouter_impl_switch_mapping_config_properties->ids
    cJSON *ids = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_compatrouter_impl_switch_mapping_config_propertiesJSON, "ids");
    if (cJSON_IsNull(ids)) {
        ids = NULL;
    }
    if (ids) { 
    ids_local_nonprim = config_node_property_array_parseFromJSON(ids); //nonprimitive
    }



    com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var = com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_create_internal (
        group ? group_local_nonprim : NULL,
        ids ? ids_local_nonprim : NULL
        );

    if (!com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_compatrouter_impl_switch_mapping_config_properties_local_var;
end:
    if (group_local_nonprim) {
        config_node_property_string_free(group_local_nonprim);
        group_local_nonprim = NULL;
    }
    if (ids_local_nonprim) {
        config_node_property_array_free(ids_local_nonprim);
        ids_local_nonprim = NULL;
    }
    return NULL;

}
