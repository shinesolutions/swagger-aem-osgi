# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialTranslationImplTranslationServiceConfigManager
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, translate_language: nil, translate_display: nil, translate_attribution: nil, translate_caching: nil, translate_smart_rendering: nil, translate_caching_duration: nil, translate_session_save_interval: nil, translate_session_save_batch_limit: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager',
          type: OpenapiClient::Models::ComAdobeCqSocialTranslationImplTranslationServiceConfiHb72ddf52,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'translate.language' => translate_language, 'translate.display' => translate_display, 'translate.attribution' => translate_attribution, 'translate.caching' => translate_caching, 'translate.smart.rendering' => translate_smart_rendering, 'translate.caching.duration' => translate_caching_duration, 'translate.session.save.interval' => translate_session_save_interval, 'translate.session.save.batchLimit' => translate_session_save_batch_limit }
        )
      end
    end
  end
end
