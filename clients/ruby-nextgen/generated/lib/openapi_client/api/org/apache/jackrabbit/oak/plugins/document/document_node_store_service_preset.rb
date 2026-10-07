# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreset
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, persistent_cache_includes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreH4dddabbc,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'persistentCacheIncludes' => persistent_cache_includes }
        )
      end
    end
  end
end
