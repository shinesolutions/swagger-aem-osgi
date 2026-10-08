#ifndef com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_TEST
#define com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties.h"
com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t* instantiate_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties(int include_optional);

#include "test_config_node_property_string.c"
#include "test_config_node_property_boolean.c"
#include "test_config_node_property_string.c"
#include "test_config_node_property_integer.c"
#include "test_config_node_property_float.c"
#include "test_config_node_property_boolean.c"
#include "test_config_node_property_string.c"
#include "test_config_node_property_integer.c"
#include "test_config_node_property_float.c"


com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t* instantiate_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties(int include_optional) {
  com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t* com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties = NULL;
  if (include_optional) {
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_boolean(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_float(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_boolean(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_float(0)
    );
  } else {
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_create(
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties;
}


#ifdef com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_MAIN

void test_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties(int include_optional) {
    com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t* com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_1 = instantiate_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties(include_optional);

	cJSON* jsoncom_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_1 = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_1);
	printf("com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties :\n%s\n", cJSON_Print(jsoncom_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_1));
	com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_t* com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_2 = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_parseFromJSON(jsoncom_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_1);
	cJSON* jsoncom_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_2 = com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_convertToJSON(com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_2);
	printf("repeating com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties:\n%s\n", cJSON_Print(jsoncom_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_2));
}

int main() {
  test_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties(1);
  test_com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_MAIN
#endif // com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_properties_TEST
