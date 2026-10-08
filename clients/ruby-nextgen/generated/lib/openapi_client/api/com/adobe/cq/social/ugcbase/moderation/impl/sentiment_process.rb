# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUgcbaseModerationImplSentimentProcess
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, watchwords_positive: nil, watchwords_negative: nil, watchwords_path: nil, sentiment_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess',
          type: OpenapiClient::Models::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'watchwords.positive' => watchwords_positive, 'watchwords.negative' => watchwords_negative, 'watchwords.path' => watchwords_path, 'sentiment.path' => sentiment_path }
        )
      end
    end
  end
end
