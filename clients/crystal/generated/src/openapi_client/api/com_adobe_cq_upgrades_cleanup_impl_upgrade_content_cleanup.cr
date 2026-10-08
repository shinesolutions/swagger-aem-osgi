require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, delete_path_regexps : Array(String)? = nil, delete_sql2_query : String? = nil) : Response(OpenAPIClient::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo)
      @conn.request(OpenAPIClient::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "delete.path.regexps" => delete_path_regexps, "delete.sql2.query" => delete_sql2_query },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
