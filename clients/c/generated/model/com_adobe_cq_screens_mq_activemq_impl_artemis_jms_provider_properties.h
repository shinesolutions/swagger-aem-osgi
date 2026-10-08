/*
 * com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties.h
 *
 * 
 */

#ifndef _com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_H_
#define _com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_float.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t {
    struct config_node_property_integer_t *service_ranking; //model
    struct config_node_property_integer_t *global_size; //model
    struct config_node_property_integer_t *max_disk_usage; //model
    struct config_node_property_boolean_t *persistence_enabled; //model
    struct config_node_property_integer_t *thread_pool_max_size; //model
    struct config_node_property_integer_t *scheduled_thread_pool_max_size; //model
    struct config_node_property_integer_t *graceful_shutdown_timeout; //model
    struct config_node_property_array_t *queues; //model
    struct config_node_property_array_t *topics; //model
    struct config_node_property_integer_t *addresses_max_delivery_attempts; //model
    struct config_node_property_integer_t *addresses_expiry_delay; //model
    struct config_node_property_drop_down_t *addresses_address_full_message_policy; //model
    struct config_node_property_integer_t *addresses_max_size_bytes; //model
    struct config_node_property_integer_t *addresses_page_size_bytes; //model
    struct config_node_property_integer_t *addresses_page_cache_max_size; //model
    struct config_node_property_string_t *cluster_user; //model
    struct config_node_property_string_t *cluster_password; //model
    struct config_node_property_integer_t *cluster_call_timeout; //model
    struct config_node_property_integer_t *cluster_call_failover_timeout; //model
    struct config_node_property_integer_t *cluster_client_failure_check_period; //model
    struct config_node_property_integer_t *cluster_notification_attempts; //model
    struct config_node_property_integer_t *cluster_notification_interval; //model
    struct config_node_property_integer_t *id_cache_size; //model
    struct config_node_property_integer_t *cluster_confirmation_window_size; //model
    struct config_node_property_integer_t *cluster_connection_ttl; //model
    struct config_node_property_boolean_t *cluster_duplicate_detection; //model
    struct config_node_property_integer_t *cluster_initial_connect_attempts; //model
    struct config_node_property_integer_t *cluster_max_retry_interval; //model
    struct config_node_property_integer_t *cluster_min_large_message_size; //model
    struct config_node_property_integer_t *cluster_producer_window_size; //model
    struct config_node_property_integer_t *cluster_reconnect_attempts; //model
    struct config_node_property_integer_t *cluster_retry_interval; //model
    struct config_node_property_float_t *cluster_retry_interval_multiplier; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t;

__attribute__((deprecated)) com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_integer_t *global_size,
    config_node_property_integer_t *max_disk_usage,
    config_node_property_boolean_t *persistence_enabled,
    config_node_property_integer_t *thread_pool_max_size,
    config_node_property_integer_t *scheduled_thread_pool_max_size,
    config_node_property_integer_t *graceful_shutdown_timeout,
    config_node_property_array_t *queues,
    config_node_property_array_t *topics,
    config_node_property_integer_t *addresses_max_delivery_attempts,
    config_node_property_integer_t *addresses_expiry_delay,
    config_node_property_drop_down_t *addresses_address_full_message_policy,
    config_node_property_integer_t *addresses_max_size_bytes,
    config_node_property_integer_t *addresses_page_size_bytes,
    config_node_property_integer_t *addresses_page_cache_max_size,
    config_node_property_string_t *cluster_user,
    config_node_property_string_t *cluster_password,
    config_node_property_integer_t *cluster_call_timeout,
    config_node_property_integer_t *cluster_call_failover_timeout,
    config_node_property_integer_t *cluster_client_failure_check_period,
    config_node_property_integer_t *cluster_notification_attempts,
    config_node_property_integer_t *cluster_notification_interval,
    config_node_property_integer_t *id_cache_size,
    config_node_property_integer_t *cluster_confirmation_window_size,
    config_node_property_integer_t *cluster_connection_ttl,
    config_node_property_boolean_t *cluster_duplicate_detection,
    config_node_property_integer_t *cluster_initial_connect_attempts,
    config_node_property_integer_t *cluster_max_retry_interval,
    config_node_property_integer_t *cluster_min_large_message_size,
    config_node_property_integer_t *cluster_producer_window_size,
    config_node_property_integer_t *cluster_reconnect_attempts,
    config_node_property_integer_t *cluster_retry_interval,
    config_node_property_float_t *cluster_retry_interval_multiplier
);

void com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties);

com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_parseFromJSON(cJSON *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON);

cJSON *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties);

#endif /* _com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_H_ */

