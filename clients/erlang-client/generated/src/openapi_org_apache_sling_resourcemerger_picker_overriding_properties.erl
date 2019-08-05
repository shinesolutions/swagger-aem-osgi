-module(openapi_org_apache_sling_resourcemerger_picker_overriding_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_resourcemerger_picker_overriding_properties/0]).

-type openapi_org_apache_sling_resourcemerger_picker_overriding_properties() ::
    #{ 'merge_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'merge_readOnly' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'merge_root' := MergeRoot,
          'merge_readOnly' := MergeReadOnly
        }) ->
    #{ 'merge.root' => MergeRoot,
       'merge.readOnly' => MergeReadOnly
     }.
