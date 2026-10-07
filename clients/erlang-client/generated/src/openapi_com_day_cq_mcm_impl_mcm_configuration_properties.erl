-module(openapi_com_day_cq_mcm_impl_mcm_configuration_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mcm_impl_mcm_configuration_properties/0]).

-type openapi_com_day_cq_mcm_impl_mcm_configuration_properties() ::
    #{ 'experience_indirection' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'touchpoint_indirection' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'experience_indirection' := ExperienceIndirection,
          'touchpoint_indirection' := TouchpointIndirection
        }) ->
    #{ 'experience.indirection' => ExperienceIndirection,
       'touchpoint.indirection' => TouchpointIndirection
     }.
