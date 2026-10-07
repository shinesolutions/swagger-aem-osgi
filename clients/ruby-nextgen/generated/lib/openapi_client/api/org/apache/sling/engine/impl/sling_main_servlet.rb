# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingEngineImplSlingMainServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_max_calls: nil, sling_max_inclusions: nil, sling_trace_allow: nil, sling_max_record_requests: nil, sling_store_pattern_requests: nil, sling_serverinfo: nil, sling_additional_response_headers: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet',
          type: OpenapiClient::Models::OrgApacheSlingEngineImplSlingMainServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.max.calls' => sling_max_calls, 'sling.max.inclusions' => sling_max_inclusions, 'sling.trace.allow' => sling_trace_allow, 'sling.max.record.requests' => sling_max_record_requests, 'sling.store.pattern.requests' => sling_store_pattern_requests, 'sling.serverinfo' => sling_serverinfo, 'sling.additional.response.headers' => sling_additional_response_headers }
        )
      end
    end
  end
end
