require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplReverseReplicator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_period : Int32? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplReverseReplicatorInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplReverseReplicatorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.period" => scheduler_period },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
