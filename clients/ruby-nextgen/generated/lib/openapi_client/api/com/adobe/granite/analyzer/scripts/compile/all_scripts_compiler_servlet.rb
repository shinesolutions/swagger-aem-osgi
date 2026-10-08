# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, disabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet',
          type: OpenapiClient::Models::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompileHc5f4c3a7,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'disabled' => disabled }
        )
      end
    end
  end
end
