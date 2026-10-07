require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOverrideProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, service_ranking : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "service.ranking" => service_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
