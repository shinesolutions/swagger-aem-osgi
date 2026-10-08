# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, org_apache_sling_scripting_javascript_rhino_opt_level: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory',
          type: OpenapiClient::Models::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriHcb806c27,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'org.apache.sling.scripting.javascript.rhino.optLevel' => org_apache_sling_scripting_javascript_rhino_opt_level }
        )
      end
    end
  end
end
