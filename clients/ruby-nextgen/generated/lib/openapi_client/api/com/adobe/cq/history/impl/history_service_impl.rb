# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqHistoryImplHistoryServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, history_service_resource_types: nil, history_service_path_filter: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqHistoryImplHistoryServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'history.service.resourceTypes' => history_service_resource_types, 'history.service.pathFilter' => history_service_path_filter }
        )
      end
    end
  end
end
