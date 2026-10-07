# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, async_configs: nil, lease_time_out_minutes: nil, failing_index_timeout_seconds: nil, error_warn_interval_seconds: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'asyncConfigs' => async_configs, 'leaseTimeOutMinutes' => lease_time_out_minutes, 'failingIndexTimeoutSeconds' => failing_index_timeout_seconds, 'errorWarnIntervalSeconds' => error_warn_interval_seconds }
        )
      end
    end
  end
end
