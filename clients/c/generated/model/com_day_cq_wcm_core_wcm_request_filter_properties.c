#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_wcm_request_filter_properties.h"



static com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties_create_internal(
    config_node_property_drop_down_t *wcmfilter_mode
    ) {
    com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_wcm_request_filter_properties_t));
    if (!com_day_cq_wcm_core_wcm_request_filter_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_wcm_request_filter_properties_local_var, 0, sizeof(com_day_cq_wcm_core_wcm_request_filter_properties_t));
    com_day_cq_wcm_core_wcm_request_filter_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_wcm_request_filter_properties_local_var->wcmfilter_mode = wcmfilter_mode;
    return com_day_cq_wcm_core_wcm_request_filter_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties_create(
    config_node_property_drop_down_t *wcmfilter_mode
    ) {
    com_day_cq_wcm_core_wcm_request_filter_properties_t *result = com_day_cq_wcm_core_wcm_request_filter_properties_create_internal (
        wcmfilter_mode
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_wcm_request_filter_properties_free(com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties) {
    if(NULL == com_day_cq_wcm_core_wcm_request_filter_properties){
        return ;
    }
    if(com_day_cq_wcm_core_wcm_request_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_wcm_request_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode) {
        config_node_property_drop_down_free(com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode);
        com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode = NULL;
    }
    free(com_day_cq_wcm_core_wcm_request_filter_properties);
}

cJSON *com_day_cq_wcm_core_wcm_request_filter_properties_convertToJSON(com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode
    if(com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode) {
    cJSON *wcmfilter_mode_local_JSON = config_node_property_drop_down_convertToJSON(com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode);
    if(wcmfilter_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "wcmfilter.mode", wcmfilter_mode_local_JSON);
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

com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_wcm_request_filter_propertiesJSON){

    com_day_cq_wcm_core_wcm_request_filter_properties_t *com_day_cq_wcm_core_wcm_request_filter_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode
    config_node_property_drop_down_t *wcmfilter_mode_local_nonprim = NULL;

    // com_day_cq_wcm_core_wcm_request_filter_properties->wcmfilter_mode
    cJSON *wcmfilter_mode = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_wcm_request_filter_propertiesJSON, "wcmfilter.mode");
    if (cJSON_IsNull(wcmfilter_mode)) {
        wcmfilter_mode = NULL;
    }
    if (wcmfilter_mode) { 
    wcmfilter_mode_local_nonprim = config_node_property_drop_down_parseFromJSON(wcmfilter_mode); //nonprimitive
    }



    com_day_cq_wcm_core_wcm_request_filter_properties_local_var = com_day_cq_wcm_core_wcm_request_filter_properties_create_internal (
        wcmfilter_mode ? wcmfilter_mode_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_wcm_request_filter_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_wcm_request_filter_properties_local_var;
end:
    if (wcmfilter_mode_local_nonprim) {
        config_node_property_drop_down_free(wcmfilter_mode_local_nonprim);
        wcmfilter_mode_local_nonprim = NULL;
    }
    return NULL;

}
