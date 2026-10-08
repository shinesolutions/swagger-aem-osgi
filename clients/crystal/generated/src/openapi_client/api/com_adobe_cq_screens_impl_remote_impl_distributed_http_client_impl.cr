require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_aem_screens_impl_remote_request_timeout : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.aem.screens.impl.remote.request_timeout" => com_adobe_aem_screens_impl_remote_request_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
