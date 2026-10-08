# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthIms
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, configid: nil, scope: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.ims',
          type: OpenapiClient::Models::ComAdobeGraniteAuthImsInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'configid' => configid, 'scope' => scope }
        )
      end
    end
  end
end
