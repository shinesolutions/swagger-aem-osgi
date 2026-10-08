# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrRepoinitImplRepositoryInitializer
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, references: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer',
          type: OpenapiClient::Models::OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'references' => references }
        )
      end
    end
  end
end
