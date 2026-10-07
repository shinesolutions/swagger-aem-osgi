require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacheService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, included_paths : Array(String)? = nil, enable_async_observer : Bool? = nil, observer_queue_size : Int32? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "includedPaths" => included_paths, "enableAsyncObserver" => enable_async_observer, "observerQueueSize" => observer_queue_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
