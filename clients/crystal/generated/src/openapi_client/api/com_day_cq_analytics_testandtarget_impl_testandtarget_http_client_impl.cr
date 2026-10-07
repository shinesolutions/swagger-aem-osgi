require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_analytics_testandtarget_api_url : String? = nil, cq_analytics_testandtarget_timeout : Int32? = nil, cq_analytics_testandtarget_sockettimeout : Int32? = nil, cq_analytics_testandtarget_recommendations_url_replace : String? = nil, cq_analytics_testandtarget_recommendations_url_replacewith : String? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.analytics.testandtarget.api.url" => cq_analytics_testandtarget_api_url, "cq.analytics.testandtarget.timeout" => cq_analytics_testandtarget_timeout, "cq.analytics.testandtarget.sockettimeout" => cq_analytics_testandtarget_sockettimeout, "cq.analytics.testandtarget.recommendations.url.replace" => cq_analytics_testandtarget_recommendations_url_replace, "cq.analytics.testandtarget.recommendations.url.replacewith" => cq_analytics_testandtarget_recommendations_url_replacewith },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
