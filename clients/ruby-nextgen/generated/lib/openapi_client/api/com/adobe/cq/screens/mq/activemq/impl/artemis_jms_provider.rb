# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensMqActivemqImplArtemisJMSProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, global_size: nil, max_disk_usage: nil, persistence_enabled: nil, thread_pool_max_size: nil, scheduled_thread_pool_max_size: nil, graceful_shutdown_timeout: nil, queues: nil, topics: nil, addresses_max_delivery_attempts: nil, addresses_expiry_delay: nil, addresses_address_full_message_policy: nil, addresses_max_size_bytes: nil, addresses_page_size_bytes: nil, addresses_page_cache_max_size: nil, cluster_user: nil, cluster_password: nil, cluster_call_timeout: nil, cluster_call_failover_timeout: nil, cluster_client_failure_check_period: nil, cluster_notification_attempts: nil, cluster_notification_interval: nil, id_cache_size: nil, cluster_confirmation_window_size: nil, cluster_connection_ttl: nil, cluster_duplicate_detection: nil, cluster_initial_connect_attempts: nil, cluster_max_retry_interval: nil, cluster_min_large_message_size: nil, cluster_producer_window_size: nil, cluster_reconnect_attempts: nil, cluster_retry_interval: nil, cluster_retry_interval_multiplier: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider',
          type: OpenapiClient::Models::ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'global.size' => global_size, 'max.disk.usage' => max_disk_usage, 'persistence.enabled' => persistence_enabled, 'thread.pool.max.size' => thread_pool_max_size, 'scheduled.thread.pool.max.size' => scheduled_thread_pool_max_size, 'graceful.shutdown.timeout' => graceful_shutdown_timeout, 'queues' => queues, 'topics' => topics, 'addresses.max.delivery.attempts' => addresses_max_delivery_attempts, 'addresses.expiry.delay' => addresses_expiry_delay, 'addresses.address.full.message.policy' => addresses_address_full_message_policy, 'addresses.max.size.bytes' => addresses_max_size_bytes, 'addresses.page.size.bytes' => addresses_page_size_bytes, 'addresses.page.cache.max.size' => addresses_page_cache_max_size, 'cluster.user' => cluster_user, 'cluster.password' => cluster_password, 'cluster.call.timeout' => cluster_call_timeout, 'cluster.call.failover.timeout' => cluster_call_failover_timeout, 'cluster.client.failure.check.period' => cluster_client_failure_check_period, 'cluster.notification.attempts' => cluster_notification_attempts, 'cluster.notification.interval' => cluster_notification_interval, 'id.cache.size' => id_cache_size, 'cluster.confirmation.window.size' => cluster_confirmation_window_size, 'cluster.connection.ttl' => cluster_connection_ttl, 'cluster.duplicate.detection' => cluster_duplicate_detection, 'cluster.initial.connect.attempts' => cluster_initial_connect_attempts, 'cluster.max.retry.interval' => cluster_max_retry_interval, 'cluster.min.large.message.size' => cluster_min_large_message_size, 'cluster.producer.window.size' => cluster_producer_window_size, 'cluster.reconnect.attempts' => cluster_reconnect_attempts, 'cluster.retry.interval' => cluster_retry_interval, 'cluster.retry.interval.multiplier' => cluster_retry_interval_multiplier }
        )
      end
    end
  end
end
