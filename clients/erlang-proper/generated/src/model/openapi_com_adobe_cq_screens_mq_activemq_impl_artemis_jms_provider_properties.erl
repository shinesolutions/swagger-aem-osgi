-module(openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties/0]).

-export([openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties/1]).

-export_type([openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties/0]).

-type openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'global_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'max_disk_usage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'persistence_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'thread_pool_max_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'scheduled_thread_pool_max_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'graceful_shutdown_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queues', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'topics', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'addresses_max_delivery_attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'addresses_expiry_delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'addresses_address_full_message_policy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'addresses_max_size_bytes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'addresses_page_size_bytes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'addresses_page_cache_max_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cluster_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cluster_call_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_call_failover_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_client_failure_check_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_notification_attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_notification_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'id_cache_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_confirmation_window_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_connection_ttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_duplicate_detection', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cluster_initial_connect_attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_max_retry_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_min_large_message_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_producer_window_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_reconnect_attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_retry_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cluster_retry_interval_multiplier', openapi_config_node_property_float:openapi_config_node_property_float() }
  ].


openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties() ->
    openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties([]).

openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'global.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'max.disk.usage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'persistence.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'thread.pool.max.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'scheduled.thread.pool.max.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'graceful.shutdown.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queues', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'topics', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'addresses.max.delivery.attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'addresses.expiry.delay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'addresses.address.full.message.policy', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'addresses.max.size.bytes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'addresses.page.size.bytes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'addresses.page.cache.max.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cluster.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cluster.call.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.call.failover.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.client.failure.check.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.notification.attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.notification.interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'id.cache.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.confirmation.window.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.connection.ttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.duplicate.detection', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cluster.initial.connect.attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.max.retry.interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.min.large.message.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.producer.window.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.reconnect.attempts', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.retry.interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cluster.retry.interval.multiplier', openapi_config_node_property_float:openapi_config_node_property_float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

