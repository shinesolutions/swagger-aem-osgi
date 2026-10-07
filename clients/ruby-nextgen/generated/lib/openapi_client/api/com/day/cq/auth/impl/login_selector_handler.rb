# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAuthImplLoginSelectorHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, service_ranking: nil, auth_loginselector_mappings: nil, auth_loginselector_changepw_mappings: nil, auth_loginselector_defaultloginpage: nil, auth_loginselector_defaultchangepwpage: nil, auth_loginselector_handle: nil, auth_loginselector_handle_all_extensions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler',
          type: OpenapiClient::Models::ComDayCqAuthImplLoginSelectorHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'service.ranking' => service_ranking, 'auth.loginselector.mappings' => auth_loginselector_mappings, 'auth.loginselector.changepw.mappings' => auth_loginselector_changepw_mappings, 'auth.loginselector.defaultloginpage' => auth_loginselector_defaultloginpage, 'auth.loginselector.defaultchangepwpage' => auth_loginselector_defaultchangepwpage, 'auth.loginselector.handle' => auth_loginselector_handle, 'auth.loginselector.handle.all.extensions' => auth_loginselector_handle_all_extensions }
        )
      end
    end
  end
end
