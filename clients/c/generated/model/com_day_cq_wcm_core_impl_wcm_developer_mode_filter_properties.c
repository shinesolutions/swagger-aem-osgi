#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties.h"



static com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_create_internal(
    config_node_property_boolean_t *wcmdevmodefilter_enabled
    ) {
    com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t));
    if (!com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t));
    com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var->wcmdevmodefilter_enabled = wcmdevmodefilter_enabled;
    return com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_create(
    config_node_property_boolean_t *wcmdevmodefilter_enabled
    ) {
    com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *result = com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_create_internal (
        wcmdevmodefilter_enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_free(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties) {
    if(NULL == com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled);
        com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled = NULL;
    }
    free(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties);
}

cJSON *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_convertToJSON(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled
    if(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled) {
    cJSON *wcmdevmodefilter_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled);
    if(wcmdevmodefilter_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "wcmdevmodefilter.enabled", wcmdevmodefilter_enabled_local_JSON);
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

com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_propertiesJSON){

    com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_t *com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled
    config_node_property_boolean_t *wcmdevmodefilter_enabled_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties->wcmdevmodefilter_enabled
    cJSON *wcmdevmodefilter_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_wcm_developer_mode_filter_propertiesJSON, "wcmdevmodefilter.enabled");
    if (cJSON_IsNull(wcmdevmodefilter_enabled)) {
        wcmdevmodefilter_enabled = NULL;
    }
    if (wcmdevmodefilter_enabled) { 
    wcmdevmodefilter_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(wcmdevmodefilter_enabled); //nonprimitive
    }



    com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var = com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_create_internal (
        wcmdevmodefilter_enabled ? wcmdevmodefilter_enabled_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties_local_var;
end:
    if (wcmdevmodefilter_enabled_local_nonprim) {
        config_node_property_boolean_free(wcmdevmodefilter_enabled_local_nonprim);
        wcmdevmodefilter_enabled_local_nonprim = NULL;
    }
    return NULL;

}
