# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEngineImplLogRequestLoggerService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, request_log_service_format: nil, request_log_service_output: nil, request_log_service_outputtype: nil, request_log_service_onentry: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService',
          type: OpenapiClient::Models::OrgApacheSlingEngineImplLogRequestLoggerServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'request.log.service.format' => request_log_service_format, 'request.log.service.output' => request_log_service_output, 'request.log.service.outputtype' => request_log_service_outputtype, 'request.log.service.onentry' => request_log_service_onentry }
        )
      end
    end
  end
end
