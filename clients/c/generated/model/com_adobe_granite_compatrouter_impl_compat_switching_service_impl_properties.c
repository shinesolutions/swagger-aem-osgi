#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties.h"



static com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_create_internal(
    config_node_property_array_t *compatgroups,
    config_node_property_boolean_t *enabled
    ) {
    com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var = malloc(sizeof(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t));
    if (!com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var, 0, sizeof(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t));
    com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var->compatgroups = compatgroups;
    com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var->enabled = enabled;
    return com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_create(
    config_node_property_array_t *compatgroups,
    config_node_property_boolean_t *enabled
    ) {
    com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *result = com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_create_internal (
        compatgroups,
        enabled
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_free(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties) {
    if(NULL == com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties){
        return ;
    }
    if(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups) {
        config_node_property_array_free(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups);
        com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups = NULL;
    }
    if (com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled) {
        config_node_property_boolean_free(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled);
        com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled = NULL;
    }
    free(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties);
}

cJSON *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_convertToJSON(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups
    if(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups) {
    cJSON *compatgroups_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups);
    if(compatgroups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compatgroups", compatgroups_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled
    if(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled);
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

com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_parseFromJSON(cJSON *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_propertiesJSON){

    com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_t *com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups
    config_node_property_array_t *compatgroups_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->compatgroups
    cJSON *compatgroups = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_propertiesJSON, "compatgroups");
    if (cJSON_IsNull(compatgroups)) {
        compatgroups = NULL;
    }
    if (compatgroups) { 
    compatgroups_local_nonprim = config_node_property_array_parseFromJSON(compatgroups); //nonprimitive
    }

    // com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_compatrouter_impl_compat_switching_service_impl_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }



    com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var = com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_create_internal (
        compatgroups ? compatgroups_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL
        );

    if (!com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties_local_var;
end:
    if (compatgroups_local_nonprim) {
        config_node_property_array_free(compatgroups_local_nonprim);
        compatgroups_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    return NULL;

}
