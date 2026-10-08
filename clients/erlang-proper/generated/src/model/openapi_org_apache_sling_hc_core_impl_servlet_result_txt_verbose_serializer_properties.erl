-module(openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties/0]).

-export([openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties() ::
  [ {'totalWidth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'colWidthName', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'colWidthResult', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'colWidthTiming', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties() ->
    openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties([]).

openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties(Fields) ->
  Default = [ {'totalWidth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'colWidthName', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'colWidthResult', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'colWidthTiming', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

