# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDistributionResourcesImplDistributionConfigurationResourceProviderFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, provider_roots: nil, kind: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory',
          type: OpenapiClient::Models::OrgApacheSlingDistributionResourcesImplDistributionConfH92305d0f,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'provider.roots' => provider_roots, 'kind' => kind }
        )
      end
    end
  end
end
