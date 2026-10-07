-module(openapi_com_adobe_octopus_ncomm_bootstrap_info).

-export([encode/1]).

-export_type([openapi_com_adobe_octopus_ncomm_bootstrap_info/0]).

-type openapi_com_adobe_octopus_ncomm_bootstrap_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_octopus_ncomm_bootstrap_properties:openapi_com_adobe_octopus_ncomm_bootstrap_properties()
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
