# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_config_id: nil, oauth_client_id: nil, oauth_client_secret: nil, oauth_scope: nil, oauth_config_provider_id: nil, oauth_create_users: nil, oauth_userid_property: nil, force_strict_username_matching: nil, oauth_encode_userids: nil, oauth_hash_userids: nil, oauth_call_back_url: nil, oauth_access_token_persist: nil, oauth_access_token_persist_cookie: nil, oauth_csrf_state_protection: nil, oauth_redirect_request_params: nil, oauth_config_siblings_allow: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.provider',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthProviderInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.config.id' => oauth_config_id, 'oauth.client.id' => oauth_client_id, 'oauth.client.secret' => oauth_client_secret, 'oauth.scope' => oauth_scope, 'oauth.config.provider.id' => oauth_config_provider_id, 'oauth.create.users' => oauth_create_users, 'oauth.userid.property' => oauth_userid_property, 'force.strict.username.matching' => force_strict_username_matching, 'oauth.encode.userids' => oauth_encode_userids, 'oauth.hash.userids' => oauth_hash_userids, 'oauth.callBackUrl' => oauth_call_back_url, 'oauth.access.token.persist' => oauth_access_token_persist, 'oauth.access.token.persist.cookie' => oauth_access_token_persist_cookie, 'oauth.csrf.state.protection' => oauth_csrf_state_protection, 'oauth.redirect.request.params' => oauth_redirect_request_params, 'oauth.config.siblings.allow' => oauth_config_siblings_allow }
        )
      end
    end
  end
end
