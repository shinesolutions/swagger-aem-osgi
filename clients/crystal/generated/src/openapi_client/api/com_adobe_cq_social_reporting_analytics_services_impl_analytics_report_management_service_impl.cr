require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportManagementServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, report_fetch_delay : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "report.fetch.delay" => report_fetch_delay },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
