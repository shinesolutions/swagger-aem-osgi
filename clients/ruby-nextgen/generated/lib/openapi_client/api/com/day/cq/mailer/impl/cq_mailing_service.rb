# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqMailerImplCqMailingService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_recipient_count: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService',
          type: OpenapiClient::Models::ComDayCqMailerImplCqMailingServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'max.recipient.count' => max_recipient_count }
        )
      end
    end
  end
end
