require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialForumDispatcherImplFlushOperations
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, extension_order : Int32? = nil, flush_forumontopic : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "extension.order" => extension_order, "flush.forumontopic" => flush_forumontopic },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
