#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties.h"



static com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_create_internal(
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
    ) {
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var = malloc(sizeof(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t));
    if (!com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var, 0, sizeof(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t));
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->_library_owned = 1;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->service_ranking = service_ranking;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->global_size = global_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->max_disk_usage = max_disk_usage;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->persistence_enabled = persistence_enabled;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->thread_pool_max_size = thread_pool_max_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->scheduled_thread_pool_max_size = scheduled_thread_pool_max_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->graceful_shutdown_timeout = graceful_shutdown_timeout;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->queues = queues;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->topics = topics;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->addresses_max_delivery_attempts = addresses_max_delivery_attempts;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->addresses_expiry_delay = addresses_expiry_delay;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->addresses_address_full_message_policy = addresses_address_full_message_policy;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->addresses_max_size_bytes = addresses_max_size_bytes;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->addresses_page_size_bytes = addresses_page_size_bytes;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->addresses_page_cache_max_size = addresses_page_cache_max_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_user = cluster_user;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_password = cluster_password;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_call_timeout = cluster_call_timeout;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_call_failover_timeout = cluster_call_failover_timeout;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_client_failure_check_period = cluster_client_failure_check_period;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_notification_attempts = cluster_notification_attempts;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_notification_interval = cluster_notification_interval;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->id_cache_size = id_cache_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_confirmation_window_size = cluster_confirmation_window_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_connection_ttl = cluster_connection_ttl;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_duplicate_detection = cluster_duplicate_detection;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_initial_connect_attempts = cluster_initial_connect_attempts;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_max_retry_interval = cluster_max_retry_interval;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_min_large_message_size = cluster_min_large_message_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_producer_window_size = cluster_producer_window_size;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_reconnect_attempts = cluster_reconnect_attempts;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_retry_interval = cluster_retry_interval;
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var->cluster_retry_interval_multiplier = cluster_retry_interval_multiplier;
    return com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var;
}

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
    ) {
    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *result = com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_create_internal (
        service_ranking,
        global_size,
        max_disk_usage,
        persistence_enabled,
        thread_pool_max_size,
        scheduled_thread_pool_max_size,
        graceful_shutdown_timeout,
        queues,
        topics,
        addresses_max_delivery_attempts,
        addresses_expiry_delay,
        addresses_address_full_message_policy,
        addresses_max_size_bytes,
        addresses_page_size_bytes,
        addresses_page_cache_max_size,
        cluster_user,
        cluster_password,
        cluster_call_timeout,
        cluster_call_failover_timeout,
        cluster_client_failure_check_period,
        cluster_notification_attempts,
        cluster_notification_interval,
        id_cache_size,
        cluster_confirmation_window_size,
        cluster_connection_ttl,
        cluster_duplicate_detection,
        cluster_initial_connect_attempts,
        cluster_max_retry_interval,
        cluster_min_large_message_size,
        cluster_producer_window_size,
        cluster_reconnect_attempts,
        cluster_retry_interval,
        cluster_retry_interval_multiplier
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties) {
    if(NULL == com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties){
        return ;
    }
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled) {
        config_node_property_boolean_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues) {
        config_node_property_array_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics) {
        config_node_property_array_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy) {
        config_node_property_drop_down_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user) {
        config_node_property_string_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password) {
        config_node_property_string_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection) {
        config_node_property_boolean_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval) {
        config_node_property_integer_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval = NULL;
    }
    if (com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier) {
        config_node_property_float_free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier);
        com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier = NULL;
    }
    free(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties);
}

