require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingFeatureflagsFeature
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, description : String? = nil, enabled : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingFeatureflagsFeatureInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingFeatureflagsFeatureInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.featureflags.Feature",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "description" => description, "enabled" => enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
