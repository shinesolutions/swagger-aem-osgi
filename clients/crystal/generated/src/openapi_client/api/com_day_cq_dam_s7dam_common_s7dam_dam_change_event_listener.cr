require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamS7damCommonS7damDamChangeEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_s7dam_damchangeeventlistener_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.s7dam.damchangeeventlistener.enabled" => cq_dam_s7dam_damchangeeventlistener_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
