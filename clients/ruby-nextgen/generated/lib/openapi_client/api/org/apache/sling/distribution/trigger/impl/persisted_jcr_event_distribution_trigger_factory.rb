# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributionTriggerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, path: nil, service_name: nil, nuggets_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionTriggerImplPersistedJcrEventHde80857f,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'path' => path, 'serviceName' => service_name, 'nuggetsPath' => nuggets_path }
        )
      end
    end
  end
end
