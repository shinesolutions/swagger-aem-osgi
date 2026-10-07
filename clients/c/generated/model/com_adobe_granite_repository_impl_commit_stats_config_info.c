#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_repository_impl_commit_stats_config_info.h"



static com_adobe_granite_repository_impl_commit_stats_config_info_t *com_adobe_granite_repository_impl_commit_stats_config_info_create_internal(
    char *pid,
    char *title,
    char *description,
    com_adobe_granite_repository_impl_commit_stats_config_properties_t *properties,
    char *bundle_location,
    char *service_location
    ) {
    com_adobe_granite_repository_impl_commit_stats_config_info_t *com_adobe_granite_repository_impl_commit_stats_config_info_local_var = malloc(sizeof(com_adobe_granite_repository_impl_commit_stats_config_info_t));
    if (!com_adobe_granite_repository_impl_commit_stats_config_info_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_repository_impl_commit_stats_config_info_local_var, 0, sizeof(com_adobe_granite_repository_impl_commit_stats_config_info_t));
    com_adobe_granite_repository_impl_commit_stats_config_info_local_var->_library_owned = 1;
    com_adobe_granite_repository_impl_commit_stats_config_info_local_var->pid = pid;
    com_adobe_granite_repository_impl_commit_stats_config_info_local_var->title = title;
    com_adobe_granite_repository_impl_commit_stats_config_info_local_var->description = description;
    com_adobe_granite_repository_impl_commit_stats_config_info_local_var->properties = properties;
    com_adobe_granite_repository_impl_commit_stats_config_info_local_var->bundle_location = bundle_location;
    com_adobe_granite_repository_impl_commit_stats_config_info_local_var->service_location = service_location;
    return com_adobe_granite_repository_impl_commit_stats_config_info_local_var;
}

