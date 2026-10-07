-module(openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties() ::
  [ {'sling_servlet_resourceTypes', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'resource_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resource_blacklist', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties() ->
    openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties([]).

openapi_com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.resourceTypes', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'resource.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resource.blacklist', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

