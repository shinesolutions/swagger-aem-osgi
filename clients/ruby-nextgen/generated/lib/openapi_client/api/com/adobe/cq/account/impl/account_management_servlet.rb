# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqAccountImplAccountManagementServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_accountmanager_config_informnewaccount_mail: nil, cq_accountmanager_config_informnewpwd_mail: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet',
          type: OpenapiClient::Models::ComAdobeCqAccountImplAccountManagementServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.accountmanager.config.informnewaccount.mail' => cq_accountmanager_config_informnewaccount_mail, 'cq.accountmanager.config.informnewpwd.mail' => cq_accountmanager_config_informnewpwd_mail }
        )
      end
    end
  end
end
