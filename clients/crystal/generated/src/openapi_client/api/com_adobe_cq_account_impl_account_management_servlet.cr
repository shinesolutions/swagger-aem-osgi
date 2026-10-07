require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqAccountImplAccountManagementServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_accountmanager_config_informnewaccount_mail : String? = nil, cq_accountmanager_config_informnewpwd_mail : String? = nil) : Response(OpenAPIClient::ComAdobeCqAccountImplAccountManagementServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqAccountImplAccountManagementServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.accountmanager.config.informnewaccount.mail" => cq_accountmanager_config_informnewaccount_mail, "cq.accountmanager.config.informnewpwd.mail" => cq_accountmanager_config_informnewpwd_mail },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
