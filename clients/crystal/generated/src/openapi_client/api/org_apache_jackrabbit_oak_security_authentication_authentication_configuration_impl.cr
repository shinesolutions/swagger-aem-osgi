require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_jackrabbit_oak_authentication_app_name : String? = nil, org_apache_jackrabbit_oak_authentication_config_spi_name : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.jackrabbit.oak.authentication.appName" => org_apache_jackrabbit_oak_authentication_app_name, "org.apache.jackrabbit.oak.authentication.configSpiName" => org_apache_jackrabbit_oak_authentication_config_spi_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
