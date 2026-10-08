require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponentFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, group_listing_pagination_enable : Bool? = nil, group_listing_lazyloading_enable : Bool? = nil, page_size : Int32? = nil, priority : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "group.listing.pagination.enable" => group_listing_pagination_enable, "group.listing.lazyloading.enable" => group_listing_lazyloading_enable, "page.size" => page_size, "priority" => priority },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
