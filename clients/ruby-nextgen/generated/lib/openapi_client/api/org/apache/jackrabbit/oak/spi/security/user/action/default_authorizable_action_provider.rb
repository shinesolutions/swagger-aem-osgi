# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableActionProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled_actions: nil, user_privilege_names: nil, group_privilege_names: nil, constraint: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAutHfc75b1eb,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabledActions' => enabled_actions, 'userPrivilegeNames' => user_privilege_names, 'groupPrivilegeNames' => group_privilege_names, 'constraint' => constraint }
        )
      end
    end
  end
end
