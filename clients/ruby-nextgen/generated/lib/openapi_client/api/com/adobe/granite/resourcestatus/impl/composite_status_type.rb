# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteResourcestatusImplCompositeStatusType
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, name: nil, types: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType',
          type: OpenapiClient::Models::ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'name' => name, 'types' => types }
        )
      end
    end
  end
end
