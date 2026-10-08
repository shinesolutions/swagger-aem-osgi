require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_topics : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.topics" => event_topics },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
