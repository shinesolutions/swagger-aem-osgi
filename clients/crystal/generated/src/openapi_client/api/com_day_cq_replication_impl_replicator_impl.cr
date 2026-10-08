require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplReplicatorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, distribute_events : Bool? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplReplicatorImplInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplReplicatorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "distribute_events" => distribute_events },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
