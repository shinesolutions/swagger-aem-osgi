# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWebConsoleSecurityProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, users: nil, groups: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider',
          type: OpenapiClient::Models::OrgApacheSlingExtensionsWebconsolesecurityproviderInternaHaec1d1dd,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'users' => users, 'groups' => groups }
        )
      end
    end
  end
end
