# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationImplHTTPAuthHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, auth_http_nologin: nil, auth_http_realm: nil, auth_default_loginpage: nil, auth_cred_form: nil, auth_cred_utf8: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler',
          type: OpenapiClient::Models::ComDayCqWcmFoundationImplHTTPAuthHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'auth.http.nologin' => auth_http_nologin, 'auth.http.realm' => auth_http_realm, 'auth.default.loginpage' => auth_default_loginpage, 'auth.cred.form' => auth_cred_form, 'auth.cred.utf8' => auth_cred_utf8 }
        )
      end
    end
  end
end
