require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, disable_smart_sync : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "disableSmartSync" => disable_smart_sync },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
