require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreset
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, persistent_cache_includes : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "persistentCacheIncludes" => persistent_cache_includes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
