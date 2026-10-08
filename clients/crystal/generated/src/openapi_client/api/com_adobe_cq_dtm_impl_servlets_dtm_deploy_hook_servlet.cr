require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDtmImplServletsDTMDeployHookServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dtm_staging_ip_whitelist : Array(String)? = nil, dtm_production_ip_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqDtmImplServletsDTMDeployHookServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDtmImplServletsDTMDeployHookServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dtm.staging.ip.whitelist" => dtm_staging_ip_whitelist, "dtm.production.ip.whitelist" => dtm_production_ip_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
