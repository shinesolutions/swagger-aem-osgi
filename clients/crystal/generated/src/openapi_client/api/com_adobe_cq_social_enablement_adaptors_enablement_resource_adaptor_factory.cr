require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, is_member_check : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "isMemberCheck" => is_member_check },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
