require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sync_translation_state_scheduling_format : String? = nil, scheduling_repeat_translation_scheduling_format : String? = nil, sync_translation_state_lock_timeout_in_minutes : String? = nil, export_format : String? = nil) : Response(OpenAPIClient::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "syncTranslationState.schedulingFormat" => sync_translation_state_scheduling_format, "schedulingRepeatTranslation.schedulingFormat" => scheduling_repeat_translation_scheduling_format, "syncTranslationState.lockTimeoutInMinutes" => sync_translation_state_lock_timeout_in_minutes, "export.format" => export_format },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
