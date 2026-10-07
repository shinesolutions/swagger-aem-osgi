#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_history_impl_history_request_filter_properties.h"



static com_adobe_cq_history_impl_history_request_filter_properties_t *com_adobe_cq_history_impl_history_request_filter_properties_create_internal(
    config_node_property_array_t *history_request_filter_excluded_selectors,
    config_node_property_array_t *history_request_filter_excluded_extensions
    ) {
    com_adobe_cq_history_impl_history_request_filter_properties_t *com_adobe_cq_history_impl_history_request_filter_properties_local_var = malloc(sizeof(com_adobe_cq_history_impl_history_request_filter_properties_t));
    if (!com_adobe_cq_history_impl_history_request_filter_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_history_impl_history_request_filter_properties_local_var, 0, sizeof(com_adobe_cq_history_impl_history_request_filter_properties_t));
    com_adobe_cq_history_impl_history_request_filter_properties_local_var->_library_owned = 1;
    com_adobe_cq_history_impl_history_request_filter_properties_local_var->history_request_filter_excluded_selectors = history_request_filter_excluded_selectors;
    com_adobe_cq_history_impl_history_request_filter_properties_local_var->history_request_filter_excluded_extensions = history_request_filter_excluded_extensions;
    return com_adobe_cq_history_impl_history_request_filter_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_history_impl_history_request_filter_properties_t *com_adobe_cq_history_impl_history_request_filter_properties_create(
    config_node_property_array_t *history_request_filter_excluded_selectors,
    config_node_property_array_t *history_request_filter_excluded_extensions
    ) {
    com_adobe_cq_history_impl_history_request_filter_properties_t *result = com_adobe_cq_history_impl_history_request_filter_properties_create_internal (
        history_request_filter_excluded_selectors,
        history_request_filter_excluded_extensions
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_history_impl_history_request_filter_properties_free(com_adobe_cq_history_impl_history_request_filter_properties_t *com_adobe_cq_history_impl_history_request_filter_properties) {
    if(NULL == com_adobe_cq_history_impl_history_request_filter_properties){
        return ;
    }
    if(com_adobe_cq_history_impl_history_request_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_history_impl_history_request_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors) {
        config_node_property_array_free(com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors);
        com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors = NULL;
    }
    if (com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions) {
        config_node_property_array_free(com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions);
        com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions = NULL;
    }
    free(com_adobe_cq_history_impl_history_request_filter_properties);
}

cJSON *com_adobe_cq_history_impl_history_request_filter_properties_convertToJSON(com_adobe_cq_history_impl_history_request_filter_properties_t *com_adobe_cq_history_impl_history_request_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors
    if(com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors) {
    cJSON *history_request_filter_excluded_selectors_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors);
    if(history_request_filter_excluded_selectors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "history.requestFilter.excludedSelectors", history_request_filter_excluded_selectors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions
    if(com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions) {
    cJSON *history_request_filter_excluded_extensions_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions);
    if(history_request_filter_excluded_extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "history.requestFilter.excludedExtensions", history_request_filter_excluded_extensions_local_JSON);
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

com_adobe_cq_history_impl_history_request_filter_properties_t *com_adobe_cq_history_impl_history_request_filter_properties_parseFromJSON(cJSON *com_adobe_cq_history_impl_history_request_filter_propertiesJSON){

    com_adobe_cq_history_impl_history_request_filter_properties_t *com_adobe_cq_history_impl_history_request_filter_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors
    config_node_property_array_t *history_request_filter_excluded_selectors_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions
    config_node_property_array_t *history_request_filter_excluded_extensions_local_nonprim = NULL;

    // com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_selectors
    cJSON *history_request_filter_excluded_selectors = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_history_impl_history_request_filter_propertiesJSON, "history.requestFilter.excludedSelectors");
    if (cJSON_IsNull(history_request_filter_excluded_selectors)) {
        history_request_filter_excluded_selectors = NULL;
    }
    if (history_request_filter_excluded_selectors) { 
    history_request_filter_excluded_selectors_local_nonprim = config_node_property_array_parseFromJSON(history_request_filter_excluded_selectors); //nonprimitive
    }

    // com_adobe_cq_history_impl_history_request_filter_properties->history_request_filter_excluded_extensions
    cJSON *history_request_filter_excluded_extensions = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_history_impl_history_request_filter_propertiesJSON, "history.requestFilter.excludedExtensions");
    if (cJSON_IsNull(history_request_filter_excluded_extensions)) {
        history_request_filter_excluded_extensions = NULL;
    }
    if (history_request_filter_excluded_extensions) { 
    history_request_filter_excluded_extensions_local_nonprim = config_node_property_array_parseFromJSON(history_request_filter_excluded_extensions); //nonprimitive
    }



    com_adobe_cq_history_impl_history_request_filter_properties_local_var = com_adobe_cq_history_impl_history_request_filter_properties_create_internal (
        history_request_filter_excluded_selectors ? history_request_filter_excluded_selectors_local_nonprim : NULL,
        history_request_filter_excluded_extensions ? history_request_filter_excluded_extensions_local_nonprim : NULL
        );

    if (!com_adobe_cq_history_impl_history_request_filter_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_history_impl_history_request_filter_properties_local_var;
end:
    if (history_request_filter_excluded_selectors_local_nonprim) {
        config_node_property_array_free(history_request_filter_excluded_selectors_local_nonprim);
        history_request_filter_excluded_selectors_local_nonprim = NULL;
    }
    if (history_request_filter_excluded_extensions_local_nonprim) {
        config_node_property_array_free(history_request_filter_excluded_extensions_local_nonprim);
        history_request_filter_excluded_extensions_local_nonprim = NULL;
    }
    return NULL;

}
