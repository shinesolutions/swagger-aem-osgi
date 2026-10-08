require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, reply_email_patterns : Array(String)? = nil, priority_order : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "replyEmailPatterns" => reply_email_patterns, "priorityOrder" => priority_order },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
