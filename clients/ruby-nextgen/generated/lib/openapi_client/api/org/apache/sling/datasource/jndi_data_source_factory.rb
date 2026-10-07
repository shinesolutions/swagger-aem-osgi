# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDatasourceJNDIDataSourceFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, datasource_name: nil, datasource_svc_prop_name: nil, datasource_jndi_name: nil, jndi_properties: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory',
          type: OpenapiClient::Models::OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'datasource.name' => datasource_name, 'datasource.svc.prop.name' => datasource_svc_prop_name, 'datasource.jndi.name' => datasource_jndi_name, 'jndi.properties' => jndi_properties }
        )
      end
    end
  end
end
