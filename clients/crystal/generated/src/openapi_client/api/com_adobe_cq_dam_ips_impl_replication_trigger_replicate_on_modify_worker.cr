require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dmreplicateonmodify_enabled : Bool? = nil, dmreplicateonmodify_forcesyncdeletes : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dmreplicateonmodify.enabled" => dmreplicateonmodify_enabled, "dmreplicateonmodify.forcesyncdeletes" => dmreplicateonmodify_forcesyncdeletes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
