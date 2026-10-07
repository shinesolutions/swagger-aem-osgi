# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_analytics_sitecatalyst_service_datacenter_url: nil, devhostnamepatterns: nil, connection_timeout: nil, socket_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl',
          type: OpenapiClient::Models::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClienH62b4b68b,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.analytics.sitecatalyst.service.datacenter.url' => cq_analytics_sitecatalyst_service_datacenter_url, 'devhostnamepatterns' => devhostnamepatterns, 'connection.timeout' => connection_timeout, 'socket.timeout' => socket_timeout }
        )
      end
    end
  end
end
