#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties.h"



static com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_create_internal(
    config_node_property_integer_t *priority_order,
    config_node_property_array_t *reply_email_patterns
    ) {
    com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var = malloc(sizeof(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t));
    if (!com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var, 0, sizeof(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t));
    com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var->priority_order = priority_order;
    com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var->reply_email_patterns = reply_email_patterns;
    return com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_create(
    config_node_property_integer_t *priority_order,
    config_node_property_array_t *reply_email_patterns
    ) {
    com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *result = com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_create_internal (
        priority_order,
        reply_email_patterns
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_free(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties) {
    if(NULL == com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties){
        return ;
    }
    if(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order) {
        config_node_property_integer_free(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order);
        com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order = NULL;
    }
    if (com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns) {
        config_node_property_array_free(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns);
        com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns = NULL;
    }
    free(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties);
}

cJSON *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order
    if(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order) {
    cJSON *priority_order_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order);
    if(priority_order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priorityOrder", priority_order_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns
    if(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns) {
    cJSON *reply_email_patterns_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns);
    if(reply_email_patterns_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "replyEmailPatterns", reply_email_patterns_local_JSON);
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

com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_parseFromJSON(cJSON *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_propertiesJSON){

    com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_t *com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order
    config_node_property_integer_t *priority_order_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns
    config_node_property_array_t *reply_email_patterns_local_nonprim = NULL;

    // com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->priority_order
    cJSON *priority_order = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_propertiesJSON, "priorityOrder");
    if (cJSON_IsNull(priority_order)) {
        priority_order = NULL;
    }
    if (priority_order) { 
    priority_order_local_nonprim = config_node_property_integer_parseFromJSON(priority_order); //nonprimitive
    }

    // com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties->reply_email_patterns
    cJSON *reply_email_patterns = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_propertiesJSON, "replyEmailPatterns");
    if (cJSON_IsNull(reply_email_patterns)) {
        reply_email_patterns = NULL;
    }
    if (reply_email_patterns) { 
    reply_email_patterns_local_nonprim = config_node_property_array_parseFromJSON(reply_email_patterns); //nonprimitive
    }



    com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var = com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_create_internal (
        priority_order ? priority_order_local_nonprim : NULL,
        reply_email_patterns ? reply_email_patterns_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties_local_var;
end:
    if (priority_order_local_nonprim) {
        config_node_property_integer_free(priority_order_local_nonprim);
        priority_order_local_nonprim = NULL;
    }
    if (reply_email_patterns_local_nonprim) {
        config_node_property_array_free(reply_email_patterns_local_nonprim);
        reply_email_patterns_local_nonprim = NULL;
    }
    return NULL;

}
