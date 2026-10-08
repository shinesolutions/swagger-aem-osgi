# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrRepoinitRepositoryInitializer
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, references: nil, scripts: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer',
          type: OpenapiClient::Models::OrgApacheSlingJcrRepoinitRepositoryInitializerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'references' => references, 'scripts' => scripts }
        )
      end
    end
  end
end
