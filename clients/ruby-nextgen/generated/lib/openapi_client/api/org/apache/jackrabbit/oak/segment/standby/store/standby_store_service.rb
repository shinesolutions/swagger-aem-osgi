# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_sling_installer_configuration_persist: nil, mode: nil, port: nil, primary_host: nil, interval: nil, primary_allowed_client_ip_ranges: nil, secure: nil, standby_readtimeout: nil, standby_autoclean: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreSH319a97e9,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.sling.installer.configuration.persist' => org_apache_sling_installer_configuration_persist, 'mode' => mode, 'port' => port, 'primary.host' => primary_host, 'interval' => interval, 'primary.allowed-client-ip-ranges' => primary_allowed_client_ip_ranges, 'secure' => secure, 'standby.readtimeout' => standby_readtimeout, 'standby.autoclean' => standby_autoclean }
        )
      end
    end
  end
end
