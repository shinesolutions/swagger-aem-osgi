#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info.h"



static com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_create_internal(
    char *pid,
    char *title,
    char *description,
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties_t *properties
    ) {
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var = malloc(sizeof(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t));
    if (!com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var, 0, sizeof(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t));
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var->_library_owned = 1;
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var->pid = pid;
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var->title = title;
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var->description = description;
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var->properties = properties;
    return com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_create(
    char *pid,
    char *title,
    char *description,
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties_t *properties
    ) {
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *result = com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_create_internal (
        pid,
        title,
        description,
        properties
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_free(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info) {
    if(NULL == com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info){
        return ;
    }
    if(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->pid) {
        free(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->pid);
        com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->pid = NULL;
    }
    if (com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->title) {
        free(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->title);
        com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->title = NULL;
    }
    if (com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->description) {
        free(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->description);
        com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->description = NULL;
    }
    if (com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties) {
        com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties_free(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties);
        com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties = NULL;
    }
    free(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info);
}

cJSON *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_convertToJSON(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->pid
    if(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->pid) {
    if(cJSON_AddStringToObject(item, "pid", com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->pid) == NULL) {
    goto fail; //String
    }
    }


    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->title
    if(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->title) {
    if(cJSON_AddStringToObject(item, "title", com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->title) == NULL) {
    goto fail; //String
    }
    }


    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->description
    if(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->description) {
    if(cJSON_AddStringToObject(item, "description", com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->description) == NULL) {
    goto fail; //String
    }
    }


    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties
    if(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties) {
    cJSON *properties_local_JSON = com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties_convertToJSON(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties);
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

com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_parseFromJSON(cJSON *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_infoJSON){

    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_t *com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var = NULL;

    char *pid_local_str = NULL;

    char *title_local_str = NULL;

    char *description_local_str = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties
    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties_t *properties_local_nonprim = NULL;

    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->pid
    cJSON *pid = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_infoJSON, "pid");
    if (cJSON_IsNull(pid)) {
        pid = NULL;
    }
    if (pid) { 
    if(!cJSON_IsString(pid) && !cJSON_IsNull(pid))
    {
    goto end; //String
    }
    }

    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_infoJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_infoJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_infoJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties_parseFromJSON(properties); //nonprimitive
    }


    if (pid && !cJSON_IsNull(pid)) pid_local_str = strdup(pid->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var = com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_create_internal (
        pid_local_str,
        title_local_str,
        description_local_str,
        properties ? properties_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var) {
        goto end;
    }

    return com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_info_local_var;
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
        com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
