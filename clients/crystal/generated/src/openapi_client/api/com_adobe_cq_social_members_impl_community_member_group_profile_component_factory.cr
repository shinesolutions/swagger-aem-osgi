require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, everyone_limit : Int32? = nil, priority : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "everyoneLimit" => everyone_limit, "priority" => priority },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
