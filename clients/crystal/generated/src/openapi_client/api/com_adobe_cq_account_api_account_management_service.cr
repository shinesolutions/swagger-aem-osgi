require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqAccountApiAccountManagementService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_accountmanager_token_validity_period : Int32? = nil, cq_accountmanager_config_requestnewaccount_mail : String? = nil, cq_accountmanager_config_requestnewpwd_mail : String? = nil) : Response(OpenAPIClient::ComAdobeCqAccountApiAccountManagementServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeCqAccountApiAccountManagementServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.accountmanager.token.validity.period" => cq_accountmanager_token_validity_period, "cq.accountmanager.config.requestnewaccount.mail" => cq_accountmanager_config_requestnewaccount_mail, "cq.accountmanager.config.requestnewpwd.mail" => cq_accountmanager_config_requestnewpwd_mail },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
