require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, automoderation_sequence : Array(String)? = nil, automoderation_onfailurestop : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "automoderation.sequence" => automoderation_sequence, "automoderation.onfailurestop" => automoderation_onfailurestop },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
