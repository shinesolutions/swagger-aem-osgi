#ifndef config_node_property_drop_down_type_TEST
#define config_node_property_drop_down_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define config_node_property_drop_down_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/config_node_property_drop_down_type.h"
config_node_property_drop_down_type_t* instantiate_config_node_property_drop_down_type(int include_optional);



config_node_property_drop_down_type_t* instantiate_config_node_property_drop_down_type(int include_optional) {
  config_node_property_drop_down_type_t* config_node_property_drop_down_type = NULL;
  if (include_optional) {
    config_node_property_drop_down_type = config_node_property_drop_down_type_create(
      null,
      null
    );
  } else {
    config_node_property_drop_down_type = config_node_property_drop_down_type_create(
      null,
      null
    );
  }

  return config_node_property_drop_down_type;
}


#ifdef config_node_property_drop_down_type_MAIN

void test_config_node_property_drop_down_type(int include_optional) {
    config_node_property_drop_down_type_t* config_node_property_drop_down_type_1 = instantiate_config_node_property_drop_down_type(include_optional);

	cJSON* jsonconfig_node_property_drop_down_type_1 = config_node_property_drop_down_type_convertToJSON(config_node_property_drop_down_type_1);
	printf("config_node_property_drop_down_type :\n%s\n", cJSON_Print(jsonconfig_node_property_drop_down_type_1));
	config_node_property_drop_down_type_t* config_node_property_drop_down_type_2 = config_node_property_drop_down_type_parseFromJSON(jsonconfig_node_property_drop_down_type_1);
	cJSON* jsonconfig_node_property_drop_down_type_2 = config_node_property_drop_down_type_convertToJSON(config_node_property_drop_down_type_2);
	printf("repeating config_node_property_drop_down_type:\n%s\n", cJSON_Print(jsonconfig_node_property_drop_down_type_2));
}

int main() {
  test_config_node_property_drop_down_type(1);
  test_config_node_property_drop_down_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // config_node_property_drop_down_type_MAIN
#endif // config_node_property_drop_down_type_TEST
