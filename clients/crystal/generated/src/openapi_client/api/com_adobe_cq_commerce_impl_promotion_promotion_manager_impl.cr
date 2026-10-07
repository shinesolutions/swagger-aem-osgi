require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCommerceImplPromotionPromotionManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_commerce_promotion_root : String? = nil) : Response(OpenAPIClient::ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.commerce.promotion.root" => cq_commerce_promotion_root },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
