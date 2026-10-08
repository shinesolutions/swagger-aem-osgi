#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties.h"



static com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_create_internal(
    config_node_property_boolean_t *detect_duplicate
    ) {
    com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t));
    com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var->detect_duplicate = detect_duplicate;
    return com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_create(
    config_node_property_boolean_t *detect_duplicate
    ) {
    com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *result = com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_create_internal (
        detect_duplicate
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_free(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate);
        com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate
    if(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate) {
    cJSON *detect_duplicate_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate);
    if(detect_duplicate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "detect_duplicate", detect_duplicate_local_JSON);
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

com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_create_asset_servlet_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_t *com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate
    config_node_property_boolean_t *detect_duplicate_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties->detect_duplicate
    cJSON *detect_duplicate = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_create_asset_servlet_propertiesJSON, "detect_duplicate");
    if (cJSON_IsNull(detect_duplicate)) {
        detect_duplicate = NULL;
    }
    if (detect_duplicate) { 
    detect_duplicate_local_nonprim = config_node_property_boolean_parseFromJSON(detect_duplicate); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var = com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_create_internal (
        detect_duplicate ? detect_duplicate_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_create_asset_servlet_properties_local_var;
end:
    if (detect_duplicate_local_nonprim) {
        config_node_property_boolean_free(detect_duplicate_local_nonprim);
        detect_duplicate_local_nonprim = NULL;
    }
    return NULL;

}
