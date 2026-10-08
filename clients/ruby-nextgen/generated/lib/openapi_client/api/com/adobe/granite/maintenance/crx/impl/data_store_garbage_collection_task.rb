# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, granite_maintenance_mandatory: nil, job_topics: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask',
          type: OpenapiClient::Models::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollH7a322a68,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'granite.maintenance.mandatory' => granite_maintenance_mandatory, 'job.topics' => job_topics }
        )
      end
    end
  end
end
