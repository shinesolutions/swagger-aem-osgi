#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties.h"



static com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_create_internal(
    config_node_property_string_t *operation,
    config_node_property_string_t *operation_icon,
    config_node_property_string_t *topic_name,
    config_node_property_boolean_t *email_enabled
    ) {
    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t));
    if (!com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t));
    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var->operation = operation;
    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var->operation_icon = operation_icon;
    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var->topic_name = topic_name;
    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var->email_enabled = email_enabled;
    return com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_create(
    config_node_property_string_t *operation,
    config_node_property_string_t *operation_icon,
    config_node_property_string_t *topic_name,
    config_node_property_boolean_t *email_enabled
    ) {
    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *result = com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_create_internal (
        operation,
        operation_icon,
        topic_name,
        email_enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_free(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties) {
    if(NULL == com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation) {
        config_node_property_string_free(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation);
        com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation = NULL;
    }
    if (com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon) {
        config_node_property_string_free(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon);
        com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon = NULL;
    }
    if (com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name) {
        config_node_property_string_free(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name);
        com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name = NULL;
    }
    if (com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled);
        com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled = NULL;
    }
    free(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties);
}

cJSON *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_convertToJSON(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation
    if(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation) {
    cJSON *operation_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation);
    if(operation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "operation", operation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon
    if(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon) {
    cJSON *operation_icon_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon);
    if(operation_icon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "operationIcon", operation_icon_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name
    if(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name) {
    cJSON *topic_name_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name);
    if(topic_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "topicName", topic_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled
    if(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled) {
    cJSON *email_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled);
    if(email_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "emailEnabled", email_enabled_local_JSON);
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

com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_propertiesJSON){

    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_t *com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation
    config_node_property_string_t *operation_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon
    config_node_property_string_t *operation_icon_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name
    config_node_property_string_t *topic_name_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled
    config_node_property_boolean_t *email_enabled_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_propertiesJSON, "operation");
    if (cJSON_IsNull(operation)) {
        operation = NULL;
    }
    if (operation) { 
    operation_local_nonprim = config_node_property_string_parseFromJSON(operation); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->operation_icon
    cJSON *operation_icon = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_propertiesJSON, "operationIcon");
    if (cJSON_IsNull(operation_icon)) {
        operation_icon = NULL;
    }
    if (operation_icon) { 
    operation_icon_local_nonprim = config_node_property_string_parseFromJSON(operation_icon); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->topic_name
    cJSON *topic_name = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_propertiesJSON, "topicName");
    if (cJSON_IsNull(topic_name)) {
        topic_name = NULL;
    }
    if (topic_name) { 
    topic_name_local_nonprim = config_node_property_string_parseFromJSON(topic_name); //nonprimitive
    }

    // com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties->email_enabled
    cJSON *email_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_propertiesJSON, "emailEnabled");
    if (cJSON_IsNull(email_enabled)) {
        email_enabled = NULL;
    }
    if (email_enabled) { 
    email_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(email_enabled); //nonprimitive
    }



    com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var = com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_create_internal (
        operation ? operation_local_nonprim : NULL,
        operation_icon ? operation_icon_local_nonprim : NULL,
        topic_name ? topic_name_local_nonprim : NULL,
        email_enabled ? email_enabled_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties_local_var;
end:
    if (operation_local_nonprim) {
        config_node_property_string_free(operation_local_nonprim);
        operation_local_nonprim = NULL;
    }
    if (operation_icon_local_nonprim) {
        config_node_property_string_free(operation_icon_local_nonprim);
        operation_icon_local_nonprim = NULL;
    }
    if (topic_name_local_nonprim) {
        config_node_property_string_free(topic_name_local_nonprim);
        topic_name_local_nonprim = NULL;
    }
    if (email_enabled_local_nonprim) {
        config_node_property_boolean_free(email_enabled_local_nonprim);
        email_enabled_local_nonprim = NULL;
    }
    return NULL;

}
