require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEventTransformer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, importer_name : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "importer.name" => importer_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
