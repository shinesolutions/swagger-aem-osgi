# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path: nil, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateSHad19f75f,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath' => com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path, 'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency' => com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency }
        )
      end
    end
  end
end
