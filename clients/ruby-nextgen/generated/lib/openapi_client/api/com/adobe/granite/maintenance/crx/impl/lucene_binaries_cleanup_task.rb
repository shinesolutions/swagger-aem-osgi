# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, job_topics: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask',
          type: OpenapiClient::Models::ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'job.topics' => job_topics }
        )
      end
    end
  end
end
