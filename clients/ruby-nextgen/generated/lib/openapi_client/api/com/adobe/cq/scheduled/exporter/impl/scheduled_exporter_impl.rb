# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScheduledExporterImplScheduledExporterImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, include_paths: nil, exporter_user: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl',
          type: OpenapiClient::Models::ComAdobeCqScheduledExporterImplScheduledExporterImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'include.paths' => include_paths, 'exporter.user' => exporter_user }
        )
      end
    end
  end
end
