#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties.h"



static com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_create_internal(
    config_node_property_array_t *adapt_supported_widths
    ) {
    com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t));
    if (!com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t));
    com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var->adapt_supported_widths = adapt_supported_widths;
    return com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_create(
    config_node_property_array_t *adapt_supported_widths
    ) {
    com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *result = com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_create_internal (
        adapt_supported_widths
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_free(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties) {
    if(NULL == com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths) {
        config_node_property_array_free(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths);
        com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths = NULL;
    }
    free(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties);
}

cJSON *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_convertToJSON(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths
    if(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths) {
    cJSON *adapt_supported_widths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths);
    if(adapt_supported_widths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "adapt.supported.widths", adapt_supported_widths_local_JSON);
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

com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_propertiesJSON){

    com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_t *com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths
    config_node_property_array_t *adapt_supported_widths_local_nonprim = NULL;

    // com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties->adapt_supported_widths
    cJSON *adapt_supported_widths = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_propertiesJSON, "adapt.supported.widths");
    if (cJSON_IsNull(adapt_supported_widths)) {
        adapt_supported_widths = NULL;
    }
    if (adapt_supported_widths) { 
    adapt_supported_widths_local_nonprim = config_node_property_array_parseFromJSON(adapt_supported_widths); //nonprimitive
    }



    com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var = com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_create_internal (
        adapt_supported_widths ? adapt_supported_widths_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties_local_var;
end:
    if (adapt_supported_widths_local_nonprim) {
        config_node_property_array_free(adapt_supported_widths_local_nonprim);
        adapt_supported_widths_local_nonprim = NULL;
    }
    return NULL;

}
