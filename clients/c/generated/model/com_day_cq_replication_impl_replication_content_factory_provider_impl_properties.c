#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_replication_content_factory_provider_impl_properties.h"



static com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_create_internal(
    config_node_property_boolean_t *replication_content_use_file_storage,
    config_node_property_integer_t *replication_content_max_commit_attempts
    ) {
    com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t));
    if (!com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var, 0, sizeof(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t));
    com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var->replication_content_use_file_storage = replication_content_use_file_storage;
    com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var->replication_content_max_commit_attempts = replication_content_max_commit_attempts;
    return com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_create(
    config_node_property_boolean_t *replication_content_use_file_storage,
    config_node_property_integer_t *replication_content_max_commit_attempts
    ) {
    com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *result = com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_create_internal (
        replication_content_use_file_storage,
        replication_content_max_commit_attempts
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_free(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties) {
    if(NULL == com_day_cq_replication_impl_replication_content_factory_provider_impl_properties){
        return ;
    }
    if(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage) {
        config_node_property_boolean_free(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage);
        com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage = NULL;
    }
    if (com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts) {
        config_node_property_integer_free(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts);
        com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts = NULL;
    }
    free(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties);
}

cJSON *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_convertToJSON(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage
    if(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage) {
    cJSON *replication_content_use_file_storage_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage);
    if(replication_content_use_file_storage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "replication.content.useFileStorage", replication_content_use_file_storage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts
    if(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts) {
    cJSON *replication_content_max_commit_attempts_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts);
    if(replication_content_max_commit_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "replication.content.maxCommitAttempts", replication_content_max_commit_attempts_local_JSON);
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

com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_replication_content_factory_provider_impl_propertiesJSON){

    com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_t *com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage
    config_node_property_boolean_t *replication_content_use_file_storage_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts
    config_node_property_integer_t *replication_content_max_commit_attempts_local_nonprim = NULL;

    // com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_use_file_storage
    cJSON *replication_content_use_file_storage = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_replication_content_factory_provider_impl_propertiesJSON, "replication.content.useFileStorage");
    if (cJSON_IsNull(replication_content_use_file_storage)) {
        replication_content_use_file_storage = NULL;
    }
    if (replication_content_use_file_storage) { 
    replication_content_use_file_storage_local_nonprim = config_node_property_boolean_parseFromJSON(replication_content_use_file_storage); //nonprimitive
    }

    // com_day_cq_replication_impl_replication_content_factory_provider_impl_properties->replication_content_max_commit_attempts
    cJSON *replication_content_max_commit_attempts = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_replication_content_factory_provider_impl_propertiesJSON, "replication.content.maxCommitAttempts");
    if (cJSON_IsNull(replication_content_max_commit_attempts)) {
        replication_content_max_commit_attempts = NULL;
    }
    if (replication_content_max_commit_attempts) { 
    replication_content_max_commit_attempts_local_nonprim = config_node_property_integer_parseFromJSON(replication_content_max_commit_attempts); //nonprimitive
    }



    com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var = com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_create_internal (
        replication_content_use_file_storage ? replication_content_use_file_storage_local_nonprim : NULL,
        replication_content_max_commit_attempts ? replication_content_max_commit_attempts_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_replication_content_factory_provider_impl_properties_local_var;
end:
    if (replication_content_use_file_storage_local_nonprim) {
        config_node_property_boolean_free(replication_content_use_file_storage_local_nonprim);
        replication_content_use_file_storage_local_nonprim = NULL;
    }
    if (replication_content_max_commit_attempts_local_nonprim) {
        config_node_property_integer_free(replication_content_max_commit_attempts_local_nonprim);
        replication_content_max_commit_attempts_local_nonprim = NULL;
    }
    return NULL;

}
