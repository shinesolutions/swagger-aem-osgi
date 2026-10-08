require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSyncImplDiffChangesObserver
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, agent_name : String? = nil, diff_path : String? = nil, property_names : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSyncImplDiffChangesObserverInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSyncImplDiffChangesObserverInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "agentName" => agent_name, "diffPath" => diff_path, "propertyNames" => property_names },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
