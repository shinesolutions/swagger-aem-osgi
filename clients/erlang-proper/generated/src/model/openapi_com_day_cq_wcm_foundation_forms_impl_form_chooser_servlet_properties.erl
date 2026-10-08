-module(openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties() ::
  [ {'service_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_resourceTypes', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_methods', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'forms_formchooserservlet_advansesearch_require', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties() ->
    openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties([]).

openapi_com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_properties(Fields) ->
  Default = [ {'service.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.resourceTypes', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.methods', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'forms.formchooserservlet.advansesearch.require', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

