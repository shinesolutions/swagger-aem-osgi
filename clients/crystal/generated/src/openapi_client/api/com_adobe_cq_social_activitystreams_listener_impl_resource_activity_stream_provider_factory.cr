require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreamProviderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, stream_path : String? = nil, stream_name : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "streamPath" => stream_path, "streamName" => stream_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
