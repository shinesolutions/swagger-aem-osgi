require "json"

module OpenAPIClient
  module Api
  class ComDayCqSearchImplBuilderQueryBuilderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, excerpt_properties : Array(String)? = nil, cache_max_entries : Int32? = nil, cache_entry_lifetime : Int32? = nil, xpath_union : Bool? = nil) : Response(OpenAPIClient::ComDayCqSearchImplBuilderQueryBuilderImplInfo)
      @conn.request(OpenAPIClient::ComDayCqSearchImplBuilderQueryBuilderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "excerpt.properties" => excerpt_properties, "cache.max.entries" => cache_max_entries, "cache.entry.lifetime" => cache_entry_lifetime, "xpath.union" => xpath_union },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
