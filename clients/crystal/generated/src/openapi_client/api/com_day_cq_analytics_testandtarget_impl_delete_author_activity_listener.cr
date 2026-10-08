require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_analytics_testandtarget_deleteauthoractivitylistener_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.analytics.testandtarget.deleteauthoractivitylistener.enabled" => cq_analytics_testandtarget_deleteauthoractivitylistener_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
