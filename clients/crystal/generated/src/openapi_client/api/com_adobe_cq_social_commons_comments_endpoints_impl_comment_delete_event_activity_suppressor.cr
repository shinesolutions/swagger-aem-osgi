require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventActivitySuppressor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, ranking : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "ranking" => ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
