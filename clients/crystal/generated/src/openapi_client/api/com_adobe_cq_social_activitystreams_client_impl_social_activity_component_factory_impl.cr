require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponentFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, priority : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "priority" => priority },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
