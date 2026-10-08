require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensImplHandlerChannelsUpdateHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_pagesupdatehandler_imageresourcetypes : Array(String)? = nil, cq_pagesupdatehandler_productresourcetypes : Array(String)? = nil, cq_pagesupdatehandler_videoresourcetypes : Array(String)? = nil, cq_pagesupdatehandler_dynamicsequenceresourcetypes : Array(String)? = nil, cq_pagesupdatehandler_previewmodepaths : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.pagesupdatehandler.imageresourcetypes" => cq_pagesupdatehandler_imageresourcetypes, "cq.pagesupdatehandler.productresourcetypes" => cq_pagesupdatehandler_productresourcetypes, "cq.pagesupdatehandler.videoresourcetypes" => cq_pagesupdatehandler_videoresourcetypes, "cq.pagesupdatehandler.dynamicsequenceresourcetypes" => cq_pagesupdatehandler_dynamicsequenceresourcetypes, "cq.pagesupdatehandler.previewmodepaths" => cq_pagesupdatehandler_previewmodepaths },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
