require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, user_mapping : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "user.mapping" => user_mapping },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
