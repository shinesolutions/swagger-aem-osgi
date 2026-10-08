require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOptoutImplOptOutServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, optout_cookies : Array(String)? = nil, optout_headers : Array(String)? = nil, optout_whitelist_cookies : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteOptoutImplOptOutServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOptoutImplOptOutServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "optout.cookies" => optout_cookies, "optout.headers" => optout_headers, "optout.whitelist.cookies" => optout_whitelist_cookies },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
