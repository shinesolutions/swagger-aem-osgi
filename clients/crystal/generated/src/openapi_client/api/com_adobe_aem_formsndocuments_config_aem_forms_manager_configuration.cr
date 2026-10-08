require "json"

module OpenAPIClient
  module Api
  class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, forms_manager_config_include_ootb_templates : Bool? = nil, forms_manager_config_include_deprecated_templates : Bool? = nil) : Response(OpenAPIClient::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo)
      @conn.request(OpenAPIClient::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "formsManagerConfig.includeOOTBTemplates" => forms_manager_config_include_ootb_templates, "formsManagerConfig.includeDeprecatedTemplates" => forms_manager_config_include_deprecated_templates },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
