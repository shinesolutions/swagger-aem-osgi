# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqSearchpromoteImplSearchPromoteServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_searchpromote_configuration_server_uri: nil, cq_searchpromote_configuration_environment: nil, connection_timeout: nil, socket_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl',
          type: OpenapiClient::Models::ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.searchpromote.configuration.server.uri' => cq_searchpromote_configuration_server_uri, 'cq.searchpromote.configuration.environment' => cq_searchpromote_configuration_environment, 'connection.timeout' => connection_timeout, 'socket.timeout' => socket_timeout }
        )
      end
    end
  end
end
