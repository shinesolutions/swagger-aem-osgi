# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_provider_id: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator',
          type: OpenapiClient::Models::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.provider.id' => oauth_provider_id }
        )
      end
    end
  end
end
