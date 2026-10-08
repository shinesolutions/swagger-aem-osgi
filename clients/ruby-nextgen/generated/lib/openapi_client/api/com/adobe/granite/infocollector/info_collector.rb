# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteInfocollectorInfoCollector
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, granite_infocollector_include_thread_dumps: nil, granite_infocollector_include_heap_dump: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector',
          type: OpenapiClient::Models::ComAdobeGraniteInfocollectorInfoCollectorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'granite.infocollector.includeThreadDumps' => granite_infocollector_include_thread_dumps, 'granite.infocollector.includeHeapDump' => granite_infocollector_include_heap_dump }
        )
      end
    end
  end
end
