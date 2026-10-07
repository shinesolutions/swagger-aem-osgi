require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStrategy
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, config_property_inheritance_property_names : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "configPropertyInheritancePropertyNames" => config_property_inheritance_property_names },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
