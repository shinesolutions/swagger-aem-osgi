#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_logging_impl_log_analyser_impl_properties.h"



static com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties_create_internal(
    config_node_property_integer_t *messages_queue_size,
    config_node_property_array_t *logger_config,
    config_node_property_integer_t *messages_size
    ) {
    com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var = malloc(sizeof(com_adobe_granite_logging_impl_log_analyser_impl_properties_t));
    if (!com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var, 0, sizeof(com_adobe_granite_logging_impl_log_analyser_impl_properties_t));
    com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var->messages_queue_size = messages_queue_size;
    com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var->logger_config = logger_config;
    com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var->messages_size = messages_size;
    return com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties_create(
    config_node_property_integer_t *messages_queue_size,
    config_node_property_array_t *logger_config,
    config_node_property_integer_t *messages_size
    ) {
    com_adobe_granite_logging_impl_log_analyser_impl_properties_t *result = com_adobe_granite_logging_impl_log_analyser_impl_properties_create_internal (
        messages_queue_size,
        logger_config,
        messages_size
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_logging_impl_log_analyser_impl_properties_free(com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties) {
    if(NULL == com_adobe_granite_logging_impl_log_analyser_impl_properties){
        return ;
    }
    if(com_adobe_granite_logging_impl_log_analyser_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_logging_impl_log_analyser_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size) {
        config_node_property_integer_free(com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size);
        com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size = NULL;
    }
    if (com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config) {
        config_node_property_array_free(com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config);
        com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config = NULL;
    }
    if (com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size) {
        config_node_property_integer_free(com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size);
        com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size = NULL;
    }
    free(com_adobe_granite_logging_impl_log_analyser_impl_properties);
}

cJSON *com_adobe_granite_logging_impl_log_analyser_impl_properties_convertToJSON(com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size
    if(com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size) {
    cJSON *messages_queue_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size);
    if(messages_queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "messages.queue.size", messages_queue_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config
    if(com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config) {
    cJSON *logger_config_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config);
    if(logger_config_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logger.config", logger_config_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size
    if(com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size) {
    cJSON *messages_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size);
    if(messages_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "messages.size", messages_size_local_JSON);
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

com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties_parseFromJSON(cJSON *com_adobe_granite_logging_impl_log_analyser_impl_propertiesJSON){

    com_adobe_granite_logging_impl_log_analyser_impl_properties_t *com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size
    config_node_property_integer_t *messages_queue_size_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config
    config_node_property_array_t *logger_config_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size
    config_node_property_integer_t *messages_size_local_nonprim = NULL;

    // com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_queue_size
    cJSON *messages_queue_size = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_logging_impl_log_analyser_impl_propertiesJSON, "messages.queue.size");
    if (cJSON_IsNull(messages_queue_size)) {
        messages_queue_size = NULL;
    }
    if (messages_queue_size) { 
    messages_queue_size_local_nonprim = config_node_property_integer_parseFromJSON(messages_queue_size); //nonprimitive
    }

    // com_adobe_granite_logging_impl_log_analyser_impl_properties->logger_config
    cJSON *logger_config = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_logging_impl_log_analyser_impl_propertiesJSON, "logger.config");
    if (cJSON_IsNull(logger_config)) {
        logger_config = NULL;
    }
    if (logger_config) { 
    logger_config_local_nonprim = config_node_property_array_parseFromJSON(logger_config); //nonprimitive
    }

    // com_adobe_granite_logging_impl_log_analyser_impl_properties->messages_size
    cJSON *messages_size = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_logging_impl_log_analyser_impl_propertiesJSON, "messages.size");
    if (cJSON_IsNull(messages_size)) {
        messages_size = NULL;
    }
    if (messages_size) { 
    messages_size_local_nonprim = config_node_property_integer_parseFromJSON(messages_size); //nonprimitive
    }



    com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var = com_adobe_granite_logging_impl_log_analyser_impl_properties_create_internal (
        messages_queue_size ? messages_queue_size_local_nonprim : NULL,
        logger_config ? logger_config_local_nonprim : NULL,
        messages_size ? messages_size_local_nonprim : NULL
        );

    if (!com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_logging_impl_log_analyser_impl_properties_local_var;
end:
    if (messages_queue_size_local_nonprim) {
        config_node_property_integer_free(messages_queue_size_local_nonprim);
        messages_queue_size_local_nonprim = NULL;
    }
    if (logger_config_local_nonprim) {
        config_node_property_array_free(logger_config_local_nonprim);
        logger_config_local_nonprim = NULL;
    }
    if (messages_size_local_nonprim) {
        config_node_property_integer_free(messages_size_local_nonprim);
        messages_size_local_nonprim = NULL;
    }
    return NULL;

}
