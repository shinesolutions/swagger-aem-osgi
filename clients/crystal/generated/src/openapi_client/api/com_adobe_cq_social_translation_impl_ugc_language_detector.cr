require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialTranslationImplUGCLanguageDetector
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_topics : String? = nil, event_filter : String? = nil, translate_listener_type : Array(String)? = nil, translate_property_list : Array(String)? = nil, pool_size : Int32? = nil, max_pool_size : Int32? = nil, queue_size : Int32? = nil, keep_alive_time : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.topics" => event_topics, "event.filter" => event_filter, "translate.listener.type" => translate_listener_type, "translate.property.list" => translate_property_list, "poolSize" => pool_size, "maxPoolSize" => max_pool_size, "queueSize" => queue_size, "keepAliveTime" => keep_alive_time },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
