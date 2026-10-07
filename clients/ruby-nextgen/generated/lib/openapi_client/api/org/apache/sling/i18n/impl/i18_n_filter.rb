# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingI18nImplI18NFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, sling_filter_scope: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter',
          type: OpenapiClient::Models::OrgApacheSlingI18nImplI18NFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'sling.filter.scope' => sling_filter_scope }
        )
      end
    end
  end
end
