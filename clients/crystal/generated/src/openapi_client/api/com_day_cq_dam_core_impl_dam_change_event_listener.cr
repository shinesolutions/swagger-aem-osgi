require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplDamChangeEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, changeeventlistener_observed_paths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplDamChangeEventListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplDamChangeEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "changeeventlistener.observed.paths" => changeeventlistener_observed_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
