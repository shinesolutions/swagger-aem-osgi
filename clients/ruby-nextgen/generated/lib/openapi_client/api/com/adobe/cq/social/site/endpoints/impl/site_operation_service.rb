# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialSiteEndpointsImplSiteOperationService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, field_whitelist: nil, site_path_filters: nil, site_package_group: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService',
          type: OpenapiClient::Models::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fieldWhitelist' => field_whitelist, 'sitePathFilters' => site_path_filters, 'sitePackageGroup' => site_package_group }
        )
      end
    end
  end
end
