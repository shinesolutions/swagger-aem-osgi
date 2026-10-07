-module(openapi_com_day_cq_reporting_impl_config_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_reporting_impl_config_service_impl_properties/0]).

-export([openapi_com_day_cq_reporting_impl_config_service_impl_properties/1]).

-export_type([openapi_com_day_cq_reporting_impl_config_service_impl_properties/0]).

-type openapi_com_day_cq_reporting_impl_config_service_impl_properties() ::
  [ {'repconf_timezone', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'repconf_locale', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'repconf_snapshots', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'repconf_repdir', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'repconf_hourofday', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'repconf_minofhour', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'repconf_maxrows', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'repconf_fakedata', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'repconf_snapshotuser', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'repconf_enforcesnapshotuser', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_reporting_impl_config_service_impl_properties() ->
    openapi_com_day_cq_reporting_impl_config_service_impl_properties([]).

openapi_com_day_cq_reporting_impl_config_service_impl_properties(Fields) ->
  Default = [ {'repconf.timezone', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'repconf.locale', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'repconf.snapshots', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'repconf.repdir', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'repconf.hourofday', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'repconf.minofhour', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'repconf.maxrows', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'repconf.fakedata', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'repconf.snapshotuser', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'repconf.enforcesnapshotuser', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

