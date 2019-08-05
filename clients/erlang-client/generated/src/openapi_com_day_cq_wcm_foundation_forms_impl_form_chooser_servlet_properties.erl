-module(openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties() ::
    #{ 'service_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_resourceTypes' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_selectors' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_methods' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'forms_formchooserservlet_advansesearch_require' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'service_name' := ServiceName,
          'sling_servlet_resourceTypes' := SlingServletResourceTypes,
          'sling_servlet_selectors' := SlingServletSelectors,
          'sling_servlet_methods' := SlingServletMethods,
          'forms_formchooserservlet_advansesearch_require' := FormsFormchooserservletAdvansesearchRequire
        }) ->
    #{ 'service.name' => ServiceName,
       'sling.servlet.resourceTypes' => SlingServletResourceTypes,
       'sling.servlet.selectors' => SlingServletSelectors,
       'sling.servlet.methods' => SlingServletMethods,
       'forms.formchooserservlet.advansesearch.require' => FormsFormchooserservletAdvansesearchRequire
     }.
