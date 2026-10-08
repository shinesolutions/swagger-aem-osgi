# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, provider_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFH15b58ab9,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'providerType' => provider_type }
        )
      end
    end
  end
end
