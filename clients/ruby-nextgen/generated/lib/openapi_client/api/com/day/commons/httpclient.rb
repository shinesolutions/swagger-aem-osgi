# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCommonsHttpclient
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, proxy_enabled: nil, proxy_host: nil, proxy_user: nil, proxy_password: nil, proxy_ntlm_host: nil, proxy_ntlm_domain: nil, proxy_exceptions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.commons.httpclient',
          type: OpenapiClient::Models::ComDayCommonsHttpclientInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'proxy.enabled' => proxy_enabled, 'proxy.host' => proxy_host, 'proxy.user' => proxy_user, 'proxy.password' => proxy_password, 'proxy.ntlm.host' => proxy_ntlm_host, 'proxy.ntlm.domain' => proxy_ntlm_domain, 'proxy.exceptions' => proxy_exceptions }
        )
      end
    end
  end
end
