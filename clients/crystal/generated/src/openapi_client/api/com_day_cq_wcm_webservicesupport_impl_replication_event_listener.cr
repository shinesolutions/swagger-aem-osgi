require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmWebservicesupportImplReplicationEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, flush_agents : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "Flush agents" => flush_agents },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
