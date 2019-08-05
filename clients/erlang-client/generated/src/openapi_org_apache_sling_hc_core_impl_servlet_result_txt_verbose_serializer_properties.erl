-module(openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties() ::
    #{ 'totalWidth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'colWidthName' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'colWidthResult' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'colWidthTiming' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'totalWidth' := TotalWidth,
          'colWidthName' := ColWidthName,
          'colWidthResult' := ColWidthResult,
          'colWidthTiming' := ColWidthTiming
        }) ->
    #{ 'totalWidth' => TotalWidth,
       'colWidthName' => ColWidthName,
       'colWidthResult' => ColWidthResult,
       'colWidthTiming' => ColWidthTiming
     }.
