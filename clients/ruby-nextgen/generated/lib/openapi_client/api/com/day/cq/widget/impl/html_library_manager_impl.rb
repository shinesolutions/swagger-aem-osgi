# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWidgetImplHtmlLibraryManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, htmllibmanager_clientmanager: nil, htmllibmanager_debug: nil, htmllibmanager_debug_console: nil, htmllibmanager_debug_init_js: nil, htmllibmanager_defaultthemename: nil, htmllibmanager_defaultuserthemename: nil, htmllibmanager_firebuglite_path: nil, htmllibmanager_force_cq_url_info: nil, htmllibmanager_gzip: nil, htmllibmanager_maxage: nil, htmllibmanager_max_data_uri_size: nil, htmllibmanager_minify: nil, htmllibmanager_path_list: nil, htmllibmanager_timing: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl',
          type: OpenapiClient::Models::ComDayCqWidgetImplHtmlLibraryManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'htmllibmanager.clientmanager' => htmllibmanager_clientmanager, 'htmllibmanager.debug' => htmllibmanager_debug, 'htmllibmanager.debug.console' => htmllibmanager_debug_console, 'htmllibmanager.debug.init.js' => htmllibmanager_debug_init_js, 'htmllibmanager.defaultthemename' => htmllibmanager_defaultthemename, 'htmllibmanager.defaultuserthemename' => htmllibmanager_defaultuserthemename, 'htmllibmanager.firebuglite.path' => htmllibmanager_firebuglite_path, 'htmllibmanager.forceCQUrlInfo' => htmllibmanager_force_cq_url_info, 'htmllibmanager.gzip' => htmllibmanager_gzip, 'htmllibmanager.maxage' => htmllibmanager_maxage, 'htmllibmanager.maxDataUriSize' => htmllibmanager_max_data_uri_size, 'htmllibmanager.minify' => htmllibmanager_minify, 'htmllibmanager.path.list' => htmllibmanager_path_list, 'htmllibmanager.timing' => htmllibmanager_timing }
        )
      end
    end
  end
end
