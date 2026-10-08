# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqHistoryImplHistoryRequestFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, history_request_filter_excluded_selectors: nil, history_request_filter_excluded_extensions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter',
          type: OpenapiClient::Models::ComAdobeCqHistoryImplHistoryRequestFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'history.requestFilter.excludedSelectors' => history_request_filter_excluded_selectors, 'history.requestFilter.excludedExtensions' => history_request_filter_excluded_extensions }
        )
      end
    end
  end
end
