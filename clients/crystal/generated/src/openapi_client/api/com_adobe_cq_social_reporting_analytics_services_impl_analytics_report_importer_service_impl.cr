require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportImporterServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_social_reporting_analytics_polling_importer_interval : Int32? = nil, cq_social_reporting_analytics_polling_importer_page_size : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.social.reporting.analytics.polling.importer.interval" => cq_social_reporting_analytics_polling_importer_interval, "cq.social.reporting.analytics.polling.importer.pageSize" => cq_social_reporting_analytics_polling_importer_page_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
