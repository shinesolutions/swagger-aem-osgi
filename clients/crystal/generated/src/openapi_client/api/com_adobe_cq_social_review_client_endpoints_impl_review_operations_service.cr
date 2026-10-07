require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, field_whitelist : Array(String)? = nil, attachment_type_blacklist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fieldWhitelist" => field_whitelist, "attachmentTypeBlacklist" => attachment_type_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
