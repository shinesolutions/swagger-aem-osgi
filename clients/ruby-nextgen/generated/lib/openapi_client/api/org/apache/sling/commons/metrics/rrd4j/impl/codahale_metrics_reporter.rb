# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, datasources: nil, step: nil, archives: nil, path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter',
          type: OpenapiClient::Models::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsRH941241ec,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'datasources' => datasources, 'step' => step, 'archives' => archives, 'path' => path }
        )
      end
    end
  end
end
