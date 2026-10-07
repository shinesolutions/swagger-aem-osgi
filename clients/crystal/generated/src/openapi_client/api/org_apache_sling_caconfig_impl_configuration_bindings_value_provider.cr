require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
