# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_wcm_qrcode_servlet_whitelist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator',
          type: OpenapiClient::Models::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.wcm.qrcode.servlet.whitelist' => cq_wcm_qrcode_servlet_whitelist }
        )
      end
    end
  end
end
