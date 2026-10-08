require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSiteImplSiteConfiguratorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, components_using_tags : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "componentsUsingTags" => components_using_tags },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
