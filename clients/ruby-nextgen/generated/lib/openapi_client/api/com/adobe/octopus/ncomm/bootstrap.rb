# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeOctopusNcommBootstrap
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_connections: nil, max_requests: nil, request_timeout: nil, request_retries: nil, launch_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap',
          type: OpenapiClient::Models::ComAdobeOctopusNcommBootstrapInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'maxConnections' => max_connections, 'maxRequests' => max_requests, 'requestTimeout' => request_timeout, 'requestRetries' => request_retries, 'launchTimeout' => launch_timeout }
        )
      end
    end
  end
end
