#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties.h"



static com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_create_internal(
    config_node_property_integer_t *number_of_retries_allowed,
    config_node_property_array_t *hc_tags
    ) {
    com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var = malloc(sizeof(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t));
    if (!com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var, 0, sizeof(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t));
    com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var->_library_owned = 1;
    com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var->number_of_retries_allowed = number_of_retries_allowed;
    com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var->hc_tags = hc_tags;
    return com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_create(
    config_node_property_integer_t *number_of_retries_allowed,
    config_node_property_array_t *hc_tags
    ) {
    com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *result = com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_create_internal (
        number_of_retries_allowed,
        hc_tags
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_free(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties) {
    if(NULL == com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties){
        return ;
    }
    if(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed) {
        config_node_property_integer_free(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed);
        com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed = NULL;
    }
    if (com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags) {
        config_node_property_array_free(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags);
        com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags = NULL;
    }
    free(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties);
}

cJSON *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_convertToJSON(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed
    if(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed) {
    cJSON *number_of_retries_allowed_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed);
    if(number_of_retries_allowed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "number.of.retries.allowed", number_of_retries_allowed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags
    if(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
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

com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_parseFromJSON(cJSON *com_adobe_granite_replication_hc_impl_replication_queue_health_check_propertiesJSON){

    com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_t *com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed
    config_node_property_integer_t *number_of_retries_allowed_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->number_of_retries_allowed
    cJSON *number_of_retries_allowed = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_replication_hc_impl_replication_queue_health_check_propertiesJSON, "number.of.retries.allowed");
    if (cJSON_IsNull(number_of_retries_allowed)) {
        number_of_retries_allowed = NULL;
    }
    if (number_of_retries_allowed) { 
    number_of_retries_allowed_local_nonprim = config_node_property_integer_parseFromJSON(number_of_retries_allowed); //nonprimitive
    }

    // com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_replication_hc_impl_replication_queue_health_check_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }



    com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var = com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_create_internal (
        number_of_retries_allowed ? number_of_retries_allowed_local_nonprim : NULL,
        hc_tags ? hc_tags_local_nonprim : NULL
        );

    if (!com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties_local_var;
end:
    if (number_of_retries_allowed_local_nonprim) {
        config_node_property_integer_free(number_of_retries_allowed_local_nonprim);
        number_of_retries_allowed_local_nonprim = NULL;
    }
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    return NULL;

}
