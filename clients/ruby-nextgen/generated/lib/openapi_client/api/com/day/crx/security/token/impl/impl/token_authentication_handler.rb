# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, token_required_attr: nil, token_alternate_url: nil, token_encapsulated: nil, skip_token_refresh: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler',
          type: OpenapiClient::Models::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'token.required.attr' => token_required_attr, 'token.alternate.url' => token_alternate_url, 'token.encapsulated' => token_encapsulated, 'skip.token.refresh' => skip_token_refresh }
        )
      end
    end
  end
end
