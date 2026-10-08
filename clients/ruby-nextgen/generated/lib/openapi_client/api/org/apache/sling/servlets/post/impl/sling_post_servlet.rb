# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingServletsPostImplSlingPostServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, servlet_post_date_formats: nil, servlet_post_node_name_hints: nil, servlet_post_node_name_max_length: nil, servlet_post_checkin_new_versionable_nodes: nil, servlet_post_auto_checkout: nil, servlet_post_auto_checkin: nil, servlet_post_ignore_pattern: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet',
          type: OpenapiClient::Models::OrgApacheSlingServletsPostImplSlingPostServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'servlet.post.dateFormats' => servlet_post_date_formats, 'servlet.post.nodeNameHints' => servlet_post_node_name_hints, 'servlet.post.nodeNameMaxLength' => servlet_post_node_name_max_length, 'servlet.post.checkinNewVersionableNodes' => servlet_post_checkin_new_versionable_nodes, 'servlet.post.autoCheckout' => servlet_post_auto_checkout, 'servlet.post.autoCheckin' => servlet_post_auto_checkin, 'servlet.post.ignorePattern' => servlet_post_ignore_pattern }
        )
      end
    end
  end
end