cJSON *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size) {
    cJSON *global_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size);
    if(global_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "global.size", global_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage) {
    cJSON *max_disk_usage_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage);
    if(max_disk_usage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.disk.usage", max_disk_usage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled) {
    cJSON *persistence_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled);
    if(persistence_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "persistence.enabled", persistence_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size) {
    cJSON *thread_pool_max_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size);
    if(thread_pool_max_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "thread.pool.max.size", thread_pool_max_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size) {
    cJSON *scheduled_thread_pool_max_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size);
    if(scheduled_thread_pool_max_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduled.thread.pool.max.size", scheduled_thread_pool_max_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout) {
    cJSON *graceful_shutdown_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout);
    if(graceful_shutdown_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "graceful.shutdown.timeout", graceful_shutdown_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues) {
    cJSON *queues_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues);
    if(queues_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queues", queues_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics) {
    cJSON *topics_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics);
    if(topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "topics", topics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts) {
    cJSON *addresses_max_delivery_attempts_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts);
    if(addresses_max_delivery_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addresses.max.delivery.attempts", addresses_max_delivery_attempts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay) {
    cJSON *addresses_expiry_delay_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay);
    if(addresses_expiry_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addresses.expiry.delay", addresses_expiry_delay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy) {
    cJSON *addresses_address_full_message_policy_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy);
    if(addresses_address_full_message_policy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addresses.address.full.message.policy", addresses_address_full_message_policy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes) {
    cJSON *addresses_max_size_bytes_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes);
    if(addresses_max_size_bytes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addresses.max.size.bytes", addresses_max_size_bytes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes) {
    cJSON *addresses_page_size_bytes_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes);
    if(addresses_page_size_bytes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addresses.page.size.bytes", addresses_page_size_bytes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size) {
    cJSON *addresses_page_cache_max_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size);
    if(addresses_page_cache_max_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "addresses.page.cache.max.size", addresses_page_cache_max_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user) {
    cJSON *cluster_user_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user);
    if(cluster_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.user", cluster_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password) {
    cJSON *cluster_password_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password);
    if(cluster_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.password", cluster_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout) {
    cJSON *cluster_call_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout);
    if(cluster_call_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.call.timeout", cluster_call_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout) {
    cJSON *cluster_call_failover_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout);
    if(cluster_call_failover_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.call.failover.timeout", cluster_call_failover_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period) {
    cJSON *cluster_client_failure_check_period_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period);
    if(cluster_client_failure_check_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.client.failure.check.period", cluster_client_failure_check_period_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts) {
    cJSON *cluster_notification_attempts_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts);
    if(cluster_notification_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.notification.attempts", cluster_notification_attempts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval) {
    cJSON *cluster_notification_interval_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval);
    if(cluster_notification_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.notification.interval", cluster_notification_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size) {
    cJSON *id_cache_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size);
    if(id_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "id.cache.size", id_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size) {
    cJSON *cluster_confirmation_window_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size);
    if(cluster_confirmation_window_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.confirmation.window.size", cluster_confirmation_window_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl) {
    cJSON *cluster_connection_ttl_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl);
    if(cluster_connection_ttl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.connection.ttl", cluster_connection_ttl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection) {
    cJSON *cluster_duplicate_detection_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection);
    if(cluster_duplicate_detection_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.duplicate.detection", cluster_duplicate_detection_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts) {
    cJSON *cluster_initial_connect_attempts_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts);
    if(cluster_initial_connect_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.initial.connect.attempts", cluster_initial_connect_attempts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval) {
    cJSON *cluster_max_retry_interval_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval);
    if(cluster_max_retry_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.max.retry.interval", cluster_max_retry_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size) {
    cJSON *cluster_min_large_message_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size);
    if(cluster_min_large_message_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.min.large.message.size", cluster_min_large_message_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size) {
    cJSON *cluster_producer_window_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size);
    if(cluster_producer_window_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.producer.window.size", cluster_producer_window_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts) {
    cJSON *cluster_reconnect_attempts_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts);
    if(cluster_reconnect_attempts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.reconnect.attempts", cluster_reconnect_attempts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval) {
    cJSON *cluster_retry_interval_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval);
    if(cluster_retry_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.retry.interval", cluster_retry_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier
    if(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier) {
    cJSON *cluster_retry_interval_multiplier_local_JSON = config_node_property_float_convertToJSON(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier);
    if(cluster_retry_interval_multiplier_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cluster.retry.interval.multiplier", cluster_retry_interval_multiplier_local_JSON);
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

com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_parseFromJSON(cJSON *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON){

    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_t *com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size
    config_node_property_integer_t *global_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage
    config_node_property_integer_t *max_disk_usage_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled
    config_node_property_boolean_t *persistence_enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size
    config_node_property_integer_t *thread_pool_max_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size
    config_node_property_integer_t *scheduled_thread_pool_max_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout
    config_node_property_integer_t *graceful_shutdown_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues
    config_node_property_array_t *queues_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics
    config_node_property_array_t *topics_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts
    config_node_property_integer_t *addresses_max_delivery_attempts_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay
    config_node_property_integer_t *addresses_expiry_delay_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy
    config_node_property_drop_down_t *addresses_address_full_message_policy_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes
    config_node_property_integer_t *addresses_max_size_bytes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes
    config_node_property_integer_t *addresses_page_size_bytes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size
    config_node_property_integer_t *addresses_page_cache_max_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user
    config_node_property_string_t *cluster_user_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password
    config_node_property_string_t *cluster_password_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout
    config_node_property_integer_t *cluster_call_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout
    config_node_property_integer_t *cluster_call_failover_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period
    config_node_property_integer_t *cluster_client_failure_check_period_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts
    config_node_property_integer_t *cluster_notification_attempts_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval
    config_node_property_integer_t *cluster_notification_interval_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size
    config_node_property_integer_t *id_cache_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size
    config_node_property_integer_t *cluster_confirmation_window_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl
    config_node_property_integer_t *cluster_connection_ttl_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection
    config_node_property_boolean_t *cluster_duplicate_detection_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts
    config_node_property_integer_t *cluster_initial_connect_attempts_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval
    config_node_property_integer_t *cluster_max_retry_interval_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size
    config_node_property_integer_t *cluster_min_large_message_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size
    config_node_property_integer_t *cluster_producer_window_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts
    config_node_property_integer_t *cluster_reconnect_attempts_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval
    config_node_property_integer_t *cluster_retry_interval_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier
    config_node_property_float_t *cluster_retry_interval_multiplier_local_nonprim = NULL;

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->global_size
    cJSON *global_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "global.size");
    if (cJSON_IsNull(global_size)) {
        global_size = NULL;
    }
    if (global_size) { 
    global_size_local_nonprim = config_node_property_integer_parseFromJSON(global_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->max_disk_usage
    cJSON *max_disk_usage = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "max.disk.usage");
    if (cJSON_IsNull(max_disk_usage)) {
        max_disk_usage = NULL;
    }
    if (max_disk_usage) { 
    max_disk_usage_local_nonprim = config_node_property_integer_parseFromJSON(max_disk_usage); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->persistence_enabled
    cJSON *persistence_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "persistence.enabled");
    if (cJSON_IsNull(persistence_enabled)) {
        persistence_enabled = NULL;
    }
    if (persistence_enabled) { 
    persistence_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(persistence_enabled); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->thread_pool_max_size
    cJSON *thread_pool_max_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "thread.pool.max.size");
    if (cJSON_IsNull(thread_pool_max_size)) {
        thread_pool_max_size = NULL;
    }
    if (thread_pool_max_size) { 
    thread_pool_max_size_local_nonprim = config_node_property_integer_parseFromJSON(thread_pool_max_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->scheduled_thread_pool_max_size
    cJSON *scheduled_thread_pool_max_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "scheduled.thread.pool.max.size");
    if (cJSON_IsNull(scheduled_thread_pool_max_size)) {
        scheduled_thread_pool_max_size = NULL;
    }
    if (scheduled_thread_pool_max_size) { 
    scheduled_thread_pool_max_size_local_nonprim = config_node_property_integer_parseFromJSON(scheduled_thread_pool_max_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->graceful_shutdown_timeout
    cJSON *graceful_shutdown_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "graceful.shutdown.timeout");
    if (cJSON_IsNull(graceful_shutdown_timeout)) {
        graceful_shutdown_timeout = NULL;
    }
    if (graceful_shutdown_timeout) { 
    graceful_shutdown_timeout_local_nonprim = config_node_property_integer_parseFromJSON(graceful_shutdown_timeout); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->queues
    cJSON *queues = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "queues");
    if (cJSON_IsNull(queues)) {
        queues = NULL;
    }
    if (queues) { 
    queues_local_nonprim = config_node_property_array_parseFromJSON(queues); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->topics
    cJSON *topics = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "topics");
    if (cJSON_IsNull(topics)) {
        topics = NULL;
    }
    if (topics) { 
    topics_local_nonprim = config_node_property_array_parseFromJSON(topics); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_delivery_attempts
    cJSON *addresses_max_delivery_attempts = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "addresses.max.delivery.attempts");
    if (cJSON_IsNull(addresses_max_delivery_attempts)) {
        addresses_max_delivery_attempts = NULL;
    }
    if (addresses_max_delivery_attempts) { 
    addresses_max_delivery_attempts_local_nonprim = config_node_property_integer_parseFromJSON(addresses_max_delivery_attempts); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_expiry_delay
    cJSON *addresses_expiry_delay = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "addresses.expiry.delay");
    if (cJSON_IsNull(addresses_expiry_delay)) {
        addresses_expiry_delay = NULL;
    }
    if (addresses_expiry_delay) { 
    addresses_expiry_delay_local_nonprim = config_node_property_integer_parseFromJSON(addresses_expiry_delay); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_address_full_message_policy
    cJSON *addresses_address_full_message_policy = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "addresses.address.full.message.policy");
    if (cJSON_IsNull(addresses_address_full_message_policy)) {
        addresses_address_full_message_policy = NULL;
    }
    if (addresses_address_full_message_policy) { 
    addresses_address_full_message_policy_local_nonprim = config_node_property_drop_down_parseFromJSON(addresses_address_full_message_policy); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_max_size_bytes
    cJSON *addresses_max_size_bytes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "addresses.max.size.bytes");
    if (cJSON_IsNull(addresses_max_size_bytes)) {
        addresses_max_size_bytes = NULL;
    }
    if (addresses_max_size_bytes) { 
    addresses_max_size_bytes_local_nonprim = config_node_property_integer_parseFromJSON(addresses_max_size_bytes); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_size_bytes
    cJSON *addresses_page_size_bytes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "addresses.page.size.bytes");
    if (cJSON_IsNull(addresses_page_size_bytes)) {
        addresses_page_size_bytes = NULL;
    }
    if (addresses_page_size_bytes) { 
    addresses_page_size_bytes_local_nonprim = config_node_property_integer_parseFromJSON(addresses_page_size_bytes); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->addresses_page_cache_max_size
    cJSON *addresses_page_cache_max_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "addresses.page.cache.max.size");
    if (cJSON_IsNull(addresses_page_cache_max_size)) {
        addresses_page_cache_max_size = NULL;
    }
    if (addresses_page_cache_max_size) { 
    addresses_page_cache_max_size_local_nonprim = config_node_property_integer_parseFromJSON(addresses_page_cache_max_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_user
    cJSON *cluster_user = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.user");
    if (cJSON_IsNull(cluster_user)) {
        cluster_user = NULL;
    }
    if (cluster_user) { 
    cluster_user_local_nonprim = config_node_property_string_parseFromJSON(cluster_user); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_password
    cJSON *cluster_password = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.password");
    if (cJSON_IsNull(cluster_password)) {
        cluster_password = NULL;
    }
    if (cluster_password) { 
    cluster_password_local_nonprim = config_node_property_string_parseFromJSON(cluster_password); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_timeout
    cJSON *cluster_call_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.call.timeout");
    if (cJSON_IsNull(cluster_call_timeout)) {
        cluster_call_timeout = NULL;
    }
    if (cluster_call_timeout) { 
    cluster_call_timeout_local_nonprim = config_node_property_integer_parseFromJSON(cluster_call_timeout); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_call_failover_timeout
    cJSON *cluster_call_failover_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.call.failover.timeout");
    if (cJSON_IsNull(cluster_call_failover_timeout)) {
        cluster_call_failover_timeout = NULL;
    }
    if (cluster_call_failover_timeout) { 
    cluster_call_failover_timeout_local_nonprim = config_node_property_integer_parseFromJSON(cluster_call_failover_timeout); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_client_failure_check_period
    cJSON *cluster_client_failure_check_period = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.client.failure.check.period");
    if (cJSON_IsNull(cluster_client_failure_check_period)) {
        cluster_client_failure_check_period = NULL;
    }
    if (cluster_client_failure_check_period) { 
    cluster_client_failure_check_period_local_nonprim = config_node_property_integer_parseFromJSON(cluster_client_failure_check_period); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_attempts
    cJSON *cluster_notification_attempts = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.notification.attempts");
    if (cJSON_IsNull(cluster_notification_attempts)) {
        cluster_notification_attempts = NULL;
    }
    if (cluster_notification_attempts) { 
    cluster_notification_attempts_local_nonprim = config_node_property_integer_parseFromJSON(cluster_notification_attempts); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_notification_interval
    cJSON *cluster_notification_interval = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.notification.interval");
    if (cJSON_IsNull(cluster_notification_interval)) {
        cluster_notification_interval = NULL;
    }
    if (cluster_notification_interval) { 
    cluster_notification_interval_local_nonprim = config_node_property_integer_parseFromJSON(cluster_notification_interval); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->id_cache_size
    cJSON *id_cache_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "id.cache.size");
    if (cJSON_IsNull(id_cache_size)) {
        id_cache_size = NULL;
    }
    if (id_cache_size) { 
    id_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(id_cache_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_confirmation_window_size
    cJSON *cluster_confirmation_window_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.confirmation.window.size");
    if (cJSON_IsNull(cluster_confirmation_window_size)) {
        cluster_confirmation_window_size = NULL;
    }
    if (cluster_confirmation_window_size) { 
    cluster_confirmation_window_size_local_nonprim = config_node_property_integer_parseFromJSON(cluster_confirmation_window_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_connection_ttl
    cJSON *cluster_connection_ttl = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.connection.ttl");
    if (cJSON_IsNull(cluster_connection_ttl)) {
        cluster_connection_ttl = NULL;
    }
    if (cluster_connection_ttl) { 
    cluster_connection_ttl_local_nonprim = config_node_property_integer_parseFromJSON(cluster_connection_ttl); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_duplicate_detection
    cJSON *cluster_duplicate_detection = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.duplicate.detection");
    if (cJSON_IsNull(cluster_duplicate_detection)) {
        cluster_duplicate_detection = NULL;
    }
    if (cluster_duplicate_detection) { 
    cluster_duplicate_detection_local_nonprim = config_node_property_boolean_parseFromJSON(cluster_duplicate_detection); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_initial_connect_attempts
    cJSON *cluster_initial_connect_attempts = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.initial.connect.attempts");
    if (cJSON_IsNull(cluster_initial_connect_attempts)) {
        cluster_initial_connect_attempts = NULL;
    }
    if (cluster_initial_connect_attempts) { 
    cluster_initial_connect_attempts_local_nonprim = config_node_property_integer_parseFromJSON(cluster_initial_connect_attempts); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_max_retry_interval
    cJSON *cluster_max_retry_interval = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.max.retry.interval");
    if (cJSON_IsNull(cluster_max_retry_interval)) {
        cluster_max_retry_interval = NULL;
    }
    if (cluster_max_retry_interval) { 
    cluster_max_retry_interval_local_nonprim = config_node_property_integer_parseFromJSON(cluster_max_retry_interval); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_min_large_message_size
    cJSON *cluster_min_large_message_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.min.large.message.size");
    if (cJSON_IsNull(cluster_min_large_message_size)) {
        cluster_min_large_message_size = NULL;
    }
    if (cluster_min_large_message_size) { 
    cluster_min_large_message_size_local_nonprim = config_node_property_integer_parseFromJSON(cluster_min_large_message_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_producer_window_size
    cJSON *cluster_producer_window_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.producer.window.size");
    if (cJSON_IsNull(cluster_producer_window_size)) {
        cluster_producer_window_size = NULL;
    }
    if (cluster_producer_window_size) { 
    cluster_producer_window_size_local_nonprim = config_node_property_integer_parseFromJSON(cluster_producer_window_size); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_reconnect_attempts
    cJSON *cluster_reconnect_attempts = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.reconnect.attempts");
    if (cJSON_IsNull(cluster_reconnect_attempts)) {
        cluster_reconnect_attempts = NULL;
    }
    if (cluster_reconnect_attempts) { 
    cluster_reconnect_attempts_local_nonprim = config_node_property_integer_parseFromJSON(cluster_reconnect_attempts); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval
    cJSON *cluster_retry_interval = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.retry.interval");
    if (cJSON_IsNull(cluster_retry_interval)) {
        cluster_retry_interval = NULL;
    }
    if (cluster_retry_interval) { 
    cluster_retry_interval_local_nonprim = config_node_property_integer_parseFromJSON(cluster_retry_interval); //nonprimitive
    }

    // com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties->cluster_retry_interval_multiplier
    cJSON *cluster_retry_interval_multiplier = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_propertiesJSON, "cluster.retry.interval.multiplier");
    if (cJSON_IsNull(cluster_retry_interval_multiplier)) {
        cluster_retry_interval_multiplier = NULL;
    }
    if (cluster_retry_interval_multiplier) { 
    cluster_retry_interval_multiplier_local_nonprim = config_node_property_float_parseFromJSON(cluster_retry_interval_multiplier); //nonprimitive
    }



    com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var = com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_create_internal (
        service_ranking ? service_ranking_local_nonprim : NULL,
        global_size ? global_size_local_nonprim : NULL,
        max_disk_usage ? max_disk_usage_local_nonprim : NULL,
        persistence_enabled ? persistence_enabled_local_nonprim : NULL,
        thread_pool_max_size ? thread_pool_max_size_local_nonprim : NULL,
        scheduled_thread_pool_max_size ? scheduled_thread_pool_max_size_local_nonprim : NULL,
        graceful_shutdown_timeout ? graceful_shutdown_timeout_local_nonprim : NULL,
        queues ? queues_local_nonprim : NULL,
        topics ? topics_local_nonprim : NULL,
        addresses_max_delivery_attempts ? addresses_max_delivery_attempts_local_nonprim : NULL,
        addresses_expiry_delay ? addresses_expiry_delay_local_nonprim : NULL,
        addresses_address_full_message_policy ? addresses_address_full_message_policy_local_nonprim : NULL,
        addresses_max_size_bytes ? addresses_max_size_bytes_local_nonprim : NULL,
        addresses_page_size_bytes ? addresses_page_size_bytes_local_nonprim : NULL,
        addresses_page_cache_max_size ? addresses_page_cache_max_size_local_nonprim : NULL,
        cluster_user ? cluster_user_local_nonprim : NULL,
        cluster_password ? cluster_password_local_nonprim : NULL,
        cluster_call_timeout ? cluster_call_timeout_local_nonprim : NULL,
        cluster_call_failover_timeout ? cluster_call_failover_timeout_local_nonprim : NULL,
        cluster_client_failure_check_period ? cluster_client_failure_check_period_local_nonprim : NULL,
        cluster_notification_attempts ? cluster_notification_attempts_local_nonprim : NULL,
        cluster_notification_interval ? cluster_notification_interval_local_nonprim : NULL,
        id_cache_size ? id_cache_size_local_nonprim : NULL,
        cluster_confirmation_window_size ? cluster_confirmation_window_size_local_nonprim : NULL,
        cluster_connection_ttl ? cluster_connection_ttl_local_nonprim : NULL,
        cluster_duplicate_detection ? cluster_duplicate_detection_local_nonprim : NULL,
        cluster_initial_connect_attempts ? cluster_initial_connect_attempts_local_nonprim : NULL,
        cluster_max_retry_interval ? cluster_max_retry_interval_local_nonprim : NULL,
        cluster_min_large_message_size ? cluster_min_large_message_size_local_nonprim : NULL,
        cluster_producer_window_size ? cluster_producer_window_size_local_nonprim : NULL,
        cluster_reconnect_attempts ? cluster_reconnect_attempts_local_nonprim : NULL,
        cluster_retry_interval ? cluster_retry_interval_local_nonprim : NULL,
        cluster_retry_interval_multiplier ? cluster_retry_interval_multiplier_local_nonprim : NULL
        );

    if (!com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_local_var;
end:
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    if (global_size_local_nonprim) {
        config_node_property_integer_free(global_size_local_nonprim);
        global_size_local_nonprim = NULL;
    }
    if (max_disk_usage_local_nonprim) {
        config_node_property_integer_free(max_disk_usage_local_nonprim);
        max_disk_usage_local_nonprim = NULL;
    }
    if (persistence_enabled_local_nonprim) {
        config_node_property_boolean_free(persistence_enabled_local_nonprim);
        persistence_enabled_local_nonprim = NULL;
    }
    if (thread_pool_max_size_local_nonprim) {
        config_node_property_integer_free(thread_pool_max_size_local_nonprim);
        thread_pool_max_size_local_nonprim = NULL;
    }
    if (scheduled_thread_pool_max_size_local_nonprim) {
        config_node_property_integer_free(scheduled_thread_pool_max_size_local_nonprim);
        scheduled_thread_pool_max_size_local_nonprim = NULL;
    }
    if (graceful_shutdown_timeout_local_nonprim) {
        config_node_property_integer_free(graceful_shutdown_timeout_local_nonprim);
        graceful_shutdown_timeout_local_nonprim = NULL;
    }
    if (queues_local_nonprim) {
        config_node_property_array_free(queues_local_nonprim);
        queues_local_nonprim = NULL;
    }
    if (topics_local_nonprim) {
        config_node_property_array_free(topics_local_nonprim);
        topics_local_nonprim = NULL;
    }
    if (addresses_max_delivery_attempts_local_nonprim) {
        config_node_property_integer_free(addresses_max_delivery_attempts_local_nonprim);
        addresses_max_delivery_attempts_local_nonprim = NULL;
    }
    if (addresses_expiry_delay_local_nonprim) {
        config_node_property_integer_free(addresses_expiry_delay_local_nonprim);
        addresses_expiry_delay_local_nonprim = NULL;
    }
    if (addresses_address_full_message_policy_local_nonprim) {
        config_node_property_drop_down_free(addresses_address_full_message_policy_local_nonprim);
        addresses_address_full_message_policy_local_nonprim = NULL;
    }
    if (addresses_max_size_bytes_local_nonprim) {
        config_node_property_integer_free(addresses_max_size_bytes_local_nonprim);
        addresses_max_size_bytes_local_nonprim = NULL;
    }
    if (addresses_page_size_bytes_local_nonprim) {
        config_node_property_integer_free(addresses_page_size_bytes_local_nonprim);
        addresses_page_size_bytes_local_nonprim = NULL;
    }
    if (addresses_page_cache_max_size_local_nonprim) {
        config_node_property_integer_free(addresses_page_cache_max_size_local_nonprim);
        addresses_page_cache_max_size_local_nonprim = NULL;
    }
    if (cluster_user_local_nonprim) {
        config_node_property_string_free(cluster_user_local_nonprim);
        cluster_user_local_nonprim = NULL;
    }
    if (cluster_password_local_nonprim) {
        config_node_property_string_free(cluster_password_local_nonprim);
        cluster_password_local_nonprim = NULL;
    }
    if (cluster_call_timeout_local_nonprim) {
        config_node_property_integer_free(cluster_call_timeout_local_nonprim);
        cluster_call_timeout_local_nonprim = NULL;
    }
    if (cluster_call_failover_timeout_local_nonprim) {
        config_node_property_integer_free(cluster_call_failover_timeout_local_nonprim);
        cluster_call_failover_timeout_local_nonprim = NULL;
    }
    if (cluster_client_failure_check_period_local_nonprim) {
        config_node_property_integer_free(cluster_client_failure_check_period_local_nonprim);
        cluster_client_failure_check_period_local_nonprim = NULL;
    }
    if (cluster_notification_attempts_local_nonprim) {
        config_node_property_integer_free(cluster_notification_attempts_local_nonprim);
        cluster_notification_attempts_local_nonprim = NULL;
    }
    if (cluster_notification_interval_local_nonprim) {
        config_node_property_integer_free(cluster_notification_interval_local_nonprim);
        cluster_notification_interval_local_nonprim = NULL;
    }
    if (id_cache_size_local_nonprim) {
        config_node_property_integer_free(id_cache_size_local_nonprim);
        id_cache_size_local_nonprim = NULL;
    }
    if (cluster_confirmation_window_size_local_nonprim) {
        config_node_property_integer_free(cluster_confirmation_window_size_local_nonprim);
        cluster_confirmation_window_size_local_nonprim = NULL;
    }
    if (cluster_connection_ttl_local_nonprim) {
        config_node_property_integer_free(cluster_connection_ttl_local_nonprim);
        cluster_connection_ttl_local_nonprim = NULL;
    }
    if (cluster_duplicate_detection_local_nonprim) {
        config_node_property_boolean_free(cluster_duplicate_detection_local_nonprim);
        cluster_duplicate_detection_local_nonprim = NULL;
    }
    if (cluster_initial_connect_attempts_local_nonprim) {
        config_node_property_integer_free(cluster_initial_connect_attempts_local_nonprim);
        cluster_initial_connect_attempts_local_nonprim = NULL;
    }
    if (cluster_max_retry_interval_local_nonprim) {
        config_node_property_integer_free(cluster_max_retry_interval_local_nonprim);
        cluster_max_retry_interval_local_nonprim = NULL;
    }
    if (cluster_min_large_message_size_local_nonprim) {
        config_node_property_integer_free(cluster_min_large_message_size_local_nonprim);
        cluster_min_large_message_size_local_nonprim = NULL;
    }
    if (cluster_producer_window_size_local_nonprim) {
        config_node_property_integer_free(cluster_producer_window_size_local_nonprim);
        cluster_producer_window_size_local_nonprim = NULL;
    }
    if (cluster_reconnect_attempts_local_nonprim) {
        config_node_property_integer_free(cluster_reconnect_attempts_local_nonprim);
        cluster_reconnect_attempts_local_nonprim = NULL;
    }
    if (cluster_retry_interval_local_nonprim) {
        config_node_property_integer_free(cluster_retry_interval_local_nonprim);
        cluster_retry_interval_local_nonprim = NULL;
    }
    if (cluster_retry_interval_multiplier_local_nonprim) {
        config_node_property_float_free(cluster_retry_interval_multiplier_local_nonprim);
        cluster_retry_interval_multiplier_local_nonprim = NULL;
    }
    return NULL;

}
