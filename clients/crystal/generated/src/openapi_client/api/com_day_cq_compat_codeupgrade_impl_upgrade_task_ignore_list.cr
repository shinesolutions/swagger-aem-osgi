require "json"

module OpenAPIClient
  module Api
  class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, upgrade_task_ignore_list : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo)
      @conn.request(OpenAPIClient::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "upgradeTaskIgnoreList" => upgrade_task_ignore_list },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
