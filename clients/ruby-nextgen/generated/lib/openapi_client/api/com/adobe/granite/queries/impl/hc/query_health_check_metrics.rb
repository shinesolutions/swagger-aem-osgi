# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, get_period: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics',
          type: OpenapiClient::Models::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'getPeriod' => get_period }
        )
      end
    end
  end
end
