# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteMonitoringImplScriptConfigImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, script_filename: nil, script_display: nil, script_path: nil, script_platform: nil, interval: nil, jmxdomain: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl',
          type: OpenapiClient::Models::ComAdobeGraniteMonitoringImplScriptConfigImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'script.filename' => script_filename, 'script.display' => script_display, 'script.path' => script_path, 'script.platform' => script_platform, 'interval' => interval, 'jmxdomain' => jmxdomain }
        )
      end
    end
  end
end
