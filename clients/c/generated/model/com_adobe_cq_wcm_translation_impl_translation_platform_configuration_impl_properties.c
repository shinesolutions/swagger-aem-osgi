#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties.h"



static com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_create_internal(
    config_node_property_string_t *sync_translation_state_scheduling_format,
    config_node_property_string_t *scheduling_repeat_translation_scheduling_format,
    config_node_property_string_t *sync_translation_state_lock_timeout_in_minutes,
    config_node_property_drop_down_t *export_format
    ) {
    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var = malloc(sizeof(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t));
    if (!com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var, 0, sizeof(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t));
    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var->sync_translation_state_scheduling_format = sync_translation_state_scheduling_format;
    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var->scheduling_repeat_translation_scheduling_format = scheduling_repeat_translation_scheduling_format;
    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var->sync_translation_state_lock_timeout_in_minutes = sync_translation_state_lock_timeout_in_minutes;
    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var->export_format = export_format;
    return com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_create(
    config_node_property_string_t *sync_translation_state_scheduling_format,
    config_node_property_string_t *scheduling_repeat_translation_scheduling_format,
    config_node_property_string_t *sync_translation_state_lock_timeout_in_minutes,
    config_node_property_drop_down_t *export_format
    ) {
    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *result = com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_create_internal (
        sync_translation_state_scheduling_format,
        scheduling_repeat_translation_scheduling_format,
        sync_translation_state_lock_timeout_in_minutes,
        export_format
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_free(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties) {
    if(NULL == com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties){
        return ;
    }
    if(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format) {
        config_node_property_string_free(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format);
        com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format = NULL;
    }
    if (com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format) {
        config_node_property_string_free(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format);
        com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format = NULL;
    }
    if (com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes) {
        config_node_property_string_free(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes);
        com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes = NULL;
    }
    if (com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format) {
        config_node_property_drop_down_free(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format);
        com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format = NULL;
    }
    free(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties);
}

cJSON *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_convertToJSON(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format
    if(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format) {
    cJSON *sync_translation_state_scheduling_format_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format);
    if(sync_translation_state_scheduling_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "syncTranslationState.schedulingFormat", sync_translation_state_scheduling_format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format
    if(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format) {
    cJSON *scheduling_repeat_translation_scheduling_format_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format);
    if(scheduling_repeat_translation_scheduling_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "schedulingRepeatTranslation.schedulingFormat", scheduling_repeat_translation_scheduling_format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes
    if(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes) {
    cJSON *sync_translation_state_lock_timeout_in_minutes_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes);
    if(sync_translation_state_lock_timeout_in_minutes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "syncTranslationState.lockTimeoutInMinutes", sync_translation_state_lock_timeout_in_minutes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format
    if(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format) {
    cJSON *export_format_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format);
    if(export_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "export.format", export_format_local_JSON);
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

com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_parseFromJSON(cJSON *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_propertiesJSON){

    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_t *com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format
    config_node_property_string_t *sync_translation_state_scheduling_format_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format
    config_node_property_string_t *scheduling_repeat_translation_scheduling_format_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes
    config_node_property_string_t *sync_translation_state_lock_timeout_in_minutes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format
    config_node_property_drop_down_t *export_format_local_nonprim = NULL;

    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_scheduling_format
    cJSON *sync_translation_state_scheduling_format = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_propertiesJSON, "syncTranslationState.schedulingFormat");
    if (cJSON_IsNull(sync_translation_state_scheduling_format)) {
        sync_translation_state_scheduling_format = NULL;
    }
    if (sync_translation_state_scheduling_format) { 
    sync_translation_state_scheduling_format_local_nonprim = config_node_property_string_parseFromJSON(sync_translation_state_scheduling_format); //nonprimitive
    }

    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->scheduling_repeat_translation_scheduling_format
    cJSON *scheduling_repeat_translation_scheduling_format = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_propertiesJSON, "schedulingRepeatTranslation.schedulingFormat");
    if (cJSON_IsNull(scheduling_repeat_translation_scheduling_format)) {
        scheduling_repeat_translation_scheduling_format = NULL;
    }
    if (scheduling_repeat_translation_scheduling_format) { 
    scheduling_repeat_translation_scheduling_format_local_nonprim = config_node_property_string_parseFromJSON(scheduling_repeat_translation_scheduling_format); //nonprimitive
    }

    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->sync_translation_state_lock_timeout_in_minutes
    cJSON *sync_translation_state_lock_timeout_in_minutes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_propertiesJSON, "syncTranslationState.lockTimeoutInMinutes");
    if (cJSON_IsNull(sync_translation_state_lock_timeout_in_minutes)) {
        sync_translation_state_lock_timeout_in_minutes = NULL;
    }
    if (sync_translation_state_lock_timeout_in_minutes) { 
    sync_translation_state_lock_timeout_in_minutes_local_nonprim = config_node_property_string_parseFromJSON(sync_translation_state_lock_timeout_in_minutes); //nonprimitive
    }

    // com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties->export_format
    cJSON *export_format = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_propertiesJSON, "export.format");
    if (cJSON_IsNull(export_format)) {
        export_format = NULL;
    }
    if (export_format) { 
    export_format_local_nonprim = config_node_property_drop_down_parseFromJSON(export_format); //nonprimitive
    }



    com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var = com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_create_internal (
        sync_translation_state_scheduling_format ? sync_translation_state_scheduling_format_local_nonprim : NULL,
        scheduling_repeat_translation_scheduling_format ? scheduling_repeat_translation_scheduling_format_local_nonprim : NULL,
        sync_translation_state_lock_timeout_in_minutes ? sync_translation_state_lock_timeout_in_minutes_local_nonprim : NULL,
        export_format ? export_format_local_nonprim : NULL
        );

    if (!com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_properties_local_var;
end:
    if (sync_translation_state_scheduling_format_local_nonprim) {
        config_node_property_string_free(sync_translation_state_scheduling_format_local_nonprim);
        sync_translation_state_scheduling_format_local_nonprim = NULL;
    }
    if (scheduling_repeat_translation_scheduling_format_local_nonprim) {
        config_node_property_string_free(scheduling_repeat_translation_scheduling_format_local_nonprim);
        scheduling_repeat_translation_scheduling_format_local_nonprim = NULL;
    }
    if (sync_translation_state_lock_timeout_in_minutes_local_nonprim) {
        config_node_property_string_free(sync_translation_state_lock_timeout_in_minutes_local_nonprim);
        sync_translation_state_lock_timeout_in_minutes_local_nonprim = NULL;
    }
    if (export_format_local_nonprim) {
        config_node_property_drop_down_free(export_format_local_nonprim);
        export_format_local_nonprim = NULL;
    }
    return NULL;

}
