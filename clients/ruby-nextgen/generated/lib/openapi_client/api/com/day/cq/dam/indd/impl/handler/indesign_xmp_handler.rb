# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamInddImplHandlerIndesignXMPHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, process_label: nil, extract_pages: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler',
          type: OpenapiClient::Models::ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'process.label' => process_label, 'extract.pages' => extract_pages }
        )
      end
    end
  end
end
