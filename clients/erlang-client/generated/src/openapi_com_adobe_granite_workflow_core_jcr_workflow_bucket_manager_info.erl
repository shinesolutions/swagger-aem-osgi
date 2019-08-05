-module(openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info/0]).

-type openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties:openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties()
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
