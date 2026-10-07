require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingServiceusermappingImplServiceUserMapperImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, user_mapping : Array(String)? = nil, user_default : String? = nil, user_enable_default_mapping : Bool? = nil, require_validation : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "user.mapping" => user_mapping, "user.default" => user_default, "user.enable.default.mapping" => user_enable_default_mapping, "require.validation" => require_validation },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
