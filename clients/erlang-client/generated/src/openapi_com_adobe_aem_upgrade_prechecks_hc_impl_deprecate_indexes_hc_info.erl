-module(openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info/0]).

-type openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties:openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties()
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
