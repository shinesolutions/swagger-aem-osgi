# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteLicenseImplLicenseCheckFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, check_internval: nil, exclude_ids: nil, encrypt_ping: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter',
          type: OpenapiClient::Models::ComAdobeGraniteLicenseImplLicenseCheckFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'checkInternval' => check_internval, 'excludeIds' => exclude_ids, 'encryptPing' => encrypt_ping }
        )
      end
    end
  end
end
