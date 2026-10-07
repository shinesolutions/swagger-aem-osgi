# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqContentsyncImplContentSyncManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, contentsync_fallback_authorizable: nil, contentsync_fallback_updateuser: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl',
          type: OpenapiClient::Models::ComDayCqContentsyncImplContentSyncManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'contentsync.fallback.authorizable' => contentsync_fallback_authorizable, 'contentsync.fallback.updateuser' => contentsync_fallback_updateuser }
        )
      end
    end
  end
end
