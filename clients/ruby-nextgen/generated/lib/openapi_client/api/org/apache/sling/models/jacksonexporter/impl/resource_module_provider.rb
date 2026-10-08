# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, max_recursion_levels: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider',
          type: OpenapiClient::Models::OrgApacheSlingModelsJacksonexporterImplResourceModulePHd8a95ed5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'max.recursion.levels' => max_recursion_levels }
        )
      end
    end
  end
end
