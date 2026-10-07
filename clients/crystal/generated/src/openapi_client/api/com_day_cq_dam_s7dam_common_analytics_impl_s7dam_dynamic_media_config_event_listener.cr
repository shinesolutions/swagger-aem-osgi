require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo)
      @conn.request(OpenAPIClient::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled" => cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
