#ifndef config_node_property_array_TEST
#define config_node_property_array_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define config_node_property_array_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/config_node_property_array.h"
config_node_property_array_t* instantiate_config_node_property_array(int include_optional);



config_node_property_array_t* instantiate_config_node_property_array(int include_optional) {
  config_node_property_array_t* config_node_property_array = NULL;
  if (include_optional) {
    config_node_property_array = config_node_property_array_create(
      "0",
      1,
      1,
      56,
      list_createList(),
      "0"
    );
  } else {
    config_node_property_array = config_node_property_array_create(
      "0",
      1,
      1,
      56,
      list_createList(),
      "0"
    );
  }

  return config_node_property_array;
}


#ifdef config_node_property_array_MAIN

void test_config_node_property_array(int include_optional) {
    config_node_property_array_t* config_node_property_array_1 = instantiate_config_node_property_array(include_optional);

	cJSON* jsonconfig_node_property_array_1 = config_node_property_array_convertToJSON(config_node_property_array_1);
	printf("config_node_property_array :\n%s\n", cJSON_Print(jsonconfig_node_property_array_1));
	config_node_property_array_t* config_node_property_array_2 = config_node_property_array_parseFromJSON(jsonconfig_node_property_array_1);
	cJSON* jsonconfig_node_property_array_2 = config_node_property_array_convertToJSON(config_node_property_array_2);
	printf("repeating config_node_property_array:\n%s\n", cJSON_Print(jsonconfig_node_property_array_2));
}

int main() {
  test_config_node_property_array(1);
  test_config_node_property_array(0);

  printf("Hello world \n");
  return 0;
}

#endif // config_node_property_array_MAIN
#endif // config_node_property_array_TEST
