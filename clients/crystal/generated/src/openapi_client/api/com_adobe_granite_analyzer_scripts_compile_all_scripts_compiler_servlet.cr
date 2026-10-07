require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, disabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "disabled" => disabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
