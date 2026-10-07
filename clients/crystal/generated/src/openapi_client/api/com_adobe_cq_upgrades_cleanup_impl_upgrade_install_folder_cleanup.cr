require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, delete_name_regexps : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo)
      @conn.request(OpenAPIClient::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "delete.name.regexps" => delete_name_regexps },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
