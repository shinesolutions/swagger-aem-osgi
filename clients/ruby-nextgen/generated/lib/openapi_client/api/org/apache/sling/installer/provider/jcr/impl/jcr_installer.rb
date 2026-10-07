# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingInstallerProviderJcrImplJcrInstaller
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, handler_schemes: nil, sling_jcrinstall_folder_name_regexp: nil, sling_jcrinstall_folder_max_depth: nil, sling_jcrinstall_search_path: nil, sling_jcrinstall_new_config_path: nil, sling_jcrinstall_signal_path: nil, sling_jcrinstall_enable_writeback: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller',
          type: OpenapiClient::Models::OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'handler.schemes' => handler_schemes, 'sling.jcrinstall.folder.name.regexp' => sling_jcrinstall_folder_name_regexp, 'sling.jcrinstall.folder.max.depth' => sling_jcrinstall_folder_max_depth, 'sling.jcrinstall.search.path' => sling_jcrinstall_search_path, 'sling.jcrinstall.new.config.path' => sling_jcrinstall_new_config_path, 'sling.jcrinstall.signal.path' => sling_jcrinstall_signal_path, 'sling.jcrinstall.enable.writeback' => sling_jcrinstall_enable_writeback }
        )
      end
    end
  end
end
