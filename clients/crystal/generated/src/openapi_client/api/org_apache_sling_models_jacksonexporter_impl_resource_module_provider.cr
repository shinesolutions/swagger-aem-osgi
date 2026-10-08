require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_recursion_levels : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "max.recursion.levels" => max_recursion_levels },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
