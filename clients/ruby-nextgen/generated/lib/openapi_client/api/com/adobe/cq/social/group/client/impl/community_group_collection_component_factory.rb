# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, group_listing_pagination_enable: nil, group_listing_lazyloading_enable: nil, page_size: nil, priority: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory',
          type: OpenapiClient::Models::ComAdobeCqSocialGroupClientImplCommunityGroupCollectiHcd8f3981,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'group.listing.pagination.enable' => group_listing_pagination_enable, 'group.listing.lazyloading.enable' => group_listing_lazyloading_enable, 'page.size' => page_size, 'priority' => priority }
        )
      end
    end
  end
end
