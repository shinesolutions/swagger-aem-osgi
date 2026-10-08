require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_tags : Array(String)? = nil, exclude_search_path : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.tags" => hc_tags, "exclude.search.path" => exclude_search_path },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
