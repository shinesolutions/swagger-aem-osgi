require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAnalyzerBaseSystemStatusServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, disabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "disabled" => disabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
