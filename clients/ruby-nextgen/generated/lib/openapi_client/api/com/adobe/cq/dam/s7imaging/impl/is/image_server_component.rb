# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamS7imagingImplIsImageServerComponent
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, tcp_port: nil, allow_remote_access: nil, max_render_rgn_pixels: nil, max_message_size: nil, random_access_url_timeout: nil, worker_threads: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent',
          type: OpenapiClient::Models::ComAdobeCqDamS7imagingImplIsImageServerComponentInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'TcpPort' => tcp_port, 'AllowRemoteAccess' => allow_remote_access, 'MaxRenderRgnPixels' => max_render_rgn_pixels, 'MaxMessageSize' => max_message_size, 'RandomAccessUrlTimeout' => random_access_url_timeout, 'WorkerThreads' => worker_threads }
        )
      end
    end
  end
end
