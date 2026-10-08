require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySuppressor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, ranking : Int32? = nil, enable : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "ranking" => ranking, "enable" => enable },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
