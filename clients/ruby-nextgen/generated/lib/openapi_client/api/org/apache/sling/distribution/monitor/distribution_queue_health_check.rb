# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_name: nil, hc_tags: nil, hc_mbean_name: nil, number_of_retries_allowed: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck',
          type: OpenapiClient::Models::OrgApacheSlingDistributionMonitorDistributionQueueHealtHae7922c5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.name' => hc_name, 'hc.tags' => hc_tags, 'hc.mbean.name' => hc_mbean_name, 'numberOfRetriesAllowed' => number_of_retries_allowed }
        )
      end
    end
  end
end
