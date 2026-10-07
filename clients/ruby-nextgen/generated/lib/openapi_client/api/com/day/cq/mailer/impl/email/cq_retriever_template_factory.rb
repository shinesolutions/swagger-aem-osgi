# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqMailerImplEmailCqRetrieverTemplateFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, mailer_email_embed: nil, mailer_email_charset: nil, mailer_email_retriever_user_id: nil, mailer_email_retriever_user_pwd: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory',
          type: OpenapiClient::Models::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'mailer.email.embed' => mailer_email_embed, 'mailer.email.charset' => mailer_email_charset, 'mailer.email.retrieverUserID' => mailer_email_retriever_user_id, 'mailer.email.retrieverUserPWD' => mailer_email_retriever_user_pwd }
        )
      end
    end
  end
end
