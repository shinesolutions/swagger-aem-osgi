# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil, account_logins: nil, console_logins: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags, 'account.logins' => account_logins, 'console.logins' => console_logins }
        )
      end
    end
  end
end
