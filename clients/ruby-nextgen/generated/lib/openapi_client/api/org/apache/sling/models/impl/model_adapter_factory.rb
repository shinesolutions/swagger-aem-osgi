# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingModelsImplModelAdapterFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, osgi_http_whiteboard_listener: nil, osgi_http_whiteboard_context_select: nil, max_recursion_depth: nil, cleanup_job_period: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory',
          type: OpenapiClient::Models::OrgApacheSlingModelsImplModelAdapterFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'osgi.http.whiteboard.listener' => osgi_http_whiteboard_listener, 'osgi.http.whiteboard.context.select' => osgi_http_whiteboard_context_select, 'max.recursion.depth' => max_recursion_depth, 'cleanup.job.period' => cleanup_job_period }
        )
      end
    end
  end
end
