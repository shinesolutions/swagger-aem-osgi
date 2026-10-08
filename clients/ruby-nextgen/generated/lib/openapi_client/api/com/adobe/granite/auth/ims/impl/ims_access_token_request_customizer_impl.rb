# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, auth_ims_client_secret: nil, customizer_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl',
          type: OpenapiClient::Models::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustoH8dbac48a,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'auth.ims.client.secret' => auth_ims_client_secret, 'customizer.type' => customizer_type }
        )
      end
    end
  end
end
