require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSyncImplPublisherSyncServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, active_run_modes : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "activeRunModes" => active_run_modes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
