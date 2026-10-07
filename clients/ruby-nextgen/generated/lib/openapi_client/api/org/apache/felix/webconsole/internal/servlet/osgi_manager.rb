# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheFelixWebconsoleInternalServletOsgiManager
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, manager_root: nil, http_service_filter: nil, default_render: nil, realm: nil, username: nil, password: nil, category: nil, locale: nil, loglevel: nil, plugins: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager',
          type: OpenapiClient::Models::OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'manager.root' => manager_root, 'http.service.filter' => http_service_filter, 'default.render' => default_render, 'realm' => realm, 'username' => username, 'password' => password, 'category' => category, 'locale' => locale, 'loglevel' => loglevel, 'plugins' => plugins }
        )
      end
    end
  end
end
