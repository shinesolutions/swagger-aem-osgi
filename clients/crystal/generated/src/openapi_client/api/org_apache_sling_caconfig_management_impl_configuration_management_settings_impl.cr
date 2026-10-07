require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, ignore_property_name_regex : Array(String)? = nil, config_collection_properties_resource_names : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "ignorePropertyNameRegex" => ignore_property_name_regex, "configCollectionPropertiesResourceNames" => config_collection_properties_resource_names },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
