require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileOperationService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, field_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fieldWhitelist" => field_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
