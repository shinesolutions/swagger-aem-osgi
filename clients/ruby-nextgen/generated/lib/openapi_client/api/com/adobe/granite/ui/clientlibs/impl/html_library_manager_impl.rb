# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, htmllibmanager_timing: nil, htmllibmanager_debug_init_js: nil, htmllibmanager_minify: nil, htmllibmanager_debug: nil, htmllibmanager_gzip: nil, htmllibmanager_max_data_uri_size: nil, htmllibmanager_maxage: nil, htmllibmanager_force_cq_url_info: nil, htmllibmanager_defaultthemename: nil, htmllibmanager_defaultuserthemename: nil, htmllibmanager_clientmanager: nil, htmllibmanager_path_list: nil, htmllibmanager_excluded_path_list: nil, htmllibmanager_processor_js: nil, htmllibmanager_processor_css: nil, htmllibmanager_longcache_patterns: nil, htmllibmanager_longcache_format: nil, htmllibmanager_use_file_system_output_cache: nil, htmllibmanager_file_system_output_cache_location: nil, htmllibmanager_disable_replacement: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl',
          type: OpenapiClient::Models::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'htmllibmanager.timing' => htmllibmanager_timing, 'htmllibmanager.debug.init.js' => htmllibmanager_debug_init_js, 'htmllibmanager.minify' => htmllibmanager_minify, 'htmllibmanager.debug' => htmllibmanager_debug, 'htmllibmanager.gzip' => htmllibmanager_gzip, 'htmllibmanager.maxDataUriSize' => htmllibmanager_max_data_uri_size, 'htmllibmanager.maxage' => htmllibmanager_maxage, 'htmllibmanager.forceCQUrlInfo' => htmllibmanager_force_cq_url_info, 'htmllibmanager.defaultthemename' => htmllibmanager_defaultthemename, 'htmllibmanager.defaultuserthemename' => htmllibmanager_defaultuserthemename, 'htmllibmanager.clientmanager' => htmllibmanager_clientmanager, 'htmllibmanager.path.list' => htmllibmanager_path_list, 'htmllibmanager.excluded.path.list' => htmllibmanager_excluded_path_list, 'htmllibmanager.processor.js' => htmllibmanager_processor_js, 'htmllibmanager.processor.css' => htmllibmanager_processor_css, 'htmllibmanager.longcache.patterns' => htmllibmanager_longcache_patterns, 'htmllibmanager.longcache.format' => htmllibmanager_longcache_format, 'htmllibmanager.useFileSystemOutputCache' => htmllibmanager_use_file_system_output_cache, 'htmllibmanager.fileSystemOutputCacheLocation' => htmllibmanager_file_system_output_cache_location, 'htmllibmanager.disable.replacement' => htmllibmanager_disable_replacement }
        )
      end
    end
  end
end