__attribute__((deprecated)) com_adobe_granite_repository_impl_commit_stats_config_info_t *com_adobe_granite_repository_impl_commit_stats_config_info_create(
    char *pid,
    char *title,
    char *description,
    com_adobe_granite_repository_impl_commit_stats_config_properties_t *properties,
    char *bundle_location,
    char *service_location
    ) {
    com_adobe_granite_repository_impl_commit_stats_config_info_t *result = com_adobe_granite_repository_impl_commit_stats_config_info_create_internal (
        pid,
        title,
        description,
        properties,
        bundle_location,
        service_location
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_repository_impl_commit_stats_config_info_free(com_adobe_granite_repository_impl_commit_stats_config_info_t *com_adobe_granite_repository_impl_commit_stats_config_info) {
    if(NULL == com_adobe_granite_repository_impl_commit_stats_config_info){
        return ;
    }
    if(com_adobe_granite_repository_impl_commit_stats_config_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_repository_impl_commit_stats_config_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_repository_impl_commit_stats_config_info->pid) {
        free(com_adobe_granite_repository_impl_commit_stats_config_info->pid);
        com_adobe_granite_repository_impl_commit_stats_config_info->pid = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_info->title) {
        free(com_adobe_granite_repository_impl_commit_stats_config_info->title);
        com_adobe_granite_repository_impl_commit_stats_config_info->title = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_info->description) {
        free(com_adobe_granite_repository_impl_commit_stats_config_info->description);
        com_adobe_granite_repository_impl_commit_stats_config_info->description = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_info->properties) {
        com_adobe_granite_repository_impl_commit_stats_config_properties_free(com_adobe_granite_repository_impl_commit_stats_config_info->properties);
        com_adobe_granite_repository_impl_commit_stats_config_info->properties = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_info->bundle_location) {
        free(com_adobe_granite_repository_impl_commit_stats_config_info->bundle_location);
        com_adobe_granite_repository_impl_commit_stats_config_info->bundle_location = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_info->service_location) {
        free(com_adobe_granite_repository_impl_commit_stats_config_info->service_location);
        com_adobe_granite_repository_impl_commit_stats_config_info->service_location = NULL;
    }
    free(com_adobe_granite_repository_impl_commit_stats_config_info);
}

cJSON *com_adobe_granite_repository_impl_commit_stats_config_info_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_info_t *com_adobe_granite_repository_impl_commit_stats_config_info) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_repository_impl_commit_stats_config_info->pid
    if(com_adobe_granite_repository_impl_commit_stats_config_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", com_adobe_granite_repository_impl_commit_stats_config_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_info->title
    if(com_adobe_granite_repository_impl_commit_stats_config_info->title) {
    if(cJSON_AddStringToObject(item, "title", com_adobe_granite_repository_impl_commit_stats_config_info->title) == NULL) {
    goto fail; //String
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_info->description
    if(com_adobe_granite_repository_impl_commit_stats_config_info->description) {
    if(cJSON_AddStringToObject(item, "description", com_adobe_granite_repository_impl_commit_stats_config_info->description) == NULL) {
    goto fail; //String
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_info->properties
    if(com_adobe_granite_repository_impl_commit_stats_config_info->properties) {
    cJSON *properties_local_JSON = com_adobe_granite_repository_impl_commit_stats_config_properties_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_info->properties);
    if(properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "properties", properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_info->bundle_location
    if(com_adobe_granite_repository_impl_commit_stats_config_info->bundle_location) {
    if(cJSON_AddStringToObject(item, "bundle_location", com_adobe_granite_repository_impl_commit_stats_config_info->bundle_location) == NULL) {
    goto fail; //String
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_info->service_location
    if(com_adobe_granite_repository_impl_commit_stats_config_info->service_location) {
    if(cJSON_AddStringToObject(item, "service_location", com_adobe_granite_repository_impl_commit_stats_config_info->service_location) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_adobe_granite_repository_impl_commit_stats_config_info_t *com_adobe_granite_repository_impl_commit_stats_config_info_parseFromJSON(cJSON *com_adobe_granite_repository_impl_commit_stats_config_infoJSON){

    com_adobe_granite_repository_impl_commit_stats_config_info_t *com_adobe_granite_repository_impl_commit_stats_config_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_info->properties
    com_adobe_granite_repository_impl_commit_stats_config_properties_t *properties_local_nonprim = NULL;

    char *bundle_location_local_str = NULL;

    char *service_location_local_str = NULL;

    // com_adobe_granite_repository_impl_commit_stats_config_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // com_adobe_granite_repository_impl_commit_stats_config_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // com_adobe_granite_repository_impl_commit_stats_config_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // com_adobe_granite_repository_impl_commit_stats_config_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = com_adobe_granite_repository_impl_commit_stats_config_properties_parseFromJSON(properties); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_info->bundle_location
    cJSON *bundle_location = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_infoJSON, "bundle_location");
    if (cJSON_IsNull(bundle_location)) {
        bundle_location = NULL;
    }
    if (bundle_location) { 
    if(!cJSON_IsString(bundle_location) && !cJSON_IsNull(bundle_location))
    {
    goto end; //String
    }
    }

    // com_adobe_granite_repository_impl_commit_stats_config_info->service_location
    cJSON *service_location = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_infoJSON, "service_location");
    if (cJSON_IsNull(service_location)) {
        service_location = NULL;
    }
    if (service_location) { 
    if(!cJSON_IsString(service_location) && !cJSON_IsNull(service_location))
    {
    goto end; //String
    }
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (bundle_location && !cJSON_IsNull(bundle_location)) bundle_location_local_str = strdup(bundle_location->valuestring);
    if (service_location && !cJSON_IsNull(service_location)) service_location_local_str = strdup(service_location->valuestring);

    com_adobe_granite_repository_impl_commit_stats_config_info_local_var = com_adobe_granite_repository_impl_commit_stats_config_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL,
        bundle_location_local_str,
        service_location_local_str
        );

    if (!com_adobe_granite_repository_impl_commit_stats_config_info_local_var) {
        goto end;
    }

    return com_adobe_granite_repository_impl_commit_stats_config_info_local_var;
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
        com_adobe_granite_repository_impl_commit_stats_config_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    if (bundle_location_local_str) {
        free(bundle_location_local_str);
        bundle_location_local_str = NULL;
    }
    if (service_location_local_str) {
        free(service_location_local_str);
        service_location_local_str = NULL;
    }
    return NULL;

}
