#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_wcm_debug_filter_properties.h"



static com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *com_day_cq_wcm_core_impl_wcm_debug_filter_properties_create_internal(
    config_node_property_boolean_t *wcmdbgfilter_enabled,
    config_node_property_boolean_t *wcmdbgfilter_jsp_debug
    ) {
    com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t));
    if (!com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t));
    com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var->wcmdbgfilter_enabled = wcmdbgfilter_enabled;
    com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var->wcmdbgfilter_jsp_debug = wcmdbgfilter_jsp_debug;
    return com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *com_day_cq_wcm_core_impl_wcm_debug_filter_properties_create(
    config_node_property_boolean_t *wcmdbgfilter_enabled,
    config_node_property_boolean_t *wcmdbgfilter_jsp_debug
    ) {
    com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *result = com_day_cq_wcm_core_impl_wcm_debug_filter_properties_create_internal (
        wcmdbgfilter_enabled,
        wcmdbgfilter_jsp_debug
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_wcm_debug_filter_properties_free(com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *com_day_cq_wcm_core_impl_wcm_debug_filter_properties) {
    if(NULL == com_day_cq_wcm_core_impl_wcm_debug_filter_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_wcm_debug_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_wcm_debug_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled);
        com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled = NULL;
    }
    if (com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug);
        com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug = NULL;
    }
    free(com_day_cq_wcm_core_impl_wcm_debug_filter_properties);
}

cJSON *com_day_cq_wcm_core_impl_wcm_debug_filter_properties_convertToJSON(com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *com_day_cq_wcm_core_impl_wcm_debug_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled
    if(com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled) {
    cJSON *wcmdbgfilter_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled);
    if(wcmdbgfilter_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "wcmdbgfilter.enabled", wcmdbgfilter_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug
    if(com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug) {
    cJSON *wcmdbgfilter_jsp_debug_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug);
    if(wcmdbgfilter_jsp_debug_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "wcmdbgfilter.jspDebug", wcmdbgfilter_jsp_debug_local_JSON);
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

com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *com_day_cq_wcm_core_impl_wcm_debug_filter_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_wcm_debug_filter_propertiesJSON){

    com_day_cq_wcm_core_impl_wcm_debug_filter_properties_t *com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled
    config_node_property_boolean_t *wcmdbgfilter_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug
    config_node_property_boolean_t *wcmdbgfilter_jsp_debug_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_enabled
    cJSON *wcmdbgfilter_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_wcm_debug_filter_propertiesJSON, "wcmdbgfilter.enabled");
    if (cJSON_IsNull(wcmdbgfilter_enabled)) {
        wcmdbgfilter_enabled = NULL;
    }
    if (wcmdbgfilter_enabled) { 
    wcmdbgfilter_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(wcmdbgfilter_enabled); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_wcm_debug_filter_properties->wcmdbgfilter_jsp_debug
    cJSON *wcmdbgfilter_jsp_debug = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_wcm_debug_filter_propertiesJSON, "wcmdbgfilter.jspDebug");
    if (cJSON_IsNull(wcmdbgfilter_jsp_debug)) {
        wcmdbgfilter_jsp_debug = NULL;
    }
    if (wcmdbgfilter_jsp_debug) { 
    wcmdbgfilter_jsp_debug_local_nonprim = config_node_property_boolean_parseFromJSON(wcmdbgfilter_jsp_debug); //nonprimitive
    }



    com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var = com_day_cq_wcm_core_impl_wcm_debug_filter_properties_create_internal (
        wcmdbgfilter_enabled ? wcmdbgfilter_enabled_local_nonprim : NULL,
        wcmdbgfilter_jsp_debug ? wcmdbgfilter_jsp_debug_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_wcm_debug_filter_properties_local_var;
end:
    if (wcmdbgfilter_enabled_local_nonprim) {
        config_node_property_boolean_free(wcmdbgfilter_enabled_local_nonprim);
        wcmdbgfilter_enabled_local_nonprim = NULL;
    }
    if (wcmdbgfilter_jsp_debug_local_nonprim) {
        config_node_property_boolean_free(wcmdbgfilter_jsp_debug_local_nonprim);
        wcmdbgfilter_jsp_debug_local_nonprim = NULL;
    }
    return NULL;

}
