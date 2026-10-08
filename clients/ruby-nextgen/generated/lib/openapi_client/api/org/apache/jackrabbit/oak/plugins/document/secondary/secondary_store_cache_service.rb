# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacheService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, included_paths: nil, enable_async_observer: nil, observer_queue_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryH84218a04,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'includedPaths' => included_paths, 'enableAsyncObserver' => enable_async_observer, 'observerQueueSize' => observer_queue_size }
        )
      end
    end
  end
end
