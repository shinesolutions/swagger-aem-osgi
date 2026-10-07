# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqMailerImplEmailCqEmailTemplateFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, mailer_email_charset: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory',
          type: OpenapiClient::Models::ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'mailer.email.charset' => mailer_email_charset }
        )
      end
    end
  end
end
