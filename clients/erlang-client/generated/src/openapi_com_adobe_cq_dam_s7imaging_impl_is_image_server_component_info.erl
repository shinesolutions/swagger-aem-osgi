-module(openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info/0]).

-type openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties:openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
