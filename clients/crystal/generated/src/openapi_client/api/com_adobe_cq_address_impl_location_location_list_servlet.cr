require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqAddressImplLocationLocationListServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_address_location_default_max_results : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqAddressImplLocationLocationListServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqAddressImplLocationLocationListServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.address.location.default.maxResults" => cq_address_location_default_max_results },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
