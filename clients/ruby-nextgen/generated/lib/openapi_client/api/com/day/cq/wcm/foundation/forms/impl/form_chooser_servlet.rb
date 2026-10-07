# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmFoundationFormsImplFormChooserServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_name: nil, sling_servlet_resource_types: nil, sling_servlet_selectors: nil, sling_servlet_methods: nil, forms_formchooserservlet_advansesearch_require: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet',
          type: OpenapiClient::Models::ComDayCqWcmFoundationFormsImplFormChooserServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.name' => service_name, 'sling.servlet.resourceTypes' => sling_servlet_resource_types, 'sling.servlet.selectors' => sling_servlet_selectors, 'sling.servlet.methods' => sling_servlet_methods, 'forms.formchooserservlet.advansesearch.require' => forms_formchooserservlet_advansesearch_require }
        )
      end
    end
  end
end
