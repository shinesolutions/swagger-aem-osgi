-module(openapi_com_adobe_cq_audit_purge_pages_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_audit_purge_pages_info/0]).

-type openapi_com_adobe_cq_audit_purge_pages_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_audit_purge_pages_properties:openapi_com_adobe_cq_audit_purge_pages_properties()
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
