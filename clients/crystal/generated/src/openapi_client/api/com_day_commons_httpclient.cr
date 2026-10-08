require "json"

module OpenAPIClient
  module Api
  class ComDayCommonsHttpclient
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, proxy_enabled : Bool? = nil, proxy_host : String? = nil, proxy_user : String? = nil, proxy_password : String? = nil, proxy_ntlm_host : String? = nil, proxy_ntlm_domain : String? = nil, proxy_exceptions : Array(String)? = nil) : Response(OpenAPIClient::ComDayCommonsHttpclientInfo)
      @conn.request(OpenAPIClient::ComDayCommonsHttpclientInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.commons.httpclient",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "proxy.enabled" => proxy_enabled, "proxy.host" => proxy_host, "proxy.user" => proxy_user, "proxy.password" => proxy_password, "proxy.ntlm.host" => proxy_ntlm_host, "proxy.ntlm.domain" => proxy_ntlm_domain, "proxy.exceptions" => proxy_exceptions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
