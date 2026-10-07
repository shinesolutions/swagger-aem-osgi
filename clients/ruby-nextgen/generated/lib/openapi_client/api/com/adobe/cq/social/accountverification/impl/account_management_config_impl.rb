# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable: nil, ttl1: nil, ttl2: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialAccountverificationImplAccountManagemenH250f9ac0,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enable' => enable, 'ttl1' => ttl1, 'ttl2' => ttl2 }
        )
      end
    end
  end
end
