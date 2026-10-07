require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplAgentManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, job_topics : String? = nil, service_user_target : String? = nil, agent_provider_target : String? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplAgentManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplAgentManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "job.topics" => job_topics, "serviceUser.target" => service_user_target, "agentProvider.target" => agent_provider_target },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
