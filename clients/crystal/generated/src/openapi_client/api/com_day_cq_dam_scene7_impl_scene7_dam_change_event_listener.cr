require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamScene7ImplScene7DamChangeEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_scene7_damchangeeventlistener_enabled : Bool? = nil, cq_dam_scene7_damchangeeventlistener_observed_paths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.scene7.damchangeeventlistener.enabled" => cq_dam_scene7_damchangeeventlistener_enabled, "cq.dam.scene7.damchangeeventlistener.observed.paths" => cq_dam_scene7_damchangeeventlistener_observed_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
