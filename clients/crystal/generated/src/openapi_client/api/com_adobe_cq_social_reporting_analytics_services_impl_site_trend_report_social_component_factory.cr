require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSocialComponentFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_social_console_analytics_sites_mapping : Array(String)? = nil, priority : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.social.console.analytics.sites.mapping" => cq_social_console_analytics_sites_mapping, "priority" => priority },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
