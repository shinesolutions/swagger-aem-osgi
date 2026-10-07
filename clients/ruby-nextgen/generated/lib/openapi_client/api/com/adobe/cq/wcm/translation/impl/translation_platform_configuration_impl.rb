# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sync_translation_state_scheduling_format: nil, scheduling_repeat_translation_scheduling_format: nil, sync_translation_state_lock_timeout_in_minutes: nil, export_format: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl',
          type: OpenapiClient::Models::ComAdobeCqWcmTranslationImplTranslationPlatformConfiguHe2196d97,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'syncTranslationState.schedulingFormat' => sync_translation_state_scheduling_format, 'schedulingRepeatTranslation.schedulingFormat' => scheduling_repeat_translation_scheduling_format, 'syncTranslationState.lockTimeoutInMinutes' => sync_translation_state_lock_timeout_in_minutes, 'export.format' => export_format }
        )
      end
    end
  end
end
