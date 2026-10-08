require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixSystemreadyImplServletSystemAliveServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, osgi_http_whiteboard_servlet_pattern : String? = nil, osgi_http_whiteboard_context_select : String? = nil) : Response(OpenAPIClient::OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "osgi.http.whiteboard.servlet.pattern" => osgi_http_whiteboard_servlet_pattern, "osgi.http.whiteboard.context.select" => osgi_http_whiteboard_context_select },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
