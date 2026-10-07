require "json"

module OpenAPIClient
  module Api
  class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled" => cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
