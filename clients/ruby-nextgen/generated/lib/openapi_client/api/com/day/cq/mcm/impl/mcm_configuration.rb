# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqMcmImplMCMConfiguration
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, experience_indirection: nil, touchpoint_indirection: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration',
          type: OpenapiClient::Models::ComDayCqMcmImplMCMConfigurationInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'experience.indirection' => experience_indirection, 'touchpoint.indirection' => touchpoint_indirection }
        )
      end
    end
  end
end
