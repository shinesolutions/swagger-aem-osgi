require "json"

module OpenAPIClient
  module Api
  class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, root_path : String? = nil, fix_inconsistencies : Bool? = nil) : Response(OpenAPIClient::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo)
      @conn.request(OpenAPIClient::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "root.path" => root_path, "fix.inconsistencies" => fix_inconsistencies },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
