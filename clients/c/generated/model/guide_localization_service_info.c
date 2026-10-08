#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "guide_localization_service_info.h"



static guide_localization_service_info_t *guide_localization_service_info_create_internal(
    char *pid,
    char *title,
    char *description,
    guide_localization_service_properties_t *properties
    ) {
    guide_localization_service_info_t *guide_localization_service_info_local_var = malloc(sizeof(guide_localization_service_info_t));
    if (!guide_localization_service_info_local_var) {
        return NULL;
    }
    memset(guide_localization_service_info_local_var, 0, sizeof(guide_localization_service_info_t));
    guide_localization_service_info_local_var->_library_owned = 1;
    guide_localization_service_info_local_var->pid = pid;
    guide_localization_service_info_local_var->title = title;
    guide_localization_service_info_local_var->description = description;
    guide_localization_service_info_local_var->properties = properties;
    return guide_localization_service_info_local_var;
}

__attribute__((deprecated)) guide_localization_service_info_t *guide_localization_service_info_create(
    char *pid,
    char *title,
    char *description,
    guide_localization_service_properties_t *properties
    ) {
    guide_localization_service_info_t *result = guide_localization_service_info_create_internal (
        pid,
        title,
        description,
        properties
        );
    if (!result) {
    }
    return result;
}

void guide_localization_service_info_free(guide_localization_service_info_t *guide_localization_service_info) {
    if(NULL == guide_localization_service_info){
        return ;
    }
    if(guide_localization_service_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "guide_localization_service_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (guide_localization_service_info->pid) {
        free(guide_localization_service_info->pid);
        guide_localization_service_info->pid = NULL;
    }
    if (guide_localization_service_info->title) {
        free(guide_localization_service_info->title);
        guide_localization_service_info->title = NULL;
    }
    if (guide_localization_service_info->description) {
        free(guide_localization_service_info->description);
        guide_localization_service_info->description = NULL;
    }
    if (guide_localization_service_info->properties) {
        guide_localization_service_properties_free(guide_localization_service_info->properties);
        guide_localization_service_info->properties = NULL;
    }
    free(guide_localization_service_info);
}

cJSON *guide_localization_service_info_convertToJSON(guide_localization_service_info_t *guide_localization_service_info) {
    cJSON *item = cJSON_CreateObject();

    // guide_localization_service_info->pid
    if(guide_localization_service_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", guide_localization_service_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // guide_localization_service_info->title
    if(guide_localization_service_info->title) {
    if(cJSON_AddStringToObject(item, "title", guide_localization_service_info->title) == NULL) {
    goto fail; //String
    }
    }


    // guide_localization_service_info->description
    if(guide_localization_service_info->description) {
    if(cJSON_AddStringToObject(item, "description", guide_localization_service_info->description) == NULL) {
    goto fail; //String
    }
    }


    // guide_localization_service_info->properties
    if(guide_localization_service_info->properties) {
    cJSON *properties_local_JSON = guide_localization_service_properties_convertToJSON(guide_localization_service_info->properties);
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

guide_localization_service_info_t *guide_localization_service_info_parseFromJSON(cJSON *guide_localization_service_infoJSON){

    guide_localization_service_info_t *guide_localization_service_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for guide_localization_service_info->properties
    guide_localization_service_properties_t *properties_local_nonprim = NULL;

    // guide_localization_service_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(guide_localization_service_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // guide_localization_service_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(guide_localization_service_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // guide_localization_service_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(guide_localization_service_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // guide_localization_service_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(guide_localization_service_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = guide_localization_service_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    guide_localization_service_info_local_var = guide_localization_service_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!guide_localization_service_info_local_var) {
        goto end;
    }

    return guide_localization_service_info_local_var;
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
        guide_localization_service_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
