require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialTranslationImplTranslationServiceConfigManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, translate_language : String? = nil, translate_display : String? = nil, translate_attribution : Bool? = nil, translate_caching : String? = nil, translate_smart_rendering : String? = nil, translate_caching_duration : String? = nil, translate_session_save_interval : String? = nil, translate_session_save_batch_limit : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "translate.language" => translate_language, "translate.display" => translate_display, "translate.attribution" => translate_attribution, "translate.caching" => translate_caching, "translate.smart.rendering" => translate_smart_rendering, "translate.caching.duration" => translate_caching_duration, "translate.session.save.interval" => translate_session_save_interval, "translate.session.save.batchLimit" => translate_session_save_batch_limit },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
