# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEngineParameters
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_default_parameter_encoding: nil, sling_default_max_parameters: nil, file_location: nil, file_threshold: nil, file_max: nil, request_max: nil, sling_default_parameter_check_for_additional_container_parameters: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.engine.parameters',
          type: OpenapiClient::Models::OrgApacheSlingEngineParametersInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.default.parameter.encoding' => sling_default_parameter_encoding, 'sling.default.max.parameters' => sling_default_max_parameters, 'file.location' => file_location, 'file.threshold' => file_threshold, 'file.max' => file_max, 'request.max' => request_max, 'sling.default.parameter.checkForAdditionalContainerParameters' => sling_default_parameter_check_for_additional_container_parameters }
        )
      end
    end
  end
end
