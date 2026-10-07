# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosts
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable_scheduled_posts_search: nil, number_of_minutes: nil, max_search_limit: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchSchH58c9ae3e,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enableScheduledPostsSearch' => enable_scheduled_posts_search, 'numberOfMinutes' => number_of_minutes, 'maxSearchLimit' => max_search_limit }
        )
      end
    end
  end
end
