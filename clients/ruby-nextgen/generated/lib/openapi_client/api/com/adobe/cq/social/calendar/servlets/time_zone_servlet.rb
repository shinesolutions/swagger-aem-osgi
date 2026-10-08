# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCalendarServletsTimeZoneServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, timezones_expirytime: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet',
          type: OpenapiClient::Models::ComAdobeCqSocialCalendarServletsTimeZoneServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'timezones.expirytime' => timezones_expirytime }
        )
      end
    end
  end
end
