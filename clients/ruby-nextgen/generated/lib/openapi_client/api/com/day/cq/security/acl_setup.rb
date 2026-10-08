# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqSecurityACLSetup
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_aclsetup_rules: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.security.ACLSetup',
          type: OpenapiClient::Models::ComDayCqSecurityACLSetupInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.aclsetup.rules' => cq_aclsetup_rules }
        )
      end
    end
  end
end
