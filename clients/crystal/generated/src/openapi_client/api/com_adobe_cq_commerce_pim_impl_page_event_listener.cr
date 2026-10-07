require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCommercePimImplPageEventListener
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_commerce_pageeventlistener_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqCommercePimImplPageEventListenerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCommercePimImplPageEventListenerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.commerce.pageeventlistener.enabled" => cq_commerce_pageeventlistener_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
