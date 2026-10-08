# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmMsmImplLiveRelationshipManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, liverelationshipmgr_relationsconfig_default: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl',
          type: OpenapiClient::Models::ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'liverelationshipmgr.relationsconfig.default' => liverelationshipmgr_relationsconfig_default }
        )
      end
    end
  end
end
