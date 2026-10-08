# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEngineImplLogRequestLogger
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, request_log_output: nil, request_log_outputtype: nil, request_log_enabled: nil, access_log_output: nil, access_log_outputtype: nil, access_log_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger',
          type: OpenapiClient::Models::OrgApacheSlingEngineImplLogRequestLoggerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'request.log.output' => request_log_output, 'request.log.outputtype' => request_log_outputtype, 'request.log.enabled' => request_log_enabled, 'access.log.output' => access_log_output, 'access.log.outputtype' => access_log_outputtype, 'access.log.enabled' => access_log_enabled }
        )
      end
    end
  end
end
