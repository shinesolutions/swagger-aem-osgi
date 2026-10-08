# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, pattern_time: nil, pattern_newline: nil, pattern_day_of_month: nil, pattern_month: nil, pattern_year: nil, pattern_date: nil, pattern_date_time: nil, pattern_email: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPH2ca2e35c,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'pattern.time' => pattern_time, 'pattern.newline' => pattern_newline, 'pattern.dayOfMonth' => pattern_day_of_month, 'pattern.month' => pattern_month, 'pattern.year' => pattern_year, 'pattern.date' => pattern_date, 'pattern.dateTime' => pattern_date_time, 'pattern.email' => pattern_email }
        )
      end
    end
  end
end
