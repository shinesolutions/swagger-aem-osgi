# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, commits_tracker_writer_groups: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorSH3a3e178d,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'commitsTrackerWriterGroups' => commits_tracker_writer_groups }
        )
      end
    end
  end
end
