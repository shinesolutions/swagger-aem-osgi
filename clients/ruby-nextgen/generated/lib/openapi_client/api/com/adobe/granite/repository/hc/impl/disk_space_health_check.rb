# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, hc_tags: nil, disk_space_warn_threshold: nil, disk_space_error_threshold: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck',
          type: OpenapiClient::Models::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'hc.tags' => hc_tags, 'disk.space.warn.threshold' => disk_space_warn_threshold, 'disk.space.error.threshold' => disk_space_error_threshold }
        )
      end
    end
  end
end
