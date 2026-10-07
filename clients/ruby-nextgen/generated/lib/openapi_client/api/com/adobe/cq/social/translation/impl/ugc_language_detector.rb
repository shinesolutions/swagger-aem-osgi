# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialTranslationImplUGCLanguageDetector
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_topics: nil, event_filter: nil, translate_listener_type: nil, translate_property_list: nil, pool_size: nil, max_pool_size: nil, queue_size: nil, keep_alive_time: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector',
          type: OpenapiClient::Models::ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.topics' => event_topics, 'event.filter' => event_filter, 'translate.listener.type' => translate_listener_type, 'translate.property.list' => translate_property_list, 'poolSize' => pool_size, 'maxPoolSize' => max_pool_size, 'queueSize' => queue_size, 'keepAliveTime' => keep_alive_time }
        )
      end
    end
  end
end
