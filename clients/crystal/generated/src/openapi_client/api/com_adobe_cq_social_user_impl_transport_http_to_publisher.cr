require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUserImplTransportHttpToPublisher
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable : Bool? = nil, agent_configuration : Array(String)? = nil, context_path : String? = nil, disabled_cipher_suites : Array(String)? = nil, enabled_cipher_suites : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUserImplTransportHttpToPublisherInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUserImplTransportHttpToPublisherInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enable" => enable, "agent.configuration" => agent_configuration, "context.path" => context_path, "disabled.cipher.suites" => disabled_cipher_suites, "enabled.cipher.suites" => enabled_cipher_suites },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
