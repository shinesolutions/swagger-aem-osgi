require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, replicate_comment_resource_types : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "replicate.comment.resourceTypes" => replicate_comment_resource_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
