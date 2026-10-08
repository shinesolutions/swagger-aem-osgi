require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactoryAmended
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, resource_types : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo)
      @conn.request(OpenAPIClient::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "resource.types" => resource_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
