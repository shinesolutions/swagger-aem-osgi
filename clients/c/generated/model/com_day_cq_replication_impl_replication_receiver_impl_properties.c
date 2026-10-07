#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_replication_receiver_impl_properties.h"



static com_day_cq_replication_impl_replication_receiver_impl_properties_t *com_day_cq_replication_impl_replication_receiver_impl_properties_create_internal(
    config_node_property_integer_t *receiver_tmpfile_threshold,
    config_node_property_boolean_t *receiver_packages_use_install
    ) {
    com_day_cq_replication_impl_replication_receiver_impl_properties_t *com_day_cq_replication_impl_replication_receiver_impl_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_replication_receiver_impl_properties_t));
    if (!com_day_cq_replication_impl_replication_receiver_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_replication_receiver_impl_properties_local_var, 0, sizeof(com_day_cq_replication_impl_replication_receiver_impl_properties_t));
    com_day_cq_replication_impl_replication_receiver_impl_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_replication_receiver_impl_properties_local_var->receiver_tmpfile_threshold = receiver_tmpfile_threshold;
    com_day_cq_replication_impl_replication_receiver_impl_properties_local_var->receiver_packages_use_install = receiver_packages_use_install;
    return com_day_cq_replication_impl_replication_receiver_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_replication_receiver_impl_properties_t *com_day_cq_replication_impl_replication_receiver_impl_properties_create(
    config_node_property_integer_t *receiver_tmpfile_threshold,
    config_node_property_boolean_t *receiver_packages_use_install
    ) {
    com_day_cq_replication_impl_replication_receiver_impl_properties_t *result = com_day_cq_replication_impl_replication_receiver_impl_properties_create_internal (
        receiver_tmpfile_threshold,
        receiver_packages_use_install
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_replication_receiver_impl_properties_free(com_day_cq_replication_impl_replication_receiver_impl_properties_t *com_day_cq_replication_impl_replication_receiver_impl_properties) {
    if(NULL == com_day_cq_replication_impl_replication_receiver_impl_properties){
        return ;
    }
    if(com_day_cq_replication_impl_replication_receiver_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_replication_receiver_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold) {
        config_node_property_integer_free(com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold);
        com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold = NULL;
    }
    if (com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install) {
        config_node_property_boolean_free(com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install);
        com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install = NULL;
    }
    free(com_day_cq_replication_impl_replication_receiver_impl_properties);
}

cJSON *com_day_cq_replication_impl_replication_receiver_impl_properties_convertToJSON(com_day_cq_replication_impl_replication_receiver_impl_properties_t *com_day_cq_replication_impl_replication_receiver_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold
    if(com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold) {
    cJSON *receiver_tmpfile_threshold_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold);
    if(receiver_tmpfile_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "receiver.tmpfile.threshold", receiver_tmpfile_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install
    if(com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install) {
    cJSON *receiver_packages_use_install_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install);
    if(receiver_packages_use_install_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "receiver.packages.use.install", receiver_packages_use_install_local_JSON);
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

com_day_cq_replication_impl_replication_receiver_impl_properties_t *com_day_cq_replication_impl_replication_receiver_impl_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_replication_receiver_impl_propertiesJSON){

    com_day_cq_replication_impl_replication_receiver_impl_properties_t *com_day_cq_replication_impl_replication_receiver_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold
    config_node_property_integer_t *receiver_tmpfile_threshold_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install
    config_node_property_boolean_t *receiver_packages_use_install_local_nonprim = NULL;

    // com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_tmpfile_threshold
    cJSON *receiver_tmpfile_threshold = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_replication_receiver_impl_propertiesJSON, "receiver.tmpfile.threshold");
    if (cJSON_IsNull(receiver_tmpfile_threshold)) {
        receiver_tmpfile_threshold = NULL;
    }
    if (receiver_tmpfile_threshold) { 
    receiver_tmpfile_threshold_local_nonprim = config_node_property_integer_parseFromJSON(receiver_tmpfile_threshold); //nonprimitive
    }

    // com_day_cq_replication_impl_replication_receiver_impl_properties->receiver_packages_use_install
    cJSON *receiver_packages_use_install = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_replication_receiver_impl_propertiesJSON, "receiver.packages.use.install");
    if (cJSON_IsNull(receiver_packages_use_install)) {
        receiver_packages_use_install = NULL;
    }
    if (receiver_packages_use_install) { 
    receiver_packages_use_install_local_nonprim = config_node_property_boolean_parseFromJSON(receiver_packages_use_install); //nonprimitive
    }



    com_day_cq_replication_impl_replication_receiver_impl_properties_local_var = com_day_cq_replication_impl_replication_receiver_impl_properties_create_internal (
        receiver_tmpfile_threshold ? receiver_tmpfile_threshold_local_nonprim : NULL,
        receiver_packages_use_install ? receiver_packages_use_install_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_replication_receiver_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_replication_receiver_impl_properties_local_var;
end:
    if (receiver_tmpfile_threshold_local_nonprim) {
        config_node_property_integer_free(receiver_tmpfile_threshold_local_nonprim);
        receiver_tmpfile_threshold_local_nonprim = NULL;
    }
    if (receiver_packages_use_install_local_nonprim) {
        config_node_property_boolean_free(receiver_packages_use_install_local_nonprim);
        receiver_packages_use_install_local_nonprim = NULL;
    }
    return NULL;

}
