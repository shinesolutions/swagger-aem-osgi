# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqExtwidgetServletsImageSpriteServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_width: nil, max_height: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet',
          type: OpenapiClient::Models::ComDayCqExtwidgetServletsImageSpriteServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'maxWidth' => max_width, 'maxHeight' => max_height }
        )
      end
    end
  end
end
