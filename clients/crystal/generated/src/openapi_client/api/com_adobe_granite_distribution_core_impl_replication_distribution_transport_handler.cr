require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransportHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, forward_requests : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "forward.requests" => forward_requests },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
