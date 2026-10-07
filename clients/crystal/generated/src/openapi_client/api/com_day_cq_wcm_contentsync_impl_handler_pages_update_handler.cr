require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_pagesupdatehandler_imageresourcetypes : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.pagesupdatehandler.imageresourcetypes" => cq_pagesupdatehandler_imageresourcetypes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
