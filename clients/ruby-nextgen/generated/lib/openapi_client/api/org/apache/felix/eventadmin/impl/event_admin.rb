# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixEventadminImplEventAdmin
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_felix_eventadmin_thread_pool_size: nil, org_apache_felix_eventadmin_async_to_sync_thread_ratio: nil, org_apache_felix_eventadmin_timeout: nil, org_apache_felix_eventadmin_require_topic: nil, org_apache_felix_eventadmin_ignore_timeout: nil, org_apache_felix_eventadmin_ignore_topic: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin',
          type: OpenapiClient::Models::OrgApacheFelixEventadminImplEventAdminInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.felix.eventadmin.ThreadPoolSize' => org_apache_felix_eventadmin_thread_pool_size, 'org.apache.felix.eventadmin.AsyncToSyncThreadRatio' => org_apache_felix_eventadmin_async_to_sync_thread_ratio, 'org.apache.felix.eventadmin.Timeout' => org_apache_felix_eventadmin_timeout, 'org.apache.felix.eventadmin.RequireTopic' => org_apache_felix_eventadmin_require_topic, 'org.apache.felix.eventadmin.IgnoreTimeout' => org_apache_felix_eventadmin_ignore_timeout, 'org.apache.felix.eventadmin.IgnoreTopic' => org_apache_felix_eventadmin_ignore_topic }
        )
      end
    end
  end
end
