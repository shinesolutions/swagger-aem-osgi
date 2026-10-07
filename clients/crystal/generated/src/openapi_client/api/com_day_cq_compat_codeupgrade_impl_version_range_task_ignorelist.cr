require "json"

module OpenAPIClient
  module Api
  class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, effective_bundle_list_path : String? = nil) : Response(OpenAPIClient::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo)
      @conn.request(OpenAPIClient::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "effectiveBundleListPath" => effective_bundle_list_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
