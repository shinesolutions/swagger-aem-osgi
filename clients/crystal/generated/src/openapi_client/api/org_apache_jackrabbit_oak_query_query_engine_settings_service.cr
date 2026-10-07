require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakQueryQueryEngineSettingsService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, query_limit_in_memory : Int32? = nil, query_limit_reads : Int32? = nil, query_fail_traversal : Bool? = nil, fast_query_size : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "queryLimitInMemory" => query_limit_in_memory, "queryLimitReads" => query_limit_reads, "queryFailTraversal" => query_fail_traversal, "fastQuerySize" => fast_query_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
