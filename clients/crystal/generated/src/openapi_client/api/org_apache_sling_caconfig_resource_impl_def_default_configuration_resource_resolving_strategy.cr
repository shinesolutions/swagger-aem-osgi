require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategy
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, config_path : String? = nil, fallback_paths : Array(String)? = nil, config_collection_inheritance_property_names : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "configPath" => config_path, "fallbackPaths" => fallback_paths, "configCollectionInheritancePropertyNames" => config_collection_inheritance_property_names },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
