require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOperationService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, field_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fieldWhitelist" => field_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
