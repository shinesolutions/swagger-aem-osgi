require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCaconfigImplConfigurationResolverImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, config_bucket_names : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingCaconfigImplConfigurationResolverImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCaconfigImplConfigurationResolverImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "configBucketNames" => config_bucket_names },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
