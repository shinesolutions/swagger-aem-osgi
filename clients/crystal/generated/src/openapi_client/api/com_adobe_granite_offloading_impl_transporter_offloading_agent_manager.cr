require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, offloading_agentmanager_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "offloading.agentmanager.enabled" => offloading_agentmanager_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
