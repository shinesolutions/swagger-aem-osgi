require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationImplPageImpressionsTracker
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_auth_requirements : String? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationImplPageImpressionsTrackerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationImplPageImpressionsTrackerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.auth.requirements" => sling_auth_requirements },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
