require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, description : String? = nil, overrides : Array(String)? = nil, enabled : Bool? = nil, service_ranking : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "description" => description, "overrides" => overrides, "enabled" => enabled, "service.ranking" => service_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
