require "json"

module OpenAPIClient
  module Api
  class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecker
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, codeupgradetasks : Array(String)? = nil, codeupgradetaskfilters : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo)
      @conn.request(OpenAPIClient::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "codeupgradetasks" => codeupgradetasks, "codeupgradetaskfilters" => codeupgradetaskfilters },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
