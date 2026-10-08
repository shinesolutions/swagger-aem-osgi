#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties.h"



static com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_create_internal(
    config_node_property_array_t *message_properties,
    config_node_property_integer_t *message_box_size_limit,
    config_node_property_integer_t *message_count_limit,
    config_node_property_boolean_t *notify_failure,
    config_node_property_string_t *failure_message_from,
    config_node_property_string_t *failure_template_path,
    config_node_property_integer_t *max_retries,
    config_node_property_integer_t *min_wait_between_retries,
    config_node_property_integer_t *count_update_pool_size,
    config_node_property_string_t *inbox_path,
    config_node_property_string_t *sentitems_path,
    config_node_property_boolean_t *support_attachments,
    config_node_property_boolean_t *support_group_messaging,
    config_node_property_integer_t *max_total_recipients,
    config_node_property_integer_t *batch_size,
    config_node_property_integer_t *max_total_attachment_size,
    config_node_property_array_t *attachment_type_blacklist,
    config_node_property_array_t *allowed_attachment_types,
    config_node_property_string_t *service_selector,
    config_node_property_array_t *field_whitelist
    ) {
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var = malloc(sizeof(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t));
    if (!com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var, 0, sizeof(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t));
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->message_properties = message_properties;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->message_box_size_limit = message_box_size_limit;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->message_count_limit = message_count_limit;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->notify_failure = notify_failure;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->failure_message_from = failure_message_from;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->failure_template_path = failure_template_path;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->max_retries = max_retries;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->min_wait_between_retries = min_wait_between_retries;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->count_update_pool_size = count_update_pool_size;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->inbox_path = inbox_path;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->sentitems_path = sentitems_path;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->support_attachments = support_attachments;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->support_group_messaging = support_group_messaging;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->max_total_recipients = max_total_recipients;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->batch_size = batch_size;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->max_total_attachment_size = max_total_attachment_size;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->attachment_type_blacklist = attachment_type_blacklist;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->allowed_attachment_types = allowed_attachment_types;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->service_selector = service_selector;
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var->field_whitelist = field_whitelist;
    return com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_create(
    config_node_property_array_t *message_properties,
    config_node_property_integer_t *message_box_size_limit,
    config_node_property_integer_t *message_count_limit,
    config_node_property_boolean_t *notify_failure,
    config_node_property_string_t *failure_message_from,
    config_node_property_string_t *failure_template_path,
    config_node_property_integer_t *max_retries,
    config_node_property_integer_t *min_wait_between_retries,
    config_node_property_integer_t *count_update_pool_size,
    config_node_property_string_t *inbox_path,
    config_node_property_string_t *sentitems_path,
    config_node_property_boolean_t *support_attachments,
    config_node_property_boolean_t *support_group_messaging,
    config_node_property_integer_t *max_total_recipients,
    config_node_property_integer_t *batch_size,
    config_node_property_integer_t *max_total_attachment_size,
    config_node_property_array_t *attachment_type_blacklist,
    config_node_property_array_t *allowed_attachment_types,
    config_node_property_string_t *service_selector,
    config_node_property_array_t *field_whitelist
    ) {
    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *result = com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_create_internal (
        message_properties,
        message_box_size_limit,
        message_count_limit,
        notify_failure,
        failure_message_from,
        failure_template_path,
        max_retries,
        min_wait_between_retries,
        count_update_pool_size,
        inbox_path,
        sentitems_path,
        support_attachments,
        support_group_messaging,
        max_total_recipients,
        batch_size,
        max_total_attachment_size,
        attachment_type_blacklist,
        allowed_attachment_types,
        service_selector,
        field_whitelist
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties) {
    if(NULL == com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties){
        return ;
    }
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties) {
        config_node_property_array_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure) {
        config_node_property_boolean_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from) {
        config_node_property_string_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path) {
        config_node_property_string_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path) {
        config_node_property_string_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path) {
        config_node_property_string_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments) {
        config_node_property_boolean_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging) {
        config_node_property_boolean_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size) {
        config_node_property_integer_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist) {
        config_node_property_array_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types) {
        config_node_property_array_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector) {
        config_node_property_string_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector = NULL;
    }
    if (com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist);
        com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist = NULL;
    }
    free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties);
}

