#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties.h"



static com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_create_internal(
    config_node_property_array_t *firewall_deserialization_whitelist,
    config_node_property_array_t *firewall_deserialization_blacklist,
    config_node_property_string_t *firewall_deserialization_diagnostics
    ) {
    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var = malloc(sizeof(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t));
    if (!com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var, 0, sizeof(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t));
    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var->firewall_deserialization_whitelist = firewall_deserialization_whitelist;
    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var->firewall_deserialization_blacklist = firewall_deserialization_blacklist;
    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var->firewall_deserialization_diagnostics = firewall_deserialization_diagnostics;
    return com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_create(
    config_node_property_array_t *firewall_deserialization_whitelist,
    config_node_property_array_t *firewall_deserialization_blacklist,
    config_node_property_string_t *firewall_deserialization_diagnostics
    ) {
    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *result = com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_create_internal (
        firewall_deserialization_whitelist,
        firewall_deserialization_blacklist,
        firewall_deserialization_diagnostics
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_free(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties) {
    if(NULL == com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties){
        return ;
    }
    if(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist) {
        config_node_property_array_free(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist);
        com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist = NULL;
    }
    if (com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist) {
        config_node_property_array_free(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist);
        com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist = NULL;
    }
    if (com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics) {
        config_node_property_string_free(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics);
        com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics = NULL;
    }
    free(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties);
}

cJSON *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_convertToJSON(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist
    if(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist) {
    cJSON *firewall_deserialization_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist);
    if(firewall_deserialization_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "firewall.deserialization.whitelist", firewall_deserialization_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist
    if(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist) {
    cJSON *firewall_deserialization_blacklist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist);
    if(firewall_deserialization_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "firewall.deserialization.blacklist", firewall_deserialization_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics
    if(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics) {
    cJSON *firewall_deserialization_diagnostics_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics);
    if(firewall_deserialization_diagnostics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "firewall.deserialization.diagnostics", firewall_deserialization_diagnostics_local_JSON);
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

com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_parseFromJSON(cJSON *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propertiesJSON){

    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_t *com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist
    config_node_property_array_t *firewall_deserialization_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist
    config_node_property_array_t *firewall_deserialization_blacklist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics
    config_node_property_string_t *firewall_deserialization_diagnostics_local_nonprim = NULL;

    // com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_whitelist
    cJSON *firewall_deserialization_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propertiesJSON, "firewall.deserialization.whitelist");
    if (cJSON_IsNull(firewall_deserialization_whitelist)) {
        firewall_deserialization_whitelist = NULL;
    }
    if (firewall_deserialization_whitelist) { 
    firewall_deserialization_whitelist_local_nonprim = config_node_property_array_parseFromJSON(firewall_deserialization_whitelist); //nonprimitive
    }

    // com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_blacklist
    cJSON *firewall_deserialization_blacklist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propertiesJSON, "firewall.deserialization.blacklist");
    if (cJSON_IsNull(firewall_deserialization_blacklist)) {
        firewall_deserialization_blacklist = NULL;
    }
    if (firewall_deserialization_blacklist) { 
    firewall_deserialization_blacklist_local_nonprim = config_node_property_array_parseFromJSON(firewall_deserialization_blacklist); //nonprimitive
    }

    // com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties->firewall_deserialization_diagnostics
    cJSON *firewall_deserialization_diagnostics = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_deserfw_impl_deserialization_firewall_impl_propertiesJSON, "firewall.deserialization.diagnostics");
    if (cJSON_IsNull(firewall_deserialization_diagnostics)) {
        firewall_deserialization_diagnostics = NULL;
    }
    if (firewall_deserialization_diagnostics) { 
    firewall_deserialization_diagnostics_local_nonprim = config_node_property_string_parseFromJSON(firewall_deserialization_diagnostics); //nonprimitive
    }



    com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var = com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_create_internal (
        firewall_deserialization_whitelist ? firewall_deserialization_whitelist_local_nonprim : NULL,
        firewall_deserialization_blacklist ? firewall_deserialization_blacklist_local_nonprim : NULL,
        firewall_deserialization_diagnostics ? firewall_deserialization_diagnostics_local_nonprim : NULL
        );

    if (!com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_deserfw_impl_deserialization_firewall_impl_properties_local_var;
end:
    if (firewall_deserialization_whitelist_local_nonprim) {
        config_node_property_array_free(firewall_deserialization_whitelist_local_nonprim);
        firewall_deserialization_whitelist_local_nonprim = NULL;
    }
    if (firewall_deserialization_blacklist_local_nonprim) {
        config_node_property_array_free(firewall_deserialization_blacklist_local_nonprim);
        firewall_deserialization_blacklist_local_nonprim = NULL;
    }
    if (firewall_deserialization_diagnostics_local_nonprim) {
        config_node_property_string_free(firewall_deserialization_diagnostics_local_nonprim);
        firewall_deserialization_diagnostics_local_nonprim = NULL;
    }
    return NULL;

}
