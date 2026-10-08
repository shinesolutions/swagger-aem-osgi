# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, large_index_critical_threshold: nil, large_index_warn_threshold: nil, hc_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'large.index.critical.threshold' => large_index_critical_threshold, 'large.index.warn.threshold' => large_index_warn_threshold, 'hc.tags' => hc_tags }
        )
      end
    end
  end
end
