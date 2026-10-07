-module(openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info/0]).

-type openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties:openapi_com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties()
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
