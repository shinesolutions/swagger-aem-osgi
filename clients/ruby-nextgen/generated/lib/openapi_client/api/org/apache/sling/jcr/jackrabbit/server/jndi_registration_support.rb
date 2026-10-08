# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, java_naming_factory_initial: nil, java_naming_provider_url: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport',
          type: OpenapiClient::Models::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'java.naming.factory.initial' => java_naming_factory_initial, 'java.naming.provider.url' => java_naming_provider_url }
        )
      end
    end
  end
end
