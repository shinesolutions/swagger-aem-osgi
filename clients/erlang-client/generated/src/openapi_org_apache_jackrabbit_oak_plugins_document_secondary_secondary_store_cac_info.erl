-module(openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties:openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties()
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
