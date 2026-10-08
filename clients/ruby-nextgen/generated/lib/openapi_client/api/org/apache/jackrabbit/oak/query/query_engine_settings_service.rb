# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakQueryQueryEngineSettingsService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, query_limit_in_memory: nil, query_limit_reads: nil, query_fail_traversal: nil, fast_query_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'queryLimitInMemory' => query_limit_in_memory, 'queryLimitReads' => query_limit_reads, 'queryFailTraversal' => query_fail_traversal, 'fastQuerySize' => fast_query_size }
        )
      end
    end
  end
end
