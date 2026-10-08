# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeFdFpConfigFormsPortalSchedulerService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, formportal_interval: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService',
          type: OpenapiClient::Models::ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'formportal.interval' => formportal_interval }
        )
      end
    end
  end
end
