#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "apache_sling_health_check_result_html_serializer_info.h"



static apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info_create_internal(
    char *pid,
    char *title,
    char *description,
    apache_sling_health_check_result_html_serializer_properties_t *properties
    ) {
    apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info_local_var = malloc(sizeof(apache_sling_health_check_result_html_serializer_info_t));
    if (!apache_sling_health_check_result_html_serializer_info_local_var) {
        return NULL;
    }
    memset(apache_sling_health_check_result_html_serializer_info_local_var, 0, sizeof(apache_sling_health_check_result_html_serializer_info_t));
    apache_sling_health_check_result_html_serializer_info_local_var->_library_owned = 1;
    apache_sling_health_check_result_html_serializer_info_local_var->pid = pid;
    apache_sling_health_check_result_html_serializer_info_local_var->title = title;
    apache_sling_health_check_result_html_serializer_info_local_var->description = description;
    apache_sling_health_check_result_html_serializer_info_local_var->properties = properties;
    return apache_sling_health_check_result_html_serializer_info_local_var;
}

__attribute__((deprecated)) apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info_create(
    char *pid,
    char *title,
    char *description,
    apache_sling_health_check_result_html_serializer_properties_t *properties
    ) {
    apache_sling_health_check_result_html_serializer_info_t *result = apache_sling_health_check_result_html_serializer_info_create_internal (
        pid,
        title,
        description,
        properties
        );
    if (!result) {
    }
    return result;
}

void apache_sling_health_check_result_html_serializer_info_free(apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info) {
    if(NULL == apache_sling_health_check_result_html_serializer_info){
        return ;
    }
    if(apache_sling_health_check_result_html_serializer_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "apache_sling_health_check_result_html_serializer_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (apache_sling_health_check_result_html_serializer_info->pid) {
        free(apache_sling_health_check_result_html_serializer_info->pid);
        apache_sling_health_check_result_html_serializer_info->pid = NULL;
    }
    if (apache_sling_health_check_result_html_serializer_info->title) {
        free(apache_sling_health_check_result_html_serializer_info->title);
        apache_sling_health_check_result_html_serializer_info->title = NULL;
    }
    if (apache_sling_health_check_result_html_serializer_info->description) {
        free(apache_sling_health_check_result_html_serializer_info->description);
        apache_sling_health_check_result_html_serializer_info->description = NULL;
    }
    if (apache_sling_health_check_result_html_serializer_info->properties) {
        apache_sling_health_check_result_html_serializer_properties_free(apache_sling_health_check_result_html_serializer_info->properties);
        apache_sling_health_check_result_html_serializer_info->properties = NULL;
    }
    free(apache_sling_health_check_result_html_serializer_info);
}

cJSON *apache_sling_health_check_result_html_serializer_info_convertToJSON(apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info) {
    cJSON *item = cJSON_CreateObject();

    // apache_sling_health_check_result_html_serializer_info->pid
    if(apache_sling_health_check_result_html_serializer_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", apache_sling_health_check_result_html_serializer_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // apache_sling_health_check_result_html_serializer_info->title
    if(apache_sling_health_check_result_html_serializer_info->title) {
    if(cJSON_AddStringToObject(item, "title", apache_sling_health_check_result_html_serializer_info->title) == NULL) {
    goto fail; //String
    }
    }


    // apache_sling_health_check_result_html_serializer_info->description
    if(apache_sling_health_check_result_html_serializer_info->description) {
    if(cJSON_AddStringToObject(item, "description", apache_sling_health_check_result_html_serializer_info->description) == NULL) {
    goto fail; //String
    }
    }


    // apache_sling_health_check_result_html_serializer_info->properties
    if(apache_sling_health_check_result_html_serializer_info->properties) {
    cJSON *properties_local_JSON = apache_sling_health_check_result_html_serializer_properties_convertToJSON(apache_sling_health_check_result_html_serializer_info->properties);
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

apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info_parseFromJSON(cJSON *apache_sling_health_check_result_html_serializer_infoJSON){

    apache_sling_health_check_result_html_serializer_info_t *apache_sling_health_check_result_html_serializer_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for apache_sling_health_check_result_html_serializer_info->properties
    apache_sling_health_check_result_html_serializer_properties_t *properties_local_nonprim = NULL;

    // apache_sling_health_check_result_html_serializer_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(apache_sling_health_check_result_html_serializer_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // apache_sling_health_check_result_html_serializer_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(apache_sling_health_check_result_html_serializer_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // apache_sling_health_check_result_html_serializer_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(apache_sling_health_check_result_html_serializer_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // apache_sling_health_check_result_html_serializer_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(apache_sling_health_check_result_html_serializer_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = apache_sling_health_check_result_html_serializer_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    apache_sling_health_check_result_html_serializer_info_local_var = apache_sling_health_check_result_html_serializer_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!apache_sling_health_check_result_html_serializer_info_local_var) {
        goto end;
    }

    return apache_sling_health_check_result_html_serializer_info_local_var;
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
        apache_sling_health_check_result_html_serializer_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
