# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteActivitystreamsImplActivityManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, aggregate_relationships: nil, aggregate_descend_virtual: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl',
          type: OpenapiClient::Models::ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'aggregate.relationships' => aggregate_relationships, 'aggregate.descend.virtual' => aggregate_descend_virtual }
        )
      end
    end
  end
end
