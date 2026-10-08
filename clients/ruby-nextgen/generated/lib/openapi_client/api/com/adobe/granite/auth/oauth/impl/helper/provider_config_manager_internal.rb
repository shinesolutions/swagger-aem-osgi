# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_cookie_login_timeout: nil, oauth_cookie_max_age: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagH4edeee37,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.cookie.login.timeout' => oauth_cookie_login_timeout, 'oauth.cookie.max.age' => oauth_cookie_max_age }
        )
      end
    end
  end
end
