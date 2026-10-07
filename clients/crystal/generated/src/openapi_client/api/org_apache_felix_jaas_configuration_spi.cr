require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixJaasConfigurationSpi
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jaas_default_realm_name : String? = nil, jaas_config_provider_name : String? = nil, jaas_global_config_policy : String? = nil) : Response(OpenAPIClient::OrgApacheFelixJaasConfigurationSpiInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixJaasConfigurationSpiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jaas.defaultRealmName" => jaas_default_realm_name, "jaas.configProviderName" => jaas_config_provider_name, "jaas.globalConfigPolicy" => jaas_global_config_policy },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
