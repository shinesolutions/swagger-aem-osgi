#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "analytics_component_query_cache_service_info.h"



static analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info_create_internal(
    char *pid,
    char *title,
    char *description,
    analytics_component_query_cache_service_properties_t *properties
    ) {
    analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info_local_var = malloc(sizeof(analytics_component_query_cache_service_info_t));
    if (!analytics_component_query_cache_service_info_local_var) {
        return NULL;
    }
    memset(analytics_component_query_cache_service_info_local_var, 0, sizeof(analytics_component_query_cache_service_info_t));
    analytics_component_query_cache_service_info_local_var->_library_owned = 1;
    analytics_component_query_cache_service_info_local_var->pid = pid;
    analytics_component_query_cache_service_info_local_var->title = title;
    analytics_component_query_cache_service_info_local_var->description = description;
    analytics_component_query_cache_service_info_local_var->properties = properties;
    return analytics_component_query_cache_service_info_local_var;
}

__attribute__((deprecated)) analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info_create(
    char *pid,
    char *title,
    char *description,
    analytics_component_query_cache_service_properties_t *properties
    ) {
    analytics_component_query_cache_service_info_t *result = analytics_component_query_cache_service_info_create_internal (
        pid,
        title,
        description,
        properties
        );
    if (!result) {
    }
    return result;
}

void analytics_component_query_cache_service_info_free(analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info) {
    if(NULL == analytics_component_query_cache_service_info){
        return ;
    }
    if(analytics_component_query_cache_service_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "analytics_component_query_cache_service_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (analytics_component_query_cache_service_info->pid) {
        free(analytics_component_query_cache_service_info->pid);
        analytics_component_query_cache_service_info->pid = NULL;
    }
    if (analytics_component_query_cache_service_info->title) {
        free(analytics_component_query_cache_service_info->title);
        analytics_component_query_cache_service_info->title = NULL;
    }
    if (analytics_component_query_cache_service_info->description) {
        free(analytics_component_query_cache_service_info->description);
        analytics_component_query_cache_service_info->description = NULL;
    }
    if (analytics_component_query_cache_service_info->properties) {
        analytics_component_query_cache_service_properties_free(analytics_component_query_cache_service_info->properties);
        analytics_component_query_cache_service_info->properties = NULL;
    }
    free(analytics_component_query_cache_service_info);
}

cJSON *analytics_component_query_cache_service_info_convertToJSON(analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info) {
    cJSON *item = cJSON_CreateObject();

    // analytics_component_query_cache_service_info->pid
    if(analytics_component_query_cache_service_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", analytics_component_query_cache_service_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // analytics_component_query_cache_service_info->title
    if(analytics_component_query_cache_service_info->title) {
    if(cJSON_AddStringToObject(item, "title", analytics_component_query_cache_service_info->title) == NULL) {
    goto fail; //String
    }
    }


    // analytics_component_query_cache_service_info->description
    if(analytics_component_query_cache_service_info->description) {
    if(cJSON_AddStringToObject(item, "description", analytics_component_query_cache_service_info->description) == NULL) {
    goto fail; //String
    }
    }


    // analytics_component_query_cache_service_info->properties
    if(analytics_component_query_cache_service_info->properties) {
    cJSON *properties_local_JSON = analytics_component_query_cache_service_properties_convertToJSON(analytics_component_query_cache_service_info->properties);
    if(properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "properties", properties_local_JSON);
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

analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info_parseFromJSON(cJSON *analytics_component_query_cache_service_infoJSON){

    analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for analytics_component_query_cache_service_info->properties
    analytics_component_query_cache_service_properties_t *properties_local_nonprim = NULL;

    // analytics_component_query_cache_service_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(analytics_component_query_cache_service_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // analytics_component_query_cache_service_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(analytics_component_query_cache_service_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // analytics_component_query_cache_service_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(analytics_component_query_cache_service_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // analytics_component_query_cache_service_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(analytics_component_query_cache_service_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = analytics_component_query_cache_service_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    analytics_component_query_cache_service_info_local_var = analytics_component_query_cache_service_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!analytics_component_query_cache_service_info_local_var) {
        goto end;
    }

    return analytics_component_query_cache_service_info_local_var;
end:
    if (pid_local_str) {
        free(pid_local_str);
        pid_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (properties_local_nonprim) {
        analytics_component_query_cache_service_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
