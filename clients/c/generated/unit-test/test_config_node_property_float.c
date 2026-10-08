#ifndef config_node_property_float_TEST
#define config_node_property_float_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define config_node_property_float_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/config_node_property_float.h"
config_node_property_float_t* instantiate_config_node_property_float(int include_optional);



config_node_property_float_t* instantiate_config_node_property_float(int include_optional) {
  config_node_property_float_t* config_node_property_float = NULL;
  if (include_optional) {
    config_node_property_float = config_node_property_float_create(
      "0",
      1,
      1,
      56,
      1.337,
      "0"
    );
  } else {
    config_node_property_float = config_node_property_float_create(
      "0",
      1,
      1,
      56,
      1.337,
      "0"
    );
  }

  return config_node_property_float;
}


#ifdef config_node_property_float_MAIN

void test_config_node_property_float(int include_optional) {
    config_node_property_float_t* config_node_property_float_1 = instantiate_config_node_property_float(include_optional);

	cJSON* jsonconfig_node_property_float_1 = config_node_property_float_convertToJSON(config_node_property_float_1);
	printf("config_node_property_float :\n%s\n", cJSON_Print(jsonconfig_node_property_float_1));
	config_node_property_float_t* config_node_property_float_2 = config_node_property_float_parseFromJSON(jsonconfig_node_property_float_1);
	cJSON* jsonconfig_node_property_float_2 = config_node_property_float_convertToJSON(config_node_property_float_2);
	printf("repeating config_node_property_float:\n%s\n", cJSON_Print(jsonconfig_node_property_float_2));
}

int main() {
  test_config_node_property_float(1);
  test_config_node_property_float(0);

  printf("Hello world \n");
  return 0;
}

#endif // config_node_property_float_MAIN
#endif // config_node_property_float_TEST
