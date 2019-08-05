-module(openapi_com_adobe_granite_frags_impl_random_feature_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_frags_impl_random_feature_info/0]).

-type openapi_com_adobe_granite_frags_impl_random_feature_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_frags_impl_random_feature_properties:openapi_com_adobe_granite_frags_impl_random_feature_properties()
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
