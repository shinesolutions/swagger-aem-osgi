# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingSecurityImplContentDispositionFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_content_disposition_paths: nil, sling_content_disposition_excluded_paths: nil, sling_content_disposition_all_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter',
          type: OpenapiClient::Models::OrgApacheSlingSecurityImplContentDispositionFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.content.disposition.paths' => sling_content_disposition_paths, 'sling.content.disposition.excluded.paths' => sling_content_disposition_excluded_paths, 'sling.content.disposition.all.paths' => sling_content_disposition_all_paths }
        )
      end
    end
  end
end
