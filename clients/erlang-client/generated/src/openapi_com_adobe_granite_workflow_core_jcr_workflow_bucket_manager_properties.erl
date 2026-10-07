-module(openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties/0]).

-type openapi_com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_properties() ::
    #{ 'bucketSize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'bucketSize' := BucketSize
        }) ->
    #{ 'bucketSize' => BucketSize
     }.
