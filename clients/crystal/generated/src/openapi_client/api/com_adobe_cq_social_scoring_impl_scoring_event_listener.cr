require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialScoringImplScoringEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_topics : String? = nil, event_filter : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialScoringImplScoringEventListenerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialScoringImplScoringEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.topics" => event_topics, "event.filter" => event_filter },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
