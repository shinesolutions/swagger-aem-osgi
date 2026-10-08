# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingServiceusermappingImplServiceUserMapperImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, user_mapping: nil, user_default: nil, user_enable_default_mapping: nil, require_validation: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl',
          type: OpenapiClient::Models::OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'user.mapping' => user_mapping, 'user.default' => user_default, 'user.enable.default.mapping' => user_enable_default_mapping, 'require.validation' => require_validation }
        )
      end
    end
  end
end
