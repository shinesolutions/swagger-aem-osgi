# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialSiteImplSiteConfiguratorImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, components_using_tags: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'componentsUsingTags' => components_using_tags }
        )
      end
    end
  end
end
