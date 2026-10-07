require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, connect_protocol : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "connectProtocol" => connect_protocol },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
