# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheHttpProxyconfigurator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, proxy_enabled: nil, proxy_host: nil, proxy_port: nil, proxy_user: nil, proxy_password: nil, proxy_exceptions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.http.proxyconfigurator',
          type: OpenapiClient::Models::OrgApacheHttpProxyconfiguratorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'proxy.enabled' => proxy_enabled, 'proxy.host' => proxy_host, 'proxy.port' => proxy_port, 'proxy.user' => proxy_user, 'proxy.password' => proxy_password, 'proxy.exceptions' => proxy_exceptions }
        )
      end
    end
  end
end
