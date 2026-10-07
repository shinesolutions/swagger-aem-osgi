# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, extensions: nil, min_duration_ms: nil, max_duration_ms: nil, compact_log_format: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter',
          type: OpenapiClient::Models::OrgApacheSlingEngineImplDebugRequestProgressTrackerLoH6c344b9f,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'extensions' => extensions, 'minDurationMs' => min_duration_ms, 'maxDurationMs' => max_duration_ms, 'compactLogFormat' => compact_log_format }
        )
      end
    end
  end
end
