require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqContentinsightImplServletsReportingServicesProxyServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, reportingservices_proxy_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo)
      @conn.request(OpenAPIClient::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "reportingservices.proxy.whitelist" => reportingservices_proxy_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
