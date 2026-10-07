#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_statistics_impl_statistics_service_impl_properties.h"



static com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties_create_internal(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_string_t *path,
    config_node_property_string_t *workspace,
    config_node_property_string_t *keywords_path,
    config_node_property_boolean_t *async_entries
    ) {
    com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties_local_var = malloc(sizeof(com_day_cq_statistics_impl_statistics_service_impl_properties_t));
    if (!com_day_cq_statistics_impl_statistics_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_statistics_impl_statistics_service_impl_properties_local_var, 0, sizeof(com_day_cq_statistics_impl_statistics_service_impl_properties_t));
    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var->scheduler_period = scheduler_period;
    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var->scheduler_concurrent = scheduler_concurrent;
    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var->path = path;
    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var->workspace = workspace;
    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var->keywords_path = keywords_path;
    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var->async_entries = async_entries;
    return com_day_cq_statistics_impl_statistics_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties_create(
    config_node_property_integer_t *scheduler_period,
    config_node_property_boolean_t *scheduler_concurrent,
    config_node_property_string_t *path,
    config_node_property_string_t *workspace,
    config_node_property_string_t *keywords_path,
    config_node_property_boolean_t *async_entries
    ) {
    com_day_cq_statistics_impl_statistics_service_impl_properties_t *result = com_day_cq_statistics_impl_statistics_service_impl_properties_create_internal (
        scheduler_period,
        scheduler_concurrent,
        path,
        workspace,
        keywords_path,
        async_entries
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_statistics_impl_statistics_service_impl_properties_free(com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties) {
    if(NULL == com_day_cq_statistics_impl_statistics_service_impl_properties){
        return ;
    }
    if(com_day_cq_statistics_impl_statistics_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_statistics_impl_statistics_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period) {
        config_node_property_integer_free(com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period);
        com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period = NULL;
    }
    if (com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent) {
        config_node_property_boolean_free(com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent);
        com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent = NULL;
    }
    if (com_day_cq_statistics_impl_statistics_service_impl_properties->path) {
        config_node_property_string_free(com_day_cq_statistics_impl_statistics_service_impl_properties->path);
        com_day_cq_statistics_impl_statistics_service_impl_properties->path = NULL;
    }
    if (com_day_cq_statistics_impl_statistics_service_impl_properties->workspace) {
        config_node_property_string_free(com_day_cq_statistics_impl_statistics_service_impl_properties->workspace);
        com_day_cq_statistics_impl_statistics_service_impl_properties->workspace = NULL;
    }
    if (com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path) {
        config_node_property_string_free(com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path);
        com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path = NULL;
    }
    if (com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries) {
        config_node_property_boolean_free(com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries);
        com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries = NULL;
    }
    free(com_day_cq_statistics_impl_statistics_service_impl_properties);
}

cJSON *com_day_cq_statistics_impl_statistics_service_impl_properties_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period
    if(com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period) {
    cJSON *scheduler_period_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period);
    if(scheduler_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.period", scheduler_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent
    if(com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent) {
    cJSON *scheduler_concurrent_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent);
    if(scheduler_concurrent_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.concurrent", scheduler_concurrent_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_statistics_impl_statistics_service_impl_properties->path
    if(com_day_cq_statistics_impl_statistics_service_impl_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_statistics_impl_statistics_service_impl_properties->workspace
    if(com_day_cq_statistics_impl_statistics_service_impl_properties->workspace) {
    cJSON *workspace_local_JSON = config_node_property_string_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties->workspace);
    if(workspace_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workspace", workspace_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path
    if(com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path) {
    cJSON *keywords_path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path);
    if(keywords_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "keywordsPath", keywords_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries
    if(com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries) {
    cJSON *async_entries_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries);
    if(async_entries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asyncEntries", async_entries_local_JSON);
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

com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties_parseFromJSON(cJSON *com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON){

    com_day_cq_statistics_impl_statistics_service_impl_properties_t *com_day_cq_statistics_impl_statistics_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period
    config_node_property_integer_t *scheduler_period_local_nonprim = NULL;

    // define the local variable for com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent
    config_node_property_boolean_t *scheduler_concurrent_local_nonprim = NULL;

    // define the local variable for com_day_cq_statistics_impl_statistics_service_impl_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_day_cq_statistics_impl_statistics_service_impl_properties->workspace
    config_node_property_string_t *workspace_local_nonprim = NULL;

    // define the local variable for com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path
    config_node_property_string_t *keywords_path_local_nonprim = NULL;

    // define the local variable for com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries
    config_node_property_boolean_t *async_entries_local_nonprim = NULL;

    // com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_period
    cJSON *scheduler_period = cJSON_GetObjectItemCaseSensitive(com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON, "scheduler.period");
    if (cJSON_IsNull(scheduler_period)) {
        scheduler_period = NULL;
    }
    if (scheduler_period) { 
    scheduler_period_local_nonprim = config_node_property_integer_parseFromJSON(scheduler_period); //nonprimitive
    }

    // com_day_cq_statistics_impl_statistics_service_impl_properties->scheduler_concurrent
    cJSON *scheduler_concurrent = cJSON_GetObjectItemCaseSensitive(com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON, "scheduler.concurrent");
    if (cJSON_IsNull(scheduler_concurrent)) {
        scheduler_concurrent = NULL;
    }
    if (scheduler_concurrent) { 
    scheduler_concurrent_local_nonprim = config_node_property_boolean_parseFromJSON(scheduler_concurrent); //nonprimitive
    }

    // com_day_cq_statistics_impl_statistics_service_impl_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_day_cq_statistics_impl_statistics_service_impl_properties->workspace
    cJSON *workspace = cJSON_GetObjectItemCaseSensitive(com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON, "workspace");
    if (cJSON_IsNull(workspace)) {
        workspace = NULL;
    }
    if (workspace) { 
    workspace_local_nonprim = config_node_property_string_parseFromJSON(workspace); //nonprimitive
    }

    // com_day_cq_statistics_impl_statistics_service_impl_properties->keywords_path
    cJSON *keywords_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON, "keywordsPath");
    if (cJSON_IsNull(keywords_path)) {
        keywords_path = NULL;
    }
    if (keywords_path) { 
    keywords_path_local_nonprim = config_node_property_string_parseFromJSON(keywords_path); //nonprimitive
    }

    // com_day_cq_statistics_impl_statistics_service_impl_properties->async_entries
    cJSON *async_entries = cJSON_GetObjectItemCaseSensitive(com_day_cq_statistics_impl_statistics_service_impl_propertiesJSON, "asyncEntries");
    if (cJSON_IsNull(async_entries)) {
        async_entries = NULL;
    }
    if (async_entries) { 
    async_entries_local_nonprim = config_node_property_boolean_parseFromJSON(async_entries); //nonprimitive
    }



    com_day_cq_statistics_impl_statistics_service_impl_properties_local_var = com_day_cq_statistics_impl_statistics_service_impl_properties_create_internal (
        scheduler_period ? scheduler_period_local_nonprim : NULL,
        scheduler_concurrent ? scheduler_concurrent_local_nonprim : NULL,
        path ? path_local_nonprim : NULL,
        workspace ? workspace_local_nonprim : NULL,
        keywords_path ? keywords_path_local_nonprim : NULL,
        async_entries ? async_entries_local_nonprim : NULL
        );

    if (!com_day_cq_statistics_impl_statistics_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_statistics_impl_statistics_service_impl_properties_local_var;
end:
    if (scheduler_period_local_nonprim) {
        config_node_property_integer_free(scheduler_period_local_nonprim);
        scheduler_period_local_nonprim = NULL;
    }
    if (scheduler_concurrent_local_nonprim) {
        config_node_property_boolean_free(scheduler_concurrent_local_nonprim);
        scheduler_concurrent_local_nonprim = NULL;
    }
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (workspace_local_nonprim) {
        config_node_property_string_free(workspace_local_nonprim);
        workspace_local_nonprim = NULL;
    }
    if (keywords_path_local_nonprim) {
        config_node_property_string_free(keywords_path_local_nonprim);
        keywords_path_local_nonprim = NULL;
    }
    if (async_entries_local_nonprim) {
        config_node_property_boolean_free(async_entries_local_nonprim);
        async_entries_local_nonprim = NULL;
    }
    return NULL;

}
