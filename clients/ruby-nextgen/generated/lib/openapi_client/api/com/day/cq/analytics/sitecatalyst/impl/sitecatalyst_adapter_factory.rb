# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_analytics_adapterfactory_contextstores: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory',
          type: OpenapiClient::Models::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.analytics.adapterfactory.contextstores' => cq_analytics_adapterfactory_contextstores }
        )
      end
    end
  end
end
