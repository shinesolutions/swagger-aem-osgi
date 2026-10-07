# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOptoutImplOptOutServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, optout_cookies: nil, optout_headers: nil, optout_whitelist_cookies: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl',
          type: OpenapiClient::Models::ComAdobeGraniteOptoutImplOptOutServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'optout.cookies' => optout_cookies, 'optout.headers' => optout_headers, 'optout.whitelist.cookies' => optout_whitelist_cookies }
        )
      end
    end
  end
end
