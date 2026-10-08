# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, forms_formparagraphpostprocessor_enabled: nil, forms_formparagraphpostprocessor_formresourcetypes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor',
          type: OpenapiClient::Models::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'forms.formparagraphpostprocessor.enabled' => forms_formparagraphpostprocessor_enabled, 'forms.formparagraphpostprocessor.formresourcetypes' => forms_formparagraphpostprocessor_formresourcetypes }
        )
      end
    end
  end
end
