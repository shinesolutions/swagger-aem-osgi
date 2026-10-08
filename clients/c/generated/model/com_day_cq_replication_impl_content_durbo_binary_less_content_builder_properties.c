#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties.h"



static com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_create_internal(
    config_node_property_integer_t *binary_threshold
    ) {
    com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t));
    if (!com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var, 0, sizeof(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t));
    com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var->binary_threshold = binary_threshold;
    return com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_create(
    config_node_property_integer_t *binary_threshold
    ) {
    com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *result = com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_create_internal (
        binary_threshold
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_free(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties) {
    if(NULL == com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties){
        return ;
    }
    if(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold) {
        config_node_property_integer_free(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold);
        com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold = NULL;
    }
    free(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties);
}

cJSON *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_convertToJSON(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold
    if(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold) {
    cJSON *binary_threshold_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold);
    if(binary_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "binary.threshold", binary_threshold_local_JSON);
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

com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_propertiesJSON){

    com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_t *com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold
    config_node_property_integer_t *binary_threshold_local_nonprim = NULL;

    // com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties->binary_threshold
    cJSON *binary_threshold = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_content_durbo_binary_less_content_builder_propertiesJSON, "binary.threshold");
    if (cJSON_IsNull(binary_threshold)) {
        binary_threshold = NULL;
    }
    if (binary_threshold) { 
    binary_threshold_local_nonprim = config_node_property_integer_parseFromJSON(binary_threshold); //nonprimitive
    }



    com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var = com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_create_internal (
        binary_threshold ? binary_threshold_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_content_durbo_binary_less_content_builder_properties_local_var;
end:
    if (binary_threshold_local_nonprim) {
        config_node_property_integer_free(binary_threshold_local_nonprim);
        binary_threshold_local_nonprim = NULL;
    }
    return NULL;

}
