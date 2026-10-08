# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJmxProviderImplJMXResourceProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, provider_roots: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider',
          type: OpenapiClient::Models::OrgApacheSlingJmxProviderImplJMXResourceProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'provider.roots' => provider_roots }
        )
      end
    end
  end
end
