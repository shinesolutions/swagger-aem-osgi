# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploads
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, number_of_days: nil, age_of_file: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCIH880483fe,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'numberOfDays' => number_of_days, 'ageOfFile' => age_of_file }
        )
      end
    end
  end
end
