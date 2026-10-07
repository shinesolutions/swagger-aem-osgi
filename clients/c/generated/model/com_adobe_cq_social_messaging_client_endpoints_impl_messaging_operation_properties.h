/*
 * com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_H_
#define _com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t {
    struct config_node_property_array_t *message_properties; //model
    struct config_node_property_integer_t *message_box_size_limit; //model
    struct config_node_property_integer_t *message_count_limit; //model
    struct config_node_property_boolean_t *notify_failure; //model
    struct config_node_property_string_t *failure_message_from; //model
    struct config_node_property_string_t *failure_template_path; //model
    struct config_node_property_integer_t *max_retries; //model
    struct config_node_property_integer_t *min_wait_between_retries; //model
    struct config_node_property_integer_t *count_update_pool_size; //model
    struct config_node_property_string_t *inbox_path; //model
    struct config_node_property_string_t *sentitems_path; //model
    struct config_node_property_boolean_t *support_attachments; //model
    struct config_node_property_boolean_t *support_group_messaging; //model
    struct config_node_property_integer_t *max_total_recipients; //model
    struct config_node_property_integer_t *batch_size; //model
    struct config_node_property_integer_t *max_total_attachment_size; //model
    struct config_node_property_array_t *attachment_type_blacklist; //model
    struct config_node_property_array_t *allowed_attachment_types; //model
    struct config_node_property_string_t *service_selector; //model
    struct config_node_property_array_t *field_whitelist; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t;

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
);

void com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_free(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties);

com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_parseFromJSON(cJSON *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_propertiesJSON);

cJSON *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_convertToJSON(com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_t *com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties);

#endif /* _com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties_H_ */

