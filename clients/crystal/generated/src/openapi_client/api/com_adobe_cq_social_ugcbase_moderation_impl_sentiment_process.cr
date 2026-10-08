require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUgcbaseModerationImplSentimentProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, watchwords_positive : Array(String)? = nil, watchwords_negative : Array(String)? = nil, watchwords_path : String? = nil, sentiment_path : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "watchwords.positive" => watchwords_positive, "watchwords.negative" => watchwords_negative, "watchwords.path" => watchwords_path, "sentiment.path" => sentiment_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
