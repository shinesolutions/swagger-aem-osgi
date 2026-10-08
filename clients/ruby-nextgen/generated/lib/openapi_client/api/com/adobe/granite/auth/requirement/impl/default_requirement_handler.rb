# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, supported_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler',
          type: OpenapiClient::Models::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'supportedPaths' => supported_paths }
        )
      end
    end
  end
end
