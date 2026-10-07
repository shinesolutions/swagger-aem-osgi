require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMsmImplLiveRelationshipManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, liverelationshipmgr_relationsconfig_default : String? = nil) : Response(OpenAPIClient::ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "liverelationshipmgr.relationsconfig.default" => liverelationshipmgr_relationsconfig_default },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
