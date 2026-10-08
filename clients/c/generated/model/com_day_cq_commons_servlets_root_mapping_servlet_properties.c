#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_commons_servlets_root_mapping_servlet_properties.h"



static com_day_cq_commons_servlets_root_mapping_servlet_properties_t *com_day_cq_commons_servlets_root_mapping_servlet_properties_create_internal(
    config_node_property_string_t *rootmapping_target
    ) {
    com_day_cq_commons_servlets_root_mapping_servlet_properties_t *com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var = malloc(sizeof(com_day_cq_commons_servlets_root_mapping_servlet_properties_t));
    if (!com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var, 0, sizeof(com_day_cq_commons_servlets_root_mapping_servlet_properties_t));
    com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var->rootmapping_target = rootmapping_target;
    return com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_commons_servlets_root_mapping_servlet_properties_t *com_day_cq_commons_servlets_root_mapping_servlet_properties_create(
    config_node_property_string_t *rootmapping_target
    ) {
    com_day_cq_commons_servlets_root_mapping_servlet_properties_t *result = com_day_cq_commons_servlets_root_mapping_servlet_properties_create_internal (
        rootmapping_target
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_commons_servlets_root_mapping_servlet_properties_free(com_day_cq_commons_servlets_root_mapping_servlet_properties_t *com_day_cq_commons_servlets_root_mapping_servlet_properties) {
    if(NULL == com_day_cq_commons_servlets_root_mapping_servlet_properties){
        return ;
    }
    if(com_day_cq_commons_servlets_root_mapping_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_commons_servlets_root_mapping_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target) {
        config_node_property_string_free(com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target);
        com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target = NULL;
    }
    free(com_day_cq_commons_servlets_root_mapping_servlet_properties);
}

cJSON *com_day_cq_commons_servlets_root_mapping_servlet_properties_convertToJSON(com_day_cq_commons_servlets_root_mapping_servlet_properties_t *com_day_cq_commons_servlets_root_mapping_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target
    if(com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target) {
    cJSON *rootmapping_target_local_JSON = config_node_property_string_convertToJSON(com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target);
    if(rootmapping_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rootmapping.target", rootmapping_target_local_JSON);
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

com_day_cq_commons_servlets_root_mapping_servlet_properties_t *com_day_cq_commons_servlets_root_mapping_servlet_properties_parseFromJSON(cJSON *com_day_cq_commons_servlets_root_mapping_servlet_propertiesJSON){

    com_day_cq_commons_servlets_root_mapping_servlet_properties_t *com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target
    config_node_property_string_t *rootmapping_target_local_nonprim = NULL;

    // com_day_cq_commons_servlets_root_mapping_servlet_properties->rootmapping_target
    cJSON *rootmapping_target = cJSON_GetObjectItemCaseSensitive(com_day_cq_commons_servlets_root_mapping_servlet_propertiesJSON, "rootmapping.target");
    if (cJSON_IsNull(rootmapping_target)) {
        rootmapping_target = NULL;
    }
    if (rootmapping_target) { 
    rootmapping_target_local_nonprim = config_node_property_string_parseFromJSON(rootmapping_target); //nonprimitive
    }



    com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var = com_day_cq_commons_servlets_root_mapping_servlet_properties_create_internal (
        rootmapping_target ? rootmapping_target_local_nonprim : NULL
        );

    if (!com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_commons_servlets_root_mapping_servlet_properties_local_var;
end:
    if (rootmapping_target_local_nonprim) {
        config_node_property_string_free(rootmapping_target_local_nonprim);
        rootmapping_target_local_nonprim = NULL;
    }
    return NULL;

}
