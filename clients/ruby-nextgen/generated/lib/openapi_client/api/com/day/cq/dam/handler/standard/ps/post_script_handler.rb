# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamHandlerStandardPsPostScriptHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, raster_annotation: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler',
          type: OpenapiClient::Models::ComDayCqDamHandlerStandardPsPostScriptHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'raster.annotation' => raster_annotation }
        )
      end
    end
  end
end
