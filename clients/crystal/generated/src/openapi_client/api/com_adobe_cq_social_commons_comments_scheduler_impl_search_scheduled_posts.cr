require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosts
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable_scheduled_posts_search : Bool? = nil, number_of_minutes : Int32? = nil, max_search_limit : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enableScheduledPostsSearch" => enable_scheduled_posts_search, "numberOfMinutes" => number_of_minutes, "maxSearchLimit" => max_search_limit },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
