require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil, account_logins : Array(String)? = nil, console_logins : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags, "account.logins" => account_logins, "console.logins" => console_logins },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
