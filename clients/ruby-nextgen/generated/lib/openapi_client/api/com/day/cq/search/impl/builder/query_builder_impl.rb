# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqSearchImplBuilderQueryBuilderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, excerpt_properties: nil, cache_max_entries: nil, cache_entry_lifetime: nil, xpath_union: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl',
          type: OpenapiClient::Models::ComDayCqSearchImplBuilderQueryBuilderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'excerpt.properties' => excerpt_properties, 'cache.max.entries' => cache_max_entries, 'cache.entry.lifetime' => cache_entry_lifetime, 'xpath.union' => xpath_union }
        )
      end
    end
  end
end
