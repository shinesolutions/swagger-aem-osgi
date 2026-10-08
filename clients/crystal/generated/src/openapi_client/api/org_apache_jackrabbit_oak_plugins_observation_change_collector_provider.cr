require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_items : Int32? = nil, max_path_depth : Int32? = nil, enabled : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "maxItems" => max_items, "maxPathDepth" => max_path_depth, "enabled" => enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
