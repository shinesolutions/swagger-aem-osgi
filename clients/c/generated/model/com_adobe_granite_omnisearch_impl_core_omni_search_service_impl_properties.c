#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties.h"



static com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_create_internal(
    config_node_property_integer_t *omnisearch_suggestion_requiretext_min,
    config_node_property_boolean_t *omnisearch_suggestion_spellcheck_require
    ) {
    com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var = malloc(sizeof(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t));
    if (!com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var, 0, sizeof(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t));
    com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var->omnisearch_suggestion_requiretext_min = omnisearch_suggestion_requiretext_min;
    com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var->omnisearch_suggestion_spellcheck_require = omnisearch_suggestion_spellcheck_require;
    return com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_create(
    config_node_property_integer_t *omnisearch_suggestion_requiretext_min,
    config_node_property_boolean_t *omnisearch_suggestion_spellcheck_require
    ) {
    com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *result = com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_create_internal (
        omnisearch_suggestion_requiretext_min,
        omnisearch_suggestion_spellcheck_require
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_free(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties) {
    if(NULL == com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties){
        return ;
    }
    if(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min) {
        config_node_property_integer_free(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min);
        com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min = NULL;
    }
    if (com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require) {
        config_node_property_boolean_free(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require);
        com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require = NULL;
    }
    free(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties);
}

cJSON *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_convertToJSON(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min
    if(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min) {
    cJSON *omnisearch_suggestion_requiretext_min_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min);
    if(omnisearch_suggestion_requiretext_min_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "omnisearch.suggestion.requiretext.min", omnisearch_suggestion_requiretext_min_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require
    if(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require) {
    cJSON *omnisearch_suggestion_spellcheck_require_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require);
    if(omnisearch_suggestion_spellcheck_require_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "omnisearch.suggestion.spellcheck.require", omnisearch_suggestion_spellcheck_require_local_JSON);
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

com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_parseFromJSON(cJSON *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_propertiesJSON){

    com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_t *com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min
    config_node_property_integer_t *omnisearch_suggestion_requiretext_min_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require
    config_node_property_boolean_t *omnisearch_suggestion_spellcheck_require_local_nonprim = NULL;

    // com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_requiretext_min
    cJSON *omnisearch_suggestion_requiretext_min = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_propertiesJSON, "omnisearch.suggestion.requiretext.min");
    if (cJSON_IsNull(omnisearch_suggestion_requiretext_min)) {
        omnisearch_suggestion_requiretext_min = NULL;
    }
    if (omnisearch_suggestion_requiretext_min) { 
    omnisearch_suggestion_requiretext_min_local_nonprim = config_node_property_integer_parseFromJSON(omnisearch_suggestion_requiretext_min); //nonprimitive
    }

    // com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties->omnisearch_suggestion_spellcheck_require
    cJSON *omnisearch_suggestion_spellcheck_require = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_propertiesJSON, "omnisearch.suggestion.spellcheck.require");
    if (cJSON_IsNull(omnisearch_suggestion_spellcheck_require)) {
        omnisearch_suggestion_spellcheck_require = NULL;
    }
    if (omnisearch_suggestion_spellcheck_require) { 
    omnisearch_suggestion_spellcheck_require_local_nonprim = config_node_property_boolean_parseFromJSON(omnisearch_suggestion_spellcheck_require); //nonprimitive
    }



    com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var = com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_create_internal (
        omnisearch_suggestion_requiretext_min ? omnisearch_suggestion_requiretext_min_local_nonprim : NULL,
        omnisearch_suggestion_spellcheck_require ? omnisearch_suggestion_spellcheck_require_local_nonprim : NULL
        );

    if (!com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_properties_local_var;
end:
    if (omnisearch_suggestion_requiretext_min_local_nonprim) {
        config_node_property_integer_free(omnisearch_suggestion_requiretext_min_local_nonprim);
        omnisearch_suggestion_requiretext_min_local_nonprim = NULL;
    }
    if (omnisearch_suggestion_spellcheck_require_local_nonprim) {
        config_node_property_boolean_free(omnisearch_suggestion_spellcheck_require_local_nonprim);
        omnisearch_suggestion_spellcheck_require_local_nonprim = NULL;
    }
    return NULL;

}
