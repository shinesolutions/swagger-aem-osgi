require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAcpPlatformPlatformServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, query_limit : Int32? = nil, file_type_extension_map : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteAcpPlatformPlatformServletInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAcpPlatformPlatformServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "query.limit" => query_limit, "file.type.extension.map" => file_type_extension_map },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
