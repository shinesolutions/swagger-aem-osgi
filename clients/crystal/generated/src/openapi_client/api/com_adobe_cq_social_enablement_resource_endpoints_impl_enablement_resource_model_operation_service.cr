require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResourceModelOperationService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, field_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fieldWhitelist" => field_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
