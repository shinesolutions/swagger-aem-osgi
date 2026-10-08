require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtension
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, accepted : Bool? = nil, ranked : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "accepted" => accepted, "ranked" => ranked },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
