-module(openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info/0]).

-type openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties:openapi_com_adobe_granite_distribution_core_impl_distribution_to_replication_even_properties()
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
