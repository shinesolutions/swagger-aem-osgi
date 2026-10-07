# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, indexing_critical_threshold: nil, indexing_warn_threshold: nil, hc_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'indexing.critical.threshold' => indexing_critical_threshold, 'indexing.warn.threshold' => indexing_warn_threshold, 'hc.tags' => hc_tags }
        )
      end
    end
  end
end
