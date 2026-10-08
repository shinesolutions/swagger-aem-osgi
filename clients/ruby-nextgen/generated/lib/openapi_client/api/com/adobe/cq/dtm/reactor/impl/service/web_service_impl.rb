# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDtmReactorImplServiceWebServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, endpoint_uri: nil, connection_timeout: nil, socket_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqDtmReactorImplServiceWebServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'endpointUri' => endpoint_uri, 'connectionTimeout' => connection_timeout, 'socketTimeout' => socket_timeout }
        )
      end
    end
  end
end
