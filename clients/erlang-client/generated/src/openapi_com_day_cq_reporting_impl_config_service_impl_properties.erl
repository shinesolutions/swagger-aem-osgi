-module(openapi_com_day_cq_reporting_impl_config_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_reporting_impl_config_service_impl_properties/0]).

-type openapi_com_day_cq_reporting_impl_config_service_impl_properties() ::
    #{ 'repconf_timezone' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'repconf_locale' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'repconf_snapshots' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'repconf_repdir' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'repconf_hourofday' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'repconf_minofhour' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'repconf_maxrows' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'repconf_fakedata' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'repconf_snapshotuser' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'repconf_enforcesnapshotuser' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'repconf_timezone' := RepconfTimezone,
          'repconf_locale' := RepconfLocale,
          'repconf_snapshots' := RepconfSnapshots,
          'repconf_repdir' := RepconfRepdir,
          'repconf_hourofday' := RepconfHourofday,
          'repconf_minofhour' := RepconfMinofhour,
          'repconf_maxrows' := RepconfMaxrows,
          'repconf_fakedata' := RepconfFakedata,
          'repconf_snapshotuser' := RepconfSnapshotuser,
          'repconf_enforcesnapshotuser' := RepconfEnforcesnapshotuser
        }) ->
    #{ 'repconf.timezone' => RepconfTimezone,
       'repconf.locale' => RepconfLocale,
       'repconf.snapshots' => RepconfSnapshots,
       'repconf.repdir' => RepconfRepdir,
       'repconf.hourofday' => RepconfHourofday,
       'repconf.minofhour' => RepconfMinofhour,
       'repconf.maxrows' => RepconfMaxrows,
       'repconf.fakedata' => RepconfFakedata,
       'repconf.snapshotuser' => RepconfSnapshotuser,
       'repconf.enforcesnapshotuser' => RepconfEnforcesnapshotuser
     }.
