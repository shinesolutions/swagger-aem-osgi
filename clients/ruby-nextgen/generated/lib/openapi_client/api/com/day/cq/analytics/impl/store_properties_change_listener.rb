# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsImplStorePropertiesChangeListener
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_store_listener_additional_store_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener',
          type: OpenapiClient::Models::ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.store.listener.additionalStorePaths' => cq_store_listener_additional_store_paths }
        )
      end
    end
  end
end
