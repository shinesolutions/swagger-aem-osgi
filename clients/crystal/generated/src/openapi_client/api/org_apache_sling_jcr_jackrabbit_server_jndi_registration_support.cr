require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, java_naming_factory_initial : String? = nil, java_naming_provider_url : String? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "java.naming.factory.initial" => java_naming_factory_initial, "java.naming.provider.url" => java_naming_provider_url },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
