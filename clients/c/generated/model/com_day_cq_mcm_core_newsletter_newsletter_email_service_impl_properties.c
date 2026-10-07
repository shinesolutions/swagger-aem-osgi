#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties.h"



static com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_create_internal(
    config_node_property_string_t *from_address,
    config_node_property_string_t *sender_host,
    config_node_property_string_t *max_bounce_count
    ) {
    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var = malloc(sizeof(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t));
    if (!com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var, 0, sizeof(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t));
    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var->from_address = from_address;
    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var->sender_host = sender_host;
    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var->max_bounce_count = max_bounce_count;
    return com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_create(
    config_node_property_string_t *from_address,
    config_node_property_string_t *sender_host,
    config_node_property_string_t *max_bounce_count
    ) {
    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *result = com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_create_internal (
        from_address,
        sender_host,
        max_bounce_count
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_free(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties) {
    if(NULL == com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties){
        return ;
    }
    if(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address) {
        config_node_property_string_free(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address);
        com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address = NULL;
    }
    if (com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host) {
        config_node_property_string_free(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host);
        com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host = NULL;
    }
    if (com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count) {
        config_node_property_string_free(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count);
        com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count = NULL;
    }
    free(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties);
}

cJSON *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_convertToJSON(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address
    if(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address) {
    cJSON *from_address_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address);
    if(from_address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "from.address", from_address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host
    if(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host) {
    cJSON *sender_host_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host);
    if(sender_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sender.host", sender_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count
    if(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count) {
    cJSON *max_bounce_count_local_JSON = config_node_property_string_convertToJSON(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count);
    if(max_bounce_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.bounce.count", max_bounce_count_local_JSON);
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

com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_parseFromJSON(cJSON *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_propertiesJSON){

    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_t *com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address
    config_node_property_string_t *from_address_local_nonprim = NULL;

    // define the local variable for com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host
    config_node_property_string_t *sender_host_local_nonprim = NULL;

    // define the local variable for com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count
    config_node_property_string_t *max_bounce_count_local_nonprim = NULL;

    // com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->from_address
    cJSON *from_address = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_propertiesJSON, "from.address");
    if (cJSON_IsNull(from_address)) {
        from_address = NULL;
    }
    if (from_address) { 
    from_address_local_nonprim = config_node_property_string_parseFromJSON(from_address); //nonprimitive
    }

    // com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->sender_host
    cJSON *sender_host = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_propertiesJSON, "sender.host");
    if (cJSON_IsNull(sender_host)) {
        sender_host = NULL;
    }
    if (sender_host) { 
    sender_host_local_nonprim = config_node_property_string_parseFromJSON(sender_host); //nonprimitive
    }

    // com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties->max_bounce_count
    cJSON *max_bounce_count = cJSON_GetObjectItemCaseSensitive(com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_propertiesJSON, "max.bounce.count");
    if (cJSON_IsNull(max_bounce_count)) {
        max_bounce_count = NULL;
    }
    if (max_bounce_count) { 
    max_bounce_count_local_nonprim = config_node_property_string_parseFromJSON(max_bounce_count); //nonprimitive
    }



    com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var = com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_create_internal (
        from_address ? from_address_local_nonprim : NULL,
        sender_host ? sender_host_local_nonprim : NULL,
        max_bounce_count ? max_bounce_count_local_nonprim : NULL
        );

    if (!com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties_local_var;
end:
    if (from_address_local_nonprim) {
        config_node_property_string_free(from_address_local_nonprim);
        from_address_local_nonprim = NULL;
    }
    if (sender_host_local_nonprim) {
        config_node_property_string_free(sender_host_local_nonprim);
        sender_host_local_nonprim = NULL;
    }
    if (max_bounce_count_local_nonprim) {
        config_node_property_string_free(max_bounce_count_local_nonprim);
        max_bounce_count_local_nonprim = NULL;
    }
    return NULL;

}
