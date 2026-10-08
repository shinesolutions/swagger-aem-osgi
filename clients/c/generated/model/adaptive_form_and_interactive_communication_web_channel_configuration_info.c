#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "adaptive_form_and_interactive_communication_web_channel_configuration_info.h"



static adaptive_form_and_interactive_communication_web_channel_configuration_info_t *adaptive_form_and_interactive_communication_web_channel_configuration_info_create_internal(
    char *pid,
    char *title,
    char *description,
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *properties
    ) {
    adaptive_form_and_interactive_communication_web_channel_configuration_info_t *adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var = malloc(sizeof(adaptive_form_and_interactive_communication_web_channel_configuration_info_t));
    if (!adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var) {
        return NULL;
    }
    memset(adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var, 0, sizeof(adaptive_form_and_interactive_communication_web_channel_configuration_info_t));
    adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var->_library_owned = 1;
    adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var->pid = pid;
    adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var->title = title;
    adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var->description = description;
    adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var->properties = properties;
    return adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var;
}

__attribute__((deprecated)) adaptive_form_and_interactive_communication_web_channel_configuration_info_t *adaptive_form_and_interactive_communication_web_channel_configuration_info_create(
    char *pid,
    char *title,
    char *description,
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *properties
    ) {
    adaptive_form_and_interactive_communication_web_channel_configuration_info_t *result = adaptive_form_and_interactive_communication_web_channel_configuration_info_create_internal (
        pid,
        title,
        description,
        properties
        );
    if (!result) {
    }
    return result;
}

void adaptive_form_and_interactive_communication_web_channel_configuration_info_free(adaptive_form_and_interactive_communication_web_channel_configuration_info_t *adaptive_form_and_interactive_communication_web_channel_configuration_info) {
    if(NULL == adaptive_form_and_interactive_communication_web_channel_configuration_info){
        return ;
    }
    if(adaptive_form_and_interactive_communication_web_channel_configuration_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "adaptive_form_and_interactive_communication_web_channel_configuration_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (adaptive_form_and_interactive_communication_web_channel_configuration_info->pid) {
        free(adaptive_form_and_interactive_communication_web_channel_configuration_info->pid);
        adaptive_form_and_interactive_communication_web_channel_configuration_info->pid = NULL;
    }
    if (adaptive_form_and_interactive_communication_web_channel_configuration_info->title) {
        free(adaptive_form_and_interactive_communication_web_channel_configuration_info->title);
        adaptive_form_and_interactive_communication_web_channel_configuration_info->title = NULL;
    }
    if (adaptive_form_and_interactive_communication_web_channel_configuration_info->description) {
        free(adaptive_form_and_interactive_communication_web_channel_configuration_info->description);
        adaptive_form_and_interactive_communication_web_channel_configuration_info->description = NULL;
    }
    if (adaptive_form_and_interactive_communication_web_channel_configuration_info->properties) {
        adaptive_form_and_interactive_communication_web_channel_configuration_properties_free(adaptive_form_and_interactive_communication_web_channel_configuration_info->properties);
        adaptive_form_and_interactive_communication_web_channel_configuration_info->properties = NULL;
    }
    free(adaptive_form_and_interactive_communication_web_channel_configuration_info);
}

cJSON *adaptive_form_and_interactive_communication_web_channel_configuration_info_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_info_t *adaptive_form_and_interactive_communication_web_channel_configuration_info) {
    cJSON *item = cJSON_CreateObject();

    // adaptive_form_and_interactive_communication_web_channel_configuration_info->pid
    if(adaptive_form_and_interactive_communication_web_channel_configuration_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", adaptive_form_and_interactive_communication_web_channel_configuration_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // adaptive_form_and_interactive_communication_web_channel_configuration_info->title
    if(adaptive_form_and_interactive_communication_web_channel_configuration_info->title) {
    if(cJSON_AddStringToObject(item, "title", adaptive_form_and_interactive_communication_web_channel_configuration_info->title) == NULL) {
    goto fail; //String
    }
    }


    // adaptive_form_and_interactive_communication_web_channel_configuration_info->description
    if(adaptive_form_and_interactive_communication_web_channel_configuration_info->description) {
    if(cJSON_AddStringToObject(item, "description", adaptive_form_and_interactive_communication_web_channel_configuration_info->description) == NULL) {
    goto fail; //String
    }
    }


    // adaptive_form_and_interactive_communication_web_channel_configuration_info->properties
    if(adaptive_form_and_interactive_communication_web_channel_configuration_info->properties) {
    cJSON *properties_local_JSON = adaptive_form_and_interactive_communication_web_channel_configuration_properties_convertToJSON(adaptive_form_and_interactive_communication_web_channel_configuration_info->properties);
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

adaptive_form_and_interactive_communication_web_channel_configuration_info_t *adaptive_form_and_interactive_communication_web_channel_configuration_info_parseFromJSON(cJSON *adaptive_form_and_interactive_communication_web_channel_configuration_infoJSON){

    adaptive_form_and_interactive_communication_web_channel_configuration_info_t *adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for adaptive_form_and_interactive_communication_web_channel_configuration_info->properties
    adaptive_form_and_interactive_communication_web_channel_configuration_properties_t *properties_local_nonprim = NULL;

    // adaptive_form_and_interactive_communication_web_channel_configuration_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // adaptive_form_and_interactive_communication_web_channel_configuration_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // adaptive_form_and_interactive_communication_web_channel_configuration_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // adaptive_form_and_interactive_communication_web_channel_configuration_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(adaptive_form_and_interactive_communication_web_channel_configuration_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = adaptive_form_and_interactive_communication_web_channel_configuration_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var = adaptive_form_and_interactive_communication_web_channel_configuration_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var) {
        goto end;
    }

    return adaptive_form_and_interactive_communication_web_channel_configuration_info_local_var;
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
        adaptive_form_and_interactive_communication_web_channel_configuration_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
