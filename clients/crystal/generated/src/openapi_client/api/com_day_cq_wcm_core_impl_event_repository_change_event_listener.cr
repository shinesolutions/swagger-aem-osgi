require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplEventRepositoryChangeEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, paths : Array(String)? = nil, excluded_paths : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "paths" => paths, "excludedPaths" => excluded_paths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
