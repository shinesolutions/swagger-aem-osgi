# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDtmImplServiceDTMWebServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, connection_timeout: nil, socket_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqDtmImplServiceDTMWebServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'connection.timeout' => connection_timeout, 'socket.timeout' => socket_timeout }
        )
      end
    end
  end
end
