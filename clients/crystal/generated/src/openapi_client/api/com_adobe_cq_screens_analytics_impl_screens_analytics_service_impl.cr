require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_cq_screens_analytics_impl_url : String? = nil, com_adobe_cq_screens_analytics_impl_apikey : String? = nil, com_adobe_cq_screens_analytics_impl_project : String? = nil, com_adobe_cq_screens_analytics_impl_environment : String? = nil, com_adobe_cq_screens_analytics_impl_send_frequency : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.cq.screens.analytics.impl.url" => com_adobe_cq_screens_analytics_impl_url, "com.adobe.cq.screens.analytics.impl.apikey" => com_adobe_cq_screens_analytics_impl_apikey, "com.adobe.cq.screens.analytics.impl.project" => com_adobe_cq_screens_analytics_impl_project, "com.adobe.cq.screens.analytics.impl.environment" => com_adobe_cq_screens_analytics_impl_environment, "com.adobe.cq.screens.analytics.impl.sendFrequency" => com_adobe_cq_screens_analytics_impl_send_frequency },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
