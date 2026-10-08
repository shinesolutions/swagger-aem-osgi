# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqTaggingImplJcrTagManagerFactoryImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, validation_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl',
          type: OpenapiClient::Models::ComDayCqTaggingImplJcrTagManagerFactoryImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'validation.enabled' => validation_enabled }
        )
      end
    end
  end
end
