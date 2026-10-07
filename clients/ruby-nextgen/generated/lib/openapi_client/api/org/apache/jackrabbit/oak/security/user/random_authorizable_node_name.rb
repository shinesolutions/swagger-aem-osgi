# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, length: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNoHad64df68,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'length' => length }
        )
      end
    end
  end
end
