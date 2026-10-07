# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, forms_manager_config_include_ootb_templates: nil, forms_manager_config_include_deprecated_templates: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration',
          type: OpenapiClient::Models::ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguH7c9f8c8c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'formsManagerConfig.includeOOTBTemplates' => forms_manager_config_include_ootb_templates, 'formsManagerConfig.includeDeprecatedTemplates' => forms_manager_config_include_deprecated_templates }
        )
      end
    end
  end
end
