#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties.h"



static com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_create_internal(
    config_node_property_string_t *path_builder_target,
    config_node_property_string_t *suggest_basepath
    ) {
    com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t));
    if (!com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var, 0, sizeof(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t));
    com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var->path_builder_target = path_builder_target;
    com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var->suggest_basepath = suggest_basepath;
    return com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_create(
    config_node_property_string_t *path_builder_target,
    config_node_property_string_t *suggest_basepath
    ) {
    com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *result = com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_create_internal (
        path_builder_target,
        suggest_basepath
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_free(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties) {
    if(NULL == com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties){
        return ;
    }
    if(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target) {
        config_node_property_string_free(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target);
        com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target = NULL;
    }
    if (com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath) {
        config_node_property_string_free(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath);
        com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath = NULL;
    }
    free(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties);
}

cJSON *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_convertToJSON(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target
    if(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target) {
    cJSON *path_builder_target_local_JSON = config_node_property_string_convertToJSON(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target);
    if(path_builder_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pathBuilder.target", path_builder_target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath
    if(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath) {
    cJSON *suggest_basepath_local_JSON = config_node_property_string_convertToJSON(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath);
    if(suggest_basepath_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "suggest.basepath", suggest_basepath_local_JSON);
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

com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_propertiesJSON){

    com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_t *com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target
    config_node_property_string_t *path_builder_target_local_nonprim = NULL;

    // define the local variable for com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath
    config_node_property_string_t *suggest_basepath_local_nonprim = NULL;

    // com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->path_builder_target
    cJSON *path_builder_target = cJSON_GetObjectItemCaseSensitive(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_propertiesJSON, "pathBuilder.target");
    if (cJSON_IsNull(path_builder_target)) {
        path_builder_target = NULL;
    }
    if (path_builder_target) { 
    path_builder_target_local_nonprim = config_node_property_string_parseFromJSON(path_builder_target); //nonprimitive
    }

    // com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties->suggest_basepath
    cJSON *suggest_basepath = cJSON_GetObjectItemCaseSensitive(com_day_cq_search_suggest_impl_suggestion_index_manager_impl_propertiesJSON, "suggest.basepath");
    if (cJSON_IsNull(suggest_basepath)) {
        suggest_basepath = NULL;
    }
    if (suggest_basepath) { 
    suggest_basepath_local_nonprim = config_node_property_string_parseFromJSON(suggest_basepath); //nonprimitive
    }



    com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var = com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_create_internal (
        path_builder_target ? path_builder_target_local_nonprim : NULL,
        suggest_basepath ? suggest_basepath_local_nonprim : NULL
        );

    if (!com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_search_suggest_impl_suggestion_index_manager_impl_properties_local_var;
end:
    if (path_builder_target_local_nonprim) {
        config_node_property_string_free(path_builder_target_local_nonprim);
        path_builder_target_local_nonprim = NULL;
    }
    if (suggest_basepath_local_nonprim) {
        config_node_property_string_free(suggest_basepath_local_nonprim);
        suggest_basepath_local_nonprim = NULL;
    }
    return NULL;

}
