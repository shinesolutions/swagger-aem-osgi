# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, port: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport',
          type: OpenapiClient::Models::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'port' => port }
        )
      end
    end
  end
end
