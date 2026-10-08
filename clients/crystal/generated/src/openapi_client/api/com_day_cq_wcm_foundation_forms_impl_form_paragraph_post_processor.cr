require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, forms_formparagraphpostprocessor_enabled : Bool? = nil, forms_formparagraphpostprocessor_formresourcetypes : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "forms.formparagraphpostprocessor.enabled" => forms_formparagraphpostprocessor_enabled, "forms.formparagraphpostprocessor.formresourcetypes" => forms_formparagraphpostprocessor_formresourcetypes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
