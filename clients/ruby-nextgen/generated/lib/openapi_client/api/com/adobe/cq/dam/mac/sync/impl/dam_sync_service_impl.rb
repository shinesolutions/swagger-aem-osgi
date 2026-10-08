# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamMacSyncImplDAMSyncServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths: nil, com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions: nil, com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms: nil, com_adobe_cq_dam_mac_sync_damsyncservice_platform: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths' => com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths, 'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions' => com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions, 'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms' => com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms, 'com.adobe.cq.dam.mac.sync.damsyncservice.platform' => com_adobe_cq_dam_mac_sync_damsyncservice_platform }
        )
      end
    end
  end
end
