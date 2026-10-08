# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsMetricsInternalLogReporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, period: nil, time_unit: nil, level: nil, logger_name: nil, prefix: nil, pattern: nil, registry_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter',
          type: OpenapiClient::Models::OrgApacheSlingCommonsMetricsInternalLogReporterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'period' => period, 'timeUnit' => time_unit, 'level' => level, 'loggerName' => logger_name, 'prefix' => prefix, 'pattern' => pattern, 'registryName' => registry_name }
        )
      end
    end
  end
end
