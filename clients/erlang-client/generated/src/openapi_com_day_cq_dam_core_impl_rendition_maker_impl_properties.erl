-module(openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_rendition_maker_impl_properties() ::
    #{ 'xmp_propagate' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'xmp_excludes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'xmp_propagate' := XmpPropagate,
          'xmp_excludes' := XmpExcludes
        }) ->
    #{ 'xmp.propagate' => XmpPropagate,
       'xmp.excludes' => XmpExcludes
     }.
