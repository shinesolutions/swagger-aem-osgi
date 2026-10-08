# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteLoggingImplLogAnalyserImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, messages_queue_size: nil, logger_config: nil, messages_size: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl',
          type: OpenapiClient::Models::ComAdobeGraniteLoggingImplLogAnalyserImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'messages.queue.size' => messages_queue_size, 'logger.config' => logger_config, 'messages.size' => messages_size }
        )
      end
    end
  end
end
