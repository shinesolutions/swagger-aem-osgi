# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, auth_token_validator_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl',
          type: OpenapiClient::Models::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'auth.token.validator.type' => auth_token_validator_type }
        )
      end
    end
  end
end
