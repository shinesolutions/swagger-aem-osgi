#ifndef config_node_property_drop_down_TEST
#define config_node_property_drop_down_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define config_node_property_drop_down_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/config_node_property_drop_down.h"
config_node_property_drop_down_t* instantiate_config_node_property_drop_down(int include_optional);

#include "test_config_node_property_drop_down_type.c"


config_node_property_drop_down_t* instantiate_config_node_property_drop_down(int include_optional) {
  config_node_property_drop_down_t* config_node_property_drop_down = NULL;
  if (include_optional) {
    config_node_property_drop_down = config_node_property_drop_down_create(
      "0",
      1,
      1,
       // false, not to have infinite recursion
      instantiate_config_node_property_drop_down_type(0),
      null,
      "0"
    );
  } else {
    config_node_property_drop_down = config_node_property_drop_down_create(
      "0",
      1,
      1,
      NULL,
      null,
      "0"
    );
  }

  return config_node_property_drop_down;
}


#ifdef config_node_property_drop_down_MAIN

void test_config_node_property_drop_down(int include_optional) {
    config_node_property_drop_down_t* config_node_property_drop_down_1 = instantiate_config_node_property_drop_down(include_optional);

	cJSON* jsonconfig_node_property_drop_down_1 = config_node_property_drop_down_convertToJSON(config_node_property_drop_down_1);
	printf("config_node_property_drop_down :\n%s\n", cJSON_Print(jsonconfig_node_property_drop_down_1));
	config_node_property_drop_down_t* config_node_property_drop_down_2 = config_node_property_drop_down_parseFromJSON(jsonconfig_node_property_drop_down_1);
	cJSON* jsonconfig_node_property_drop_down_2 = config_node_property_drop_down_convertToJSON(config_node_property_drop_down_2);
	printf("repeating config_node_property_drop_down:\n%s\n", cJSON_Print(jsonconfig_node_property_drop_down_2));
}

int main() {
  test_config_node_property_drop_down(1);
  test_config_node_property_drop_down(0);

  printf("Hello world \n");
  return 0;
}

#endif // config_node_property_drop_down_MAIN
#endif // config_node_property_drop_down_TEST
