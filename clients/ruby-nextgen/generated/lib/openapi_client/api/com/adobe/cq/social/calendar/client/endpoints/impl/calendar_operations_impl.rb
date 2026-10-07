# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_retry: nil, field_whitelist: nil, attachment_type_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOpH1b79b5c0,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'MaxRetry' => max_retry, 'fieldWhitelist' => field_whitelist, 'attachmentTypeBlacklist' => attachment_type_blacklist }
        )
      end
    end
  end
end
