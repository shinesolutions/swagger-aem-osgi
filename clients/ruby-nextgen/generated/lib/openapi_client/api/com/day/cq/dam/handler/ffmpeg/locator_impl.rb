# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamHandlerFfmpegLocatorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, executable_searchpath: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl',
          type: OpenapiClient::Models::ComDayCqDamHandlerFfmpegLocatorImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'executable.searchpath' => executable_searchpath }
        )
      end
    end
  end
end
