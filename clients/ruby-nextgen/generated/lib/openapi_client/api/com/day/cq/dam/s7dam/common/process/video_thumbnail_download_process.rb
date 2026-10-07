# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, process_label: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess',
          type: OpenapiClient::Models::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadPH685d636a,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'process.label' => process_label }
        )
      end
    end
  end
end
