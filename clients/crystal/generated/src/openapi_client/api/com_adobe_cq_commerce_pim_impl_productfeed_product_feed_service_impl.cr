require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, feed_generator_algorithm : String? = nil) : Response(OpenAPIClient::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "Feed generator algorithm" => feed_generator_algorithm },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
