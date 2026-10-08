require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, number_of_retries_allowed : Int32? = nil, hc_tags : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "number.of.retries.allowed" => number_of_retries_allowed, "hc.tags" => hc_tags },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
