require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_wcm_qrcode_servlet_whitelist : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo)
      @conn.request(OpenAPIClient::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.wcm.qrcode.servlet.whitelist" => cq_wcm_qrcode_servlet_whitelist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
