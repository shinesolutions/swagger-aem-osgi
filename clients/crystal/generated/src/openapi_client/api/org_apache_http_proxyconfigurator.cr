require "json"

module OpenAPIClient
  module Api
  class OrgApacheHttpProxyconfigurator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, proxy_enabled : Bool? = nil, proxy_host : String? = nil, proxy_port : Int32? = nil, proxy_user : String? = nil, proxy_password : String? = nil, proxy_exceptions : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheHttpProxyconfiguratorInfo)
      @conn.request(OpenAPIClient::OrgApacheHttpProxyconfiguratorInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.http.proxyconfigurator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "proxy.enabled" => proxy_enabled, "proxy.host" => proxy_host, "proxy.port" => proxy_port, "proxy.user" => proxy_user, "proxy.password" => proxy_password, "proxy.exceptions" => proxy_exceptions },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
