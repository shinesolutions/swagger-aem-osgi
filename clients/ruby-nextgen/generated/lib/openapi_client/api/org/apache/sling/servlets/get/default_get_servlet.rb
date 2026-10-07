# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingServletsGetDefaultGetServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, aliases: nil, index: nil, index_files: nil, enable_html: nil, enable_json: nil, enable_txt: nil, enable_xml: nil, json_maximumresults: nil, ecma_suport: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet',
          type: OpenapiClient::Models::OrgApacheSlingServletsGetDefaultGetServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'aliases' => aliases, 'index' => index, 'index.files' => index_files, 'enable.html' => enable_html, 'enable.json' => enable_json, 'enable.txt' => enable_txt, 'enable.xml' => enable_xml, 'json.maximumresults' => json_maximumresults, 'ecmaSuport' => ecma_suport }
        )
      end
    end
  end
end
