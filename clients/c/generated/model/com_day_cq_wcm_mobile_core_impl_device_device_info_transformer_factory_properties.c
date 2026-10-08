#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties.h"



static com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_create_internal(
    config_node_property_boolean_t *device_info_transformer_enabled,
    config_node_property_string_t *device_info_transformer_css_style
    ) {
    com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var = malloc(sizeof(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t));
    if (!com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var, 0, sizeof(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t));
    com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var->device_info_transformer_enabled = device_info_transformer_enabled;
    com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var->device_info_transformer_css_style = device_info_transformer_css_style;
    return com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_create(
    config_node_property_boolean_t *device_info_transformer_enabled,
    config_node_property_string_t *device_info_transformer_css_style
    ) {
    com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *result = com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_create_internal (
        device_info_transformer_enabled,
        device_info_transformer_css_style
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_free(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties) {
    if(NULL == com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties){
        return ;
    }
    if(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled);
        com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled = NULL;
    }
    if (com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style) {
        config_node_property_string_free(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style);
        com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style = NULL;
    }
    free(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties);
}

cJSON *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_convertToJSON(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled
    if(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled) {
    cJSON *device_info_transformer_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled);
    if(device_info_transformer_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "device.info.transformer.enabled", device_info_transformer_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style
    if(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style) {
    cJSON *device_info_transformer_css_style_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style);
    if(device_info_transformer_css_style_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "device.info.transformer.css.style", device_info_transformer_css_style_local_JSON);
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

com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_parseFromJSON(cJSON *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_propertiesJSON){

    com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_t *com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled
    config_node_property_boolean_t *device_info_transformer_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style
    config_node_property_string_t *device_info_transformer_css_style_local_nonprim = NULL;

    // com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_enabled
    cJSON *device_info_transformer_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_propertiesJSON, "device.info.transformer.enabled");
    if (cJSON_IsNull(device_info_transformer_enabled)) {
        device_info_transformer_enabled = NULL;
    }
    if (device_info_transformer_enabled) { 
    device_info_transformer_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(device_info_transformer_enabled); //nonprimitive
    }

    // com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties->device_info_transformer_css_style
    cJSON *device_info_transformer_css_style = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_propertiesJSON, "device.info.transformer.css.style");
    if (cJSON_IsNull(device_info_transformer_css_style)) {
        device_info_transformer_css_style = NULL;
    }
    if (device_info_transformer_css_style) { 
    device_info_transformer_css_style_local_nonprim = config_node_property_string_parseFromJSON(device_info_transformer_css_style); //nonprimitive
    }



    com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var = com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_create_internal (
        device_info_transformer_enabled ? device_info_transformer_enabled_local_nonprim : NULL,
        device_info_transformer_css_style ? device_info_transformer_css_style_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_local_var;
end:
    if (device_info_transformer_enabled_local_nonprim) {
        config_node_property_boolean_free(device_info_transformer_enabled_local_nonprim);
        device_info_transformer_enabled_local_nonprim = NULL;
    }
    if (device_info_transformer_css_style_local_nonprim) {
        config_node_property_string_free(device_info_transformer_css_style_local_nonprim);
        device_info_transformer_css_style_local_nonprim = NULL;
    }
    return NULL;

}
