# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingCaconfigImplConfigurationResolverImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, config_bucket_names: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl',
          type: OpenapiClient::Models::OrgApacheSlingCaconfigImplConfigurationResolverImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'configBucketNames' => config_bucket_names }
        )
      end
    end
  end
end
