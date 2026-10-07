#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties.h"



static com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_create_internal(
    config_node_property_boolean_t *create_preview_enabled,
    config_node_property_boolean_t *update_preview_enabled,
    config_node_property_integer_t *queue_size,
    config_node_property_string_t *folder_preview_rendition_regex
    ) {
    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t));
    if (!com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t));
    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var->create_preview_enabled = create_preview_enabled;
    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var->update_preview_enabled = update_preview_enabled;
    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var->queue_size = queue_size;
    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var->folder_preview_rendition_regex = folder_preview_rendition_regex;
    return com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_create(
    config_node_property_boolean_t *create_preview_enabled,
    config_node_property_boolean_t *update_preview_enabled,
    config_node_property_integer_t *queue_size,
    config_node_property_string_t *folder_preview_rendition_regex
    ) {
    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *result = com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_create_internal (
        create_preview_enabled,
        update_preview_enabled,
        queue_size,
        folder_preview_rendition_regex
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_free(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties) {
    if(NULL == com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled);
        com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled = NULL;
    }
    if (com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled);
        com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled = NULL;
    }
    if (com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size);
        com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size = NULL;
    }
    if (com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex) {
        config_node_property_string_free(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex);
        com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex = NULL;
    }
    free(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties);
}

cJSON *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_convertToJSON(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled
    if(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled) {
    cJSON *create_preview_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled);
    if(create_preview_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "createPreviewEnabled", create_preview_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled
    if(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled) {
    cJSON *update_preview_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled);
    if(update_preview_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "updatePreviewEnabled", update_preview_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size
    if(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size) {
    cJSON *queue_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size);
    if(queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queueSize", queue_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex
    if(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex) {
    cJSON *folder_preview_rendition_regex_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex);
    if(folder_preview_rendition_regex_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "folderPreviewRenditionRegex", folder_preview_rendition_regex_local_JSON);
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

com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_propertiesJSON){

    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_t *com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled
    config_node_property_boolean_t *create_preview_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled
    config_node_property_boolean_t *update_preview_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size
    config_node_property_integer_t *queue_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex
    config_node_property_string_t *folder_preview_rendition_regex_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->create_preview_enabled
    cJSON *create_preview_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_propertiesJSON, "createPreviewEnabled");
    if (cJSON_IsNull(create_preview_enabled)) {
        create_preview_enabled = NULL;
    }
    if (create_preview_enabled) { 
    create_preview_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(create_preview_enabled); //nonprimitive
    }

    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->update_preview_enabled
    cJSON *update_preview_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_propertiesJSON, "updatePreviewEnabled");
    if (cJSON_IsNull(update_preview_enabled)) {
        update_preview_enabled = NULL;
    }
    if (update_preview_enabled) { 
    update_preview_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(update_preview_enabled); //nonprimitive
    }

    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->queue_size
    cJSON *queue_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_propertiesJSON, "queueSize");
    if (cJSON_IsNull(queue_size)) {
        queue_size = NULL;
    }
    if (queue_size) { 
    queue_size_local_nonprim = config_node_property_integer_parseFromJSON(queue_size); //nonprimitive
    }

    // com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties->folder_preview_rendition_regex
    cJSON *folder_preview_rendition_regex = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_propertiesJSON, "folderPreviewRenditionRegex");
    if (cJSON_IsNull(folder_preview_rendition_regex)) {
        folder_preview_rendition_regex = NULL;
    }
    if (folder_preview_rendition_regex) { 
    folder_preview_rendition_regex_local_nonprim = config_node_property_string_parseFromJSON(folder_preview_rendition_regex); //nonprimitive
    }



    com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var = com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_create_internal (
        create_preview_enabled ? create_preview_enabled_local_nonprim : NULL,
        update_preview_enabled ? update_preview_enabled_local_nonprim : NULL,
        queue_size ? queue_size_local_nonprim : NULL,
        folder_preview_rendition_regex ? folder_preview_rendition_regex_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_properties_local_var;
end:
    if (create_preview_enabled_local_nonprim) {
        config_node_property_boolean_free(create_preview_enabled_local_nonprim);
        create_preview_enabled_local_nonprim = NULL;
    }
    if (update_preview_enabled_local_nonprim) {
        config_node_property_boolean_free(update_preview_enabled_local_nonprim);
        update_preview_enabled_local_nonprim = NULL;
    }
    if (queue_size_local_nonprim) {
        config_node_property_integer_free(queue_size_local_nonprim);
        queue_size_local_nonprim = NULL;
    }
    if (folder_preview_rendition_regex_local_nonprim) {
        config_node_property_string_free(folder_preview_rendition_regex_local_nonprim);
        folder_preview_rendition_regex_local_nonprim = NULL;
    }
    return NULL;

}
