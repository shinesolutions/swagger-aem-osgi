#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties.h"



static com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_create_internal(
    config_node_property_boolean_t *ignore_path
    ) {
    com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var = malloc(sizeof(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t));
    if (!com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var, 0, sizeof(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t));
    com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var->_library_owned = 1;
    com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var->ignore_path = ignore_path;
    return com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_create(
    config_node_property_boolean_t *ignore_path
    ) {
    com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *result = com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_create_internal (
        ignore_path
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_free(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties) {
    if(NULL == com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties){
        return ;
    }
    if(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path) {
        config_node_property_boolean_free(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path);
        com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path = NULL;
    }
    free(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties);
}

cJSON *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_convertToJSON(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path
    if(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path) {
    cJSON *ignore_path_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path);
    if(ignore_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ignore_path", ignore_path_local_JSON);
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

com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_parseFromJSON(cJSON *com_day_cq_tagging_impl_search_tag_predicate_evaluator_propertiesJSON){

    com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_t *com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var = NULL;

    // define the local variable for com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path
    config_node_property_boolean_t *ignore_path_local_nonprim = NULL;

    // com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties->ignore_path
    cJSON *ignore_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_tagging_impl_search_tag_predicate_evaluator_propertiesJSON, "ignore_path");
    if (cJSON_IsNull(ignore_path)) {
        ignore_path = NULL;
    }
    if (ignore_path) { 
    ignore_path_local_nonprim = config_node_property_boolean_parseFromJSON(ignore_path); //nonprimitive
    }



    com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var = com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_create_internal (
        ignore_path ? ignore_path_local_nonprim : NULL
        );

    if (!com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var) {
        goto end;
    }

    return com_day_cq_tagging_impl_search_tag_predicate_evaluator_properties_local_var;
end:
    if (ignore_path_local_nonprim) {
        config_node_property_boolean_free(ignore_path_local_nonprim);
        ignore_path_local_nonprim = NULL;
    }
    return NULL;

}
