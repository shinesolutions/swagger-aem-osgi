require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, priority_order : Int32? = nil, reply_email_patterns : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "priorityOrder" => priority_order, "replyEmailPatterns" => reply_email_patterns },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
