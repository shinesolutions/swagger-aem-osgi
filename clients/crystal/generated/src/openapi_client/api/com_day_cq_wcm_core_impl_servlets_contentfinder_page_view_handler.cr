require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplServletsContentfinderPageViewHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, guess_total : String? = nil, tag_title_search : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "guessTotal" => guess_total, "tagTitleSearch" => tag_title_search },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
