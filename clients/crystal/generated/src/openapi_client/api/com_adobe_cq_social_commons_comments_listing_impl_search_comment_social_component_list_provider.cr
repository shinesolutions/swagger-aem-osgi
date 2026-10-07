require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialComponentListProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, num_user_limit : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "numUserLimit" => num_user_limit },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
