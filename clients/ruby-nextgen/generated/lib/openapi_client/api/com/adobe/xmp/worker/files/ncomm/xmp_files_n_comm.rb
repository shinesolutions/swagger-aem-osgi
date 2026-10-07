# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeXmpWorkerFilesNcommXMPFilesNComm
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_connections: nil, max_requests: nil, request_timeout: nil, log_dir: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm',
          type: OpenapiClient::Models::ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'maxConnections' => max_connections, 'maxRequests' => max_requests, 'requestTimeout' => request_timeout, 'logDir' => log_dir }
        )
      end
    end
  end
end
