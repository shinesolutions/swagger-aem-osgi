require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable_fallback : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enableFallback" => enable_fallback },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
