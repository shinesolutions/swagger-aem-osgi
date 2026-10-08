# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, user_mapping: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended',
          type: OpenapiClient::Models::OrgApacheSlingServiceusermappingImplServiceUserMapperIH4422be93,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'user.mapping' => user_mapping }
        )
      end
    end
  end
end
