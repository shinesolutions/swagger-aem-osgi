# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, path: nil, ignored_paths_patterns: nil, service_name: nil, deep: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionTriggerImplJcrEventDistributHfa1253bd,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'path' => path, 'ignoredPathsPatterns' => ignored_paths_patterns, 'serviceName' => service_name, 'deep' => deep }
        )
      end
    end
  end
end
