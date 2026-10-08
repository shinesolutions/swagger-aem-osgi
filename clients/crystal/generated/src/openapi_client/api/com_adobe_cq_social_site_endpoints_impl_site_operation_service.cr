require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialSiteEndpointsImplSiteOperationService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, field_whitelist : Array(String)? = nil, site_path_filters : Array(String)? = nil, site_package_group : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fieldWhitelist" => field_whitelist, "sitePathFilters" => site_path_filters, "sitePackageGroup" => site_package_group },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
