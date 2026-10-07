#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_group_impl_group_service_impl_properties.h"



static com_adobe_cq_social_group_impl_group_service_impl_properties_t *com_adobe_cq_social_group_impl_group_service_impl_properties_create_internal(
    config_node_property_integer_t *max_wait_time,
    config_node_property_integer_t *min_wait_between_retries
    ) {
    com_adobe_cq_social_group_impl_group_service_impl_properties_t *com_adobe_cq_social_group_impl_group_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_group_impl_group_service_impl_properties_t));
    if (!com_adobe_cq_social_group_impl_group_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_group_impl_group_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_group_impl_group_service_impl_properties_t));
    com_adobe_cq_social_group_impl_group_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_group_impl_group_service_impl_properties_local_var->max_wait_time = max_wait_time;
    com_adobe_cq_social_group_impl_group_service_impl_properties_local_var->min_wait_between_retries = min_wait_between_retries;
    return com_adobe_cq_social_group_impl_group_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_group_impl_group_service_impl_properties_t *com_adobe_cq_social_group_impl_group_service_impl_properties_create(
    config_node_property_integer_t *max_wait_time,
    config_node_property_integer_t *min_wait_between_retries
    ) {
    com_adobe_cq_social_group_impl_group_service_impl_properties_t *result = com_adobe_cq_social_group_impl_group_service_impl_properties_create_internal (
        max_wait_time,
        min_wait_between_retries
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_group_impl_group_service_impl_properties_free(com_adobe_cq_social_group_impl_group_service_impl_properties_t *com_adobe_cq_social_group_impl_group_service_impl_properties) {
    if(NULL == com_adobe_cq_social_group_impl_group_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_group_impl_group_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_group_impl_group_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time) {
        config_node_property_integer_free(com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time);
        com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time = NULL;
    }
    if (com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries) {
        config_node_property_integer_free(com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries);
        com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries = NULL;
    }
    free(com_adobe_cq_social_group_impl_group_service_impl_properties);
}

cJSON *com_adobe_cq_social_group_impl_group_service_impl_properties_convertToJSON(com_adobe_cq_social_group_impl_group_service_impl_properties_t *com_adobe_cq_social_group_impl_group_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time
    if(com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time) {
    cJSON *max_wait_time_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time);
    if(max_wait_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxWaitTime", max_wait_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries
    if(com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries) {
    cJSON *min_wait_between_retries_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries);
    if(min_wait_between_retries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minWaitBetweenRetries", min_wait_between_retries_local_JSON);
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

com_adobe_cq_social_group_impl_group_service_impl_properties_t *com_adobe_cq_social_group_impl_group_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_group_impl_group_service_impl_propertiesJSON){

    com_adobe_cq_social_group_impl_group_service_impl_properties_t *com_adobe_cq_social_group_impl_group_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time
    config_node_property_integer_t *max_wait_time_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries
    config_node_property_integer_t *min_wait_between_retries_local_nonprim = NULL;

    // com_adobe_cq_social_group_impl_group_service_impl_properties->max_wait_time
    cJSON *max_wait_time = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_group_impl_group_service_impl_propertiesJSON, "maxWaitTime");
    if (cJSON_IsNull(max_wait_time)) {
        max_wait_time = NULL;
    }
    if (max_wait_time) { 
    max_wait_time_local_nonprim = config_node_property_integer_parseFromJSON(max_wait_time); //nonprimitive
    }

    // com_adobe_cq_social_group_impl_group_service_impl_properties->min_wait_between_retries
    cJSON *min_wait_between_retries = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_group_impl_group_service_impl_propertiesJSON, "minWaitBetweenRetries");
    if (cJSON_IsNull(min_wait_between_retries)) {
        min_wait_between_retries = NULL;
    }
    if (min_wait_between_retries) { 
    min_wait_between_retries_local_nonprim = config_node_property_integer_parseFromJSON(min_wait_between_retries); //nonprimitive
    }



    com_adobe_cq_social_group_impl_group_service_impl_properties_local_var = com_adobe_cq_social_group_impl_group_service_impl_properties_create_internal (
        max_wait_time ? max_wait_time_local_nonprim : NULL,
        min_wait_between_retries ? min_wait_between_retries_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_group_impl_group_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_group_impl_group_service_impl_properties_local_var;
end:
    if (max_wait_time_local_nonprim) {
        config_node_property_integer_free(max_wait_time_local_nonprim);
        max_wait_time_local_nonprim = NULL;
    }
    if (min_wait_between_retries_local_nonprim) {
        config_node_property_integer_free(min_wait_between_retries_local_nonprim);
        min_wait_between_retries_local_nonprim = NULL;
    }
    return NULL;

}
