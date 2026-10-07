require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationFormsImplFormChooserServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_name : String? = nil, sling_servlet_resource_types : String? = nil, sling_servlet_selectors : String? = nil, sling_servlet_methods : Array(String)? = nil, forms_formchooserservlet_advansesearch_require : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationFormsImplFormChooserServletInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationFormsImplFormChooserServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.name" => service_name, "sling.servlet.resourceTypes" => sling_servlet_resource_types, "sling.servlet.selectors" => sling_servlet_selectors, "sling.servlet.methods" => sling_servlet_methods, "forms.formchooserservlet.advansesearch.require" => forms_formchooserservlet_advansesearch_require },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
