# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamHandlerStandardPsdPsdHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, large_file_threshold: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler',
          type: OpenapiClient::Models::ComDayCqDamHandlerStandardPsdPsdHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'large_file_threshold' => large_file_threshold }
        )
      end
    end
  end
end
