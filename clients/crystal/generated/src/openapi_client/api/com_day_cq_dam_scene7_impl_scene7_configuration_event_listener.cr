require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamScene7ImplScene7ConfigurationEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_scene7_configurationeventlistener_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.scene7.configurationeventlistener.enabled" => cq_dam_scene7_configurationeventlistener_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
