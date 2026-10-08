# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_dam_mac_sync_client_so_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl',
          type: OpenapiClient::Models::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.dam.mac.sync.client.so.timeout' => com_adobe_dam_mac_sync_client_so_timeout }
        )
      end
    end
  end
end
