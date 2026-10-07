require "json"

module OpenAPIClient
  module Api
  class ComDayCqContentsyncImplContentSyncManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, contentsync_fallback_authorizable : String? = nil, contentsync_fallback_updateuser : String? = nil) : Response(OpenAPIClient::ComDayCqContentsyncImplContentSyncManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqContentsyncImplContentSyncManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "contentsync.fallback.authorizable" => contentsync_fallback_authorizable, "contentsync.fallback.updateuser" => contentsync_fallback_updateuser },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
