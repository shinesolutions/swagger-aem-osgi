require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, brightedge_url : String? = nil) : Response(OpenAPIClient::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "brightedge.url" => brightedge_url },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
