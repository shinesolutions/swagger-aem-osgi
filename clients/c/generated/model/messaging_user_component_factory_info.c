#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "messaging_user_component_factory_info.h"



static messaging_user_component_factory_info_t *messaging_user_component_factory_info_create_internal(
    char *pid,
    char *title,
    char *description,
    messaging_user_component_factory_properties_t *properties
    ) {
    messaging_user_component_factory_info_t *messaging_user_component_factory_info_local_var = malloc(sizeof(messaging_user_component_factory_info_t));
    if (!messaging_user_component_factory_info_local_var) {
        return NULL;
    }
    memset(messaging_user_component_factory_info_local_var, 0, sizeof(messaging_user_component_factory_info_t));
    messaging_user_component_factory_info_local_var->_library_owned = 1;
    messaging_user_component_factory_info_local_var->pid = pid;
    messaging_user_component_factory_info_local_var->title = title;
    messaging_user_component_factory_info_local_var->description = description;
    messaging_user_component_factory_info_local_var->properties = properties;
    return messaging_user_component_factory_info_local_var;
}

__attribute__((deprecated)) messaging_user_component_factory_info_t *messaging_user_component_factory_info_create(
    char *pid,
    char *title,
    char *description,
    messaging_user_component_factory_properties_t *properties
    ) {
    messaging_user_component_factory_info_t *result = messaging_user_component_factory_info_create_internal (
        pid,
        title,
        description,
        properties
        );
    if (!result) {
    }
    return result;
}

void messaging_user_component_factory_info_free(messaging_user_component_factory_info_t *messaging_user_component_factory_info) {
    if(NULL == messaging_user_component_factory_info){
        return ;
    }
    if(messaging_user_component_factory_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "messaging_user_component_factory_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (messaging_user_component_factory_info->pid) {
        free(messaging_user_component_factory_info->pid);
        messaging_user_component_factory_info->pid = NULL;
    }
    if (messaging_user_component_factory_info->title) {
        free(messaging_user_component_factory_info->title);
        messaging_user_component_factory_info->title = NULL;
    }
    if (messaging_user_component_factory_info->description) {
        free(messaging_user_component_factory_info->description);
        messaging_user_component_factory_info->description = NULL;
    }
    if (messaging_user_component_factory_info->properties) {
        messaging_user_component_factory_properties_free(messaging_user_component_factory_info->properties);
        messaging_user_component_factory_info->properties = NULL;
    }
    free(messaging_user_component_factory_info);
}

cJSON *messaging_user_component_factory_info_convertToJSON(messaging_user_component_factory_info_t *messaging_user_component_factory_info) {
    cJSON *item = cJSON_CreateObject();

    // messaging_user_component_factory_info->pid
    if(messaging_user_component_factory_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", messaging_user_component_factory_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // messaging_user_component_factory_info->title
    if(messaging_user_component_factory_info->title) {
    if(cJSON_AddStringToObject(item, "title", messaging_user_component_factory_info->title) == NULL) {
    goto fail; //String
    }
    }


    // messaging_user_component_factory_info->description
    if(messaging_user_component_factory_info->description) {
    if(cJSON_AddStringToObject(item, "description", messaging_user_component_factory_info->description) == NULL) {
    goto fail; //String
    }
    }


    // messaging_user_component_factory_info->properties
    if(messaging_user_component_factory_info->properties) {
    cJSON *properties_local_JSON = messaging_user_component_factory_properties_convertToJSON(messaging_user_component_factory_info->properties);
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

messaging_user_component_factory_info_t *messaging_user_component_factory_info_parseFromJSON(cJSON *messaging_user_component_factory_infoJSON){

    messaging_user_component_factory_info_t *messaging_user_component_factory_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for messaging_user_component_factory_info->properties
    messaging_user_component_factory_properties_t *properties_local_nonprim = NULL;

    // messaging_user_component_factory_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(messaging_user_component_factory_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // messaging_user_component_factory_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(messaging_user_component_factory_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // messaging_user_component_factory_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(messaging_user_component_factory_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // messaging_user_component_factory_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(messaging_user_component_factory_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = messaging_user_component_factory_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    messaging_user_component_factory_info_local_var = messaging_user_component_factory_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!messaging_user_component_factory_info_local_var) {
        goto end;
    }

    return messaging_user_component_factory_info_local_var;
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
        messaging_user_component_factory_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
