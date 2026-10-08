#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties.h"



static com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_create_internal(
    config_node_property_drop_down_t *dim_default_mode,
    config_node_property_boolean_t *dim_appcache_enabled
    ) {
    com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t));
    if (!com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t));
    com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var->dim_default_mode = dim_default_mode;
    com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var->dim_appcache_enabled = dim_appcache_enabled;
    return com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_create(
    config_node_property_drop_down_t *dim_default_mode,
    config_node_property_boolean_t *dim_appcache_enabled
    ) {
    com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *result = com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_create_internal (
        dim_default_mode,
        dim_appcache_enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_free(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties) {
    if(NULL == com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode) {
        config_node_property_drop_down_free(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode);
        com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode = NULL;
    }
    if (com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled);
        com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled = NULL;
    }
    free(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties);
}

cJSON *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode
    if(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode) {
    cJSON *dim_default_mode_local_JSON = config_node_property_drop_down_convertToJSON(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode);
    if(dim_default_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dim.default.mode", dim_default_mode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled
    if(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled) {
    cJSON *dim_appcache_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled);
    if(dim_appcache_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dim.appcache.enabled", dim_appcache_enabled_local_JSON);
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

com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_propertiesJSON){

    com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_t *com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode
    config_node_property_drop_down_t *dim_default_mode_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled
    config_node_property_boolean_t *dim_appcache_enabled_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_default_mode
    cJSON *dim_default_mode = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_propertiesJSON, "dim.default.mode");
    if (cJSON_IsNull(dim_default_mode)) {
        dim_default_mode = NULL;
    }
    if (dim_default_mode) { 
    dim_default_mode_local_nonprim = config_node_property_drop_down_parseFromJSON(dim_default_mode); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties->dim_appcache_enabled
    cJSON *dim_appcache_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_propertiesJSON, "dim.appcache.enabled");
    if (cJSON_IsNull(dim_appcache_enabled)) {
        dim_appcache_enabled = NULL;
    }
    if (dim_appcache_enabled) { 
    dim_appcache_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(dim_appcache_enabled); //nonprimitive
    }



    com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var = com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_create_internal (
        dim_default_mode ? dim_default_mode_local_nonprim : NULL,
        dim_appcache_enabled ? dim_appcache_enabled_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_properties_local_var;
end:
    if (dim_default_mode_local_nonprim) {
        config_node_property_drop_down_free(dim_default_mode_local_nonprim);
        dim_default_mode_local_nonprim = NULL;
    }
    if (dim_appcache_enabled_local_nonprim) {
        config_node_property_boolean_free(dim_appcache_enabled_local_nonprim);
        dim_appcache_enabled_local_nonprim = NULL;
    }
    return NULL;

}
