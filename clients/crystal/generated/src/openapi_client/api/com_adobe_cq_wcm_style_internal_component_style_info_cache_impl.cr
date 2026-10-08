require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, size : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "size" => size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
