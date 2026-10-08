# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmMsmImplRolloutManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_filter: nil, rolloutmgr_excludedprops_default: nil, rolloutmgr_excludedparagraphprops_default: nil, rolloutmgr_excludednodetypes_default: nil, rolloutmgr_threadpool_maxsize: nil, rolloutmgr_threadpool_maxshutdowntime: nil, rolloutmgr_threadpool_priority: nil, rolloutmgr_commit_size: nil, rolloutmgr_conflicthandling_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl',
          type: OpenapiClient::Models::ComDayCqWcmMsmImplRolloutManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.filter' => event_filter, 'rolloutmgr.excludedprops.default' => rolloutmgr_excludedprops_default, 'rolloutmgr.excludedparagraphprops.default' => rolloutmgr_excludedparagraphprops_default, 'rolloutmgr.excludednodetypes.default' => rolloutmgr_excludednodetypes_default, 'rolloutmgr.threadpool.maxsize' => rolloutmgr_threadpool_maxsize, 'rolloutmgr.threadpool.maxshutdowntime' => rolloutmgr_threadpool_maxshutdowntime, 'rolloutmgr.threadpool.priority' => rolloutmgr_threadpool_priority, 'rolloutmgr.commit.size' => rolloutmgr_commit_size, 'rolloutmgr.conflicthandling.enabled' => rolloutmgr_conflicthandling_enabled }
        )
      end
    end
  end
end
