# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEngineImplAuthSlingAuthenticator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, osgi_http_whiteboard_context_select: nil, osgi_http_whiteboard_listener: nil, auth_sudo_cookie: nil, auth_sudo_parameter: nil, auth_annonymous: nil, sling_auth_requirements: nil, sling_auth_anonymous_user: nil, sling_auth_anonymous_password: nil, auth_http: nil, auth_http_realm: nil, auth_uri_suffix: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator',
          type: OpenapiClient::Models::OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'osgi.http.whiteboard.context.select' => osgi_http_whiteboard_context_select, 'osgi.http.whiteboard.listener' => osgi_http_whiteboard_listener, 'auth.sudo.cookie' => auth_sudo_cookie, 'auth.sudo.parameter' => auth_sudo_parameter, 'auth.annonymous' => auth_annonymous, 'sling.auth.requirements' => sling_auth_requirements, 'sling.auth.anonymous.user' => sling_auth_anonymous_user, 'sling.auth.anonymous.password' => sling_auth_anonymous_password, 'auth.http' => auth_http, 'auth.http.realm' => auth_http_realm, 'auth.uri.suffix' => auth_uri_suffix }
        )
      end
    end
  end
end
