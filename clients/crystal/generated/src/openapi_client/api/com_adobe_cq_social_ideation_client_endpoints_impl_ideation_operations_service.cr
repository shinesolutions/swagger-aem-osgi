require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, field_whitelist : Array(String)? = nil, attachment_type_blacklist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fieldWhitelist" => field_whitelist, "attachmentTypeBlacklist" => attachment_type_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
