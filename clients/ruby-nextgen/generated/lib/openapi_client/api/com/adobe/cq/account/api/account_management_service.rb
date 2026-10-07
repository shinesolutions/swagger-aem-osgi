# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqAccountApiAccountManagementService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_accountmanager_token_validity_period: nil, cq_accountmanager_config_requestnewaccount_mail: nil, cq_accountmanager_config_requestnewpwd_mail: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService',
          type: OpenapiClient::Models::ComAdobeCqAccountApiAccountManagementServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.accountmanager.token.validity.period' => cq_accountmanager_token_validity_period, 'cq.accountmanager.config.requestnewaccount.mail' => cq_accountmanager_config_requestnewaccount_mail, 'cq.accountmanager.config.requestnewpwd.mail' => cq_accountmanager_config_requestnewpwd_mail }
        )
      end
    end
  end
end
