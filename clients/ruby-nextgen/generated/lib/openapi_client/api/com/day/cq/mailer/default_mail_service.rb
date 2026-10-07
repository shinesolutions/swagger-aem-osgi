# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqMailerDefaultMailService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, smtp_host: nil, smtp_port: nil, smtp_user: nil, smtp_password: nil, from_address: nil, smtp_ssl: nil, smtp_starttls: nil, debug_email: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.mailer.DefaultMailService',
          type: OpenapiClient::Models::ComDayCqMailerDefaultMailServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'smtp.host' => smtp_host, 'smtp.port' => smtp_port, 'smtp.user' => smtp_user, 'smtp.password' => smtp_password, 'from.address' => from_address, 'smtp.ssl' => smtp_ssl, 'smtp.starttls' => smtp_starttls, 'debug.email' => debug_email }
        )
      end
    end
  end
end
