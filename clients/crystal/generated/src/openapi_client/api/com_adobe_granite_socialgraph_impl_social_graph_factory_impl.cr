require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, group2member_relationship_outgoing : String? = nil, group2member_excluded_outgoing : Array(String)? = nil, group2member_relationship_incoming : String? = nil, group2member_excluded_incoming : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "group2member.relationship.outgoing" => group2member_relationship_outgoing, "group2member.excluded.outgoing" => group2member_excluded_outgoing, "group2member.relationship.incoming" => group2member_relationship_incoming, "group2member.excluded.incoming" => group2member_excluded_incoming },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
