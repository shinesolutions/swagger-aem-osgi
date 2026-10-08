# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, filepattern: nil, device_groups: nil, build_page_nodes: nil, build_client_libs: nil, build_canvas_component: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl',
          type: OpenapiClient::Models::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'filepattern' => filepattern, 'device.groups' => device_groups, 'build.page.nodes' => build_page_nodes, 'build.client.libs' => build_client_libs, 'build.canvas.component' => build_canvas_component }
        )
      end
    end
  end
end
