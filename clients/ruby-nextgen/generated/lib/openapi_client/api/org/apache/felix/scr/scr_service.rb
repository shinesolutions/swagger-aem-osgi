# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixScrScrService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, ds_loglevel: nil, ds_factory_enabled: nil, ds_delayed_keep_instances: nil, ds_lock_timeout_milliseconds: nil, ds_stop_timeout_milliseconds: nil, ds_global_extender: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.scr.ScrService',
          type: OpenapiClient::Models::OrgApacheFelixScrScrServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'ds.loglevel' => ds_loglevel, 'ds.factory.enabled' => ds_factory_enabled, 'ds.delayed.keepInstances' => ds_delayed_keep_instances, 'ds.lock.timeout.milliseconds' => ds_lock_timeout_milliseconds, 'ds.stop.timeout.milliseconds' => ds_stop_timeout_milliseconds, 'ds.global.extender' => ds_global_extender }
        )
      end
    end
  end
end
