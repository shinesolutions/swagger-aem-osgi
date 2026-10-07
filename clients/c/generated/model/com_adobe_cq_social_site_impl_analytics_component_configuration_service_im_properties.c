#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties.h"



static com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_create_internal(
    config_node_property_array_t *cq_social_console_analytics_components
    ) {
    com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var = malloc(sizeof(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t));
    if (!com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var, 0, sizeof(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t));
    com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var->cq_social_console_analytics_components = cq_social_console_analytics_components;
    return com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_create(
    config_node_property_array_t *cq_social_console_analytics_components
    ) {
    com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *result = com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_create_internal (
        cq_social_console_analytics_components
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_free(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties) {
    if(NULL == com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties){
        return ;
    }
    if(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components) {
        config_node_property_array_free(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components);
        com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components = NULL;
    }
    free(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties);
}

cJSON *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_convertToJSON(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components
    if(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components) {
    cJSON *cq_social_console_analytics_components_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components);
    if(cq_social_console_analytics_components_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.social.console.analytics.components", cq_social_console_analytics_components_local_JSON);
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

com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_parseFromJSON(cJSON *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_propertiesJSON){

    com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_t *com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components
    config_node_property_array_t *cq_social_console_analytics_components_local_nonprim = NULL;

    // com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties->cq_social_console_analytics_components
    cJSON *cq_social_console_analytics_components = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_propertiesJSON, "cq.social.console.analytics.components");
    if (cJSON_IsNull(cq_social_console_analytics_components)) {
        cq_social_console_analytics_components = NULL;
    }
    if (cq_social_console_analytics_components) { 
    cq_social_console_analytics_components_local_nonprim = config_node_property_array_parseFromJSON(cq_social_console_analytics_components); //nonprimitive
    }



    com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var = com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_create_internal (
        cq_social_console_analytics_components ? cq_social_console_analytics_components_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties_local_var;
end:
    if (cq_social_console_analytics_components_local_nonprim) {
        config_node_property_array_free(cq_social_console_analytics_components_local_nonprim);
        cq_social_console_analytics_components_local_nonprim = NULL;
    }
    return NULL;

}