cJSON *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties) {
    cJSON *message_properties_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties);
    if(message_properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "message.properties", message_properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit) {
    cJSON *message_box_size_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit);
    if(message_box_size_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "messageBoxSizeLimit", message_box_size_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit) {
    cJSON *message_count_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit);
    if(message_count_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "messageCountLimit", message_count_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure) {
    cJSON *notify_failure_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure);
    if(notify_failure_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "notifyFailure", notify_failure_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from) {
    cJSON *failure_message_from_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from);
    if(failure_message_from_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "failureMessageFrom", failure_message_from_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path) {
    cJSON *failure_template_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path);
    if(failure_template_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "failureTemplatePath", failure_template_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries) {
    cJSON *max_retries_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries);
    if(max_retries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxRetries", max_retries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries) {
    cJSON *min_wait_between_retries_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries);
    if(min_wait_between_retries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minWaitBetweenRetries", min_wait_between_retries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size) {
    cJSON *count_update_pool_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size);
    if(count_update_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "countUpdatePoolSize", count_update_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path) {
    cJSON *inbox_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path);
    if(inbox_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "inbox.path", inbox_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path) {
    cJSON *sentitems_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path);
    if(sentitems_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sentitems.path", sentitems_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments) {
    cJSON *support_attachments_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments);
    if(support_attachments_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportAttachments", support_attachments_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging) {
    cJSON *support_group_messaging_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging);
    if(support_group_messaging_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportGroupMessaging", support_group_messaging_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients) {
    cJSON *max_total_recipients_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients);
    if(max_total_recipients_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxTotalRecipients", max_total_recipients_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size) {
    cJSON *batch_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size);
    if(batch_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "batchSize", batch_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size) {
    cJSON *max_total_attachment_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size);
    if(max_total_attachment_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxTotalAttachmentSize", max_total_attachment_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist) {
    cJSON *attachment_type_blacklist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist);
    if(attachment_type_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attachmentTypeBlacklist", attachment_type_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types) {
    cJSON *allowed_attachment_types_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types);
    if(allowed_attachment_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "allowedAttachmentTypes", allowed_attachment_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector) {
    cJSON *service_selector_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector);
    if(service_selector_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceSelector", service_selector_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist
    if(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist) {
    cJSON *field_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist);
    if(field_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fieldWhitelist", field_whitelist_local_JSON);
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

com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_parseFromJSON(cJSON *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON){

    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties
    config_node_property_array_t *message_properties_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit
    config_node_property_integer_t *message_box_size_limit_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit
    config_node_property_integer_t *message_count_limit_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure
    config_node_property_boolean_t *notify_failure_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from
    config_node_property_string_t *failure_message_from_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path
    config_node_property_string_t *failure_template_path_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries
    config_node_property_integer_t *max_retries_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries
    config_node_property_integer_t *min_wait_between_retries_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size
    config_node_property_integer_t *count_update_pool_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path
    config_node_property_string_t *inbox_path_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path
    config_node_property_string_t *sentitems_path_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments
    config_node_property_boolean_t *support_attachments_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging
    config_node_property_boolean_t *support_group_messaging_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients
    config_node_property_integer_t *max_total_recipients_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size
    config_node_property_integer_t *batch_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size
    config_node_property_integer_t *max_total_attachment_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist
    config_node_property_array_t *attachment_type_blacklist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types
    config_node_property_array_t *allowed_attachment_types_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector
    config_node_property_string_t *service_selector_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist
    config_node_property_array_t *field_whitelist_local_nonprim = NULL;

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_properties
    cJSON *message_properties = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "message.properties");
    if (cJSON_IsNull(message_properties)) {
        message_properties = NULL;
    }
    if (message_properties) { 
    message_properties_local_nonprim = config_node_property_array_parseFromJSON(message_properties); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_box_size_limit
    cJSON *message_box_size_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "messageBoxSizeLimit");
    if (cJSON_IsNull(message_box_size_limit)) {
        message_box_size_limit = NULL;
    }
    if (message_box_size_limit) { 
    message_box_size_limit_local_nonprim = config_node_property_integer_parseFromJSON(message_box_size_limit); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->message_count_limit
    cJSON *message_count_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "messageCountLimit");
    if (cJSON_IsNull(message_count_limit)) {
        message_count_limit = NULL;
    }
    if (message_count_limit) { 
    message_count_limit_local_nonprim = config_node_property_integer_parseFromJSON(message_count_limit); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->notify_failure
    cJSON *notify_failure = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "notifyFailure");
    if (cJSON_IsNull(notify_failure)) {
        notify_failure = NULL;
    }
    if (notify_failure) { 
    notify_failure_local_nonprim = config_node_property_boolean_parseFromJSON(notify_failure); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_message_from
    cJSON *failure_message_from = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "failureMessageFrom");
    if (cJSON_IsNull(failure_message_from)) {
        failure_message_from = NULL;
    }
    if (failure_message_from) { 
    failure_message_from_local_nonprim = config_node_property_string_parseFromJSON(failure_message_from); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->failure_template_path
    cJSON *failure_template_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "failureTemplatePath");
    if (cJSON_IsNull(failure_template_path)) {
        failure_template_path = NULL;
    }
    if (failure_template_path) { 
    failure_template_path_local_nonprim = config_node_property_string_parseFromJSON(failure_template_path); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_retries
    cJSON *max_retries = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "maxRetries");
    if (cJSON_IsNull(max_retries)) {
        max_retries = NULL;
    }
    if (max_retries) { 
    max_retries_local_nonprim = config_node_property_integer_parseFromJSON(max_retries); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->min_wait_between_retries
    cJSON *min_wait_between_retries = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "minWaitBetweenRetries");
    if (cJSON_IsNull(min_wait_between_retries)) {
        min_wait_between_retries = NULL;
    }
    if (min_wait_between_retries) { 
    min_wait_between_retries_local_nonprim = config_node_property_integer_parseFromJSON(min_wait_between_retries); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->count_update_pool_size
    cJSON *count_update_pool_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "countUpdatePoolSize");
    if (cJSON_IsNull(count_update_pool_size)) {
        count_update_pool_size = NULL;
    }
    if (count_update_pool_size) { 
    count_update_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(count_update_pool_size); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->inbox_path
    cJSON *inbox_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "inbox.path");
    if (cJSON_IsNull(inbox_path)) {
        inbox_path = NULL;
    }
    if (inbox_path) { 
    inbox_path_local_nonprim = config_node_property_string_parseFromJSON(inbox_path); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->sentitems_path
    cJSON *sentitems_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "sentitems.path");
    if (cJSON_IsNull(sentitems_path)) {
        sentitems_path = NULL;
    }
    if (sentitems_path) { 
    sentitems_path_local_nonprim = config_node_property_string_parseFromJSON(sentitems_path); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_attachments
    cJSON *support_attachments = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "supportAttachments");
    if (cJSON_IsNull(support_attachments)) {
        support_attachments = NULL;
    }
    if (support_attachments) { 
    support_attachments_local_nonprim = config_node_property_boolean_parseFromJSON(support_attachments); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->support_group_messaging
    cJSON *support_group_messaging = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "supportGroupMessaging");
    if (cJSON_IsNull(support_group_messaging)) {
        support_group_messaging = NULL;
    }
    if (support_group_messaging) { 
    support_group_messaging_local_nonprim = config_node_property_boolean_parseFromJSON(support_group_messaging); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_recipients
    cJSON *max_total_recipients = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "maxTotalRecipients");
    if (cJSON_IsNull(max_total_recipients)) {
        max_total_recipients = NULL;
    }
    if (max_total_recipients) { 
    max_total_recipients_local_nonprim = config_node_property_integer_parseFromJSON(max_total_recipients); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->batch_size
    cJSON *batch_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "batchSize");
    if (cJSON_IsNull(batch_size)) {
        batch_size = NULL;
    }
    if (batch_size) { 
    batch_size_local_nonprim = config_node_property_integer_parseFromJSON(batch_size); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->max_total_attachment_size
    cJSON *max_total_attachment_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "maxTotalAttachmentSize");
    if (cJSON_IsNull(max_total_attachment_size)) {
        max_total_attachment_size = NULL;
    }
    if (max_total_attachment_size) { 
    max_total_attachment_size_local_nonprim = config_node_property_integer_parseFromJSON(max_total_attachment_size); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->attachment_type_blacklist
    cJSON *attachment_type_blacklist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "attachmentTypeBlacklist");
    if (cJSON_IsNull(attachment_type_blacklist)) {
        attachment_type_blacklist = NULL;
    }
    if (attachment_type_blacklist) { 
    attachment_type_blacklist_local_nonprim = config_node_property_array_parseFromJSON(attachment_type_blacklist); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->allowed_attachment_types
    cJSON *allowed_attachment_types = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "allowedAttachmentTypes");
    if (cJSON_IsNull(allowed_attachment_types)) {
        allowed_attachment_types = NULL;
    }
    if (allowed_attachment_types) { 
    allowed_attachment_types_local_nonprim = config_node_property_array_parseFromJSON(allowed_attachment_types); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->service_selector
    cJSON *service_selector = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "serviceSelector");
    if (cJSON_IsNull(service_selector)) {
        service_selector = NULL;
    }
    if (service_selector) { 
    service_selector_local_nonprim = config_node_property_string_parseFromJSON(service_selector); //nonprimitive
    }

    // com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties->field_whitelist
    cJSON *field_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON, "fieldWhitelist");
    if (cJSON_IsNull(field_whitelist)) {
        field_whitelist = NULL;
    }
    if (field_whitelist) { 
    field_whitelist_local_nonprim = config_node_property_array_parseFromJSON(field_whitelist); //nonprimitive
    }



    com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var = com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_create_internal (
        message_properties ? message_properties_local_nonprim : NULL,
        message_box_size_limit ? message_box_size_limit_local_nonprim : NULL,
        message_count_limit ? message_count_limit_local_nonprim : NULL,
        notify_failure ? notify_failure_local_nonprim : NULL,
        failure_message_from ? failure_message_from_local_nonprim : NULL,
        failure_template_path ? failure_template_path_local_nonprim : NULL,
        max_retries ? max_retries_local_nonprim : NULL,
        min_wait_between_retries ? min_wait_between_retries_local_nonprim : NULL,
        count_update_pool_size ? count_update_pool_size_local_nonprim : NULL,
        inbox_path ? inbox_path_local_nonprim : NULL,
        sentitems_path ? sentitems_path_local_nonprim : NULL,
        support_attachments ? support_attachments_local_nonprim : NULL,
        support_group_messaging ? support_group_messaging_local_nonprim : NULL,
        max_total_recipients ? max_total_recipients_local_nonprim : NULL,
        batch_size ? batch_size_local_nonprim : NULL,
        max_total_attachment_size ? max_total_attachment_size_local_nonprim : NULL,
        attachment_type_blacklist ? attachment_type_blacklist_local_nonprim : NULL,
        allowed_attachment_types ? allowed_attachment_types_local_nonprim : NULL,
        service_selector ? service_selector_local_nonprim : NULL,
        field_whitelist ? field_whitelist_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_local_var;
end:
    if (message_properties_local_nonprim) {
        config_node_property_array_free(message_properties_local_nonprim);
        message_properties_local_nonprim = NULL;
    }
    if (message_box_size_limit_local_nonprim) {
        config_node_property_integer_free(message_box_size_limit_local_nonprim);
        message_box_size_limit_local_nonprim = NULL;
    }
    if (message_count_limit_local_nonprim) {
        config_node_property_integer_free(message_count_limit_local_nonprim);
        message_count_limit_local_nonprim = NULL;
    }
    if (notify_failure_local_nonprim) {
        config_node_property_boolean_free(notify_failure_local_nonprim);
        notify_failure_local_nonprim = NULL;
    }
    if (failure_message_from_local_nonprim) {
        config_node_property_string_free(failure_message_from_local_nonprim);
        failure_message_from_local_nonprim = NULL;
    }
    if (failure_template_path_local_nonprim) {
        config_node_property_string_free(failure_template_path_local_nonprim);
        failure_template_path_local_nonprim = NULL;
    }
    if (max_retries_local_nonprim) {
        config_node_property_integer_free(max_retries_local_nonprim);
        max_retries_local_nonprim = NULL;
    }
    if (min_wait_between_retries_local_nonprim) {
        config_node_property_integer_free(min_wait_between_retries_local_nonprim);
        min_wait_between_retries_local_nonprim = NULL;
    }
    if (count_update_pool_size_local_nonprim) {
        config_node_property_integer_free(count_update_pool_size_local_nonprim);
        count_update_pool_size_local_nonprim = NULL;
    }
    if (inbox_path_local_nonprim) {
        config_node_property_string_free(inbox_path_local_nonprim);
        inbox_path_local_nonprim = NULL;
    }
    if (sentitems_path_local_nonprim) {
        config_node_property_string_free(sentitems_path_local_nonprim);
        sentitems_path_local_nonprim = NULL;
    }
    if (support_attachments_local_nonprim) {
        config_node_property_boolean_free(support_attachments_local_nonprim);
        support_attachments_local_nonprim = NULL;
    }
    if (support_group_messaging_local_nonprim) {
        config_node_property_boolean_free(support_group_messaging_local_nonprim);
        support_group_messaging_local_nonprim = NULL;
    }
    if (max_total_recipients_local_nonprim) {
        config_node_property_integer_free(max_total_recipients_local_nonprim);
        max_total_recipients_local_nonprim = NULL;
    }
    if (batch_size_local_nonprim) {
        config_node_property_integer_free(batch_size_local_nonprim);
        batch_size_local_nonprim = NULL;
    }
    if (max_total_attachment_size_local_nonprim) {
        config_node_property_integer_free(max_total_attachment_size_local_nonprim);
        max_total_attachment_size_local_nonprim = NULL;
    }
    if (attachment_type_blacklist_local_nonprim) {
        config_node_property_array_free(attachment_type_blacklist_local_nonprim);
        attachment_type_blacklist_local_nonprim = NULL;
    }
    if (allowed_attachment_types_local_nonprim) {
        config_node_property_array_free(allowed_attachment_types_local_nonprim);
        allowed_attachment_types_local_nonprim = NULL;
    }
    if (service_selector_local_nonprim) {
        config_node_property_string_free(service_selector_local_nonprim);
        service_selector_local_nonprim = NULL;
    }
    if (field_whitelist_local_nonprim) {
        config_node_property_array_free(field_whitelist_local_nonprim);
        field_whitelist_local_nonprim = NULL;
    }
    return NULL;

}
