require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRestImplServletDefaultGETServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, default_limit : Int32? = nil, use_absolute_uri : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteRestImplServletDefaultGETServletInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRestImplServletDefaultGETServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "default.limit" => default_limit, "use.absolute.uri" => use_absolute_uri },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
