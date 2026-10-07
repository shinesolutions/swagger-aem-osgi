#ifndef guide_localization_service_properties_TEST
#define guide_localization_service_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define guide_localization_service_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/guide_localization_service_properties.h"
guide_localization_service_properties_t* instantiate_guide_localization_service_properties(int include_optional);

#include "test_config_node_property_array.c"
#include "test_config_node_property_array.c"


guide_localization_service_properties_t* instantiate_guide_localization_service_properties(int include_optional) {
  guide_localization_service_properties_t* guide_localization_service_properties = NULL;
  if (include_optional) {
    guide_localization_service_properties = guide_localization_service_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_array(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_array(0)
    );
  } else {
    guide_localization_service_properties = guide_localization_service_properties_create(
      NULL,
      NULL
    );
  }

  return guide_localization_service_properties;
}


#ifdef guide_localization_service_properties_MAIN

void test_guide_localization_service_properties(int include_optional) {
    guide_localization_service_properties_t* guide_localization_service_properties_1 = instantiate_guide_localization_service_properties(include_optional);

	cJSON* jsonguide_localization_service_properties_1 = guide_localization_service_properties_convertToJSON(guide_localization_service_properties_1);
	printf("guide_localization_service_properties :\n%s\n", cJSON_Print(jsonguide_localization_service_properties_1));
	guide_localization_service_properties_t* guide_localization_service_properties_2 = guide_localization_service_properties_parseFromJSON(jsonguide_localization_service_properties_1);
	cJSON* jsonguide_localization_service_properties_2 = guide_localization_service_properties_convertToJSON(guide_localization_service_properties_2);
	printf("repeating guide_localization_service_properties:\n%s\n", cJSON_Print(jsonguide_localization_service_properties_2));
}

int main() {
  test_guide_localization_service_properties(1);
  test_guide_localization_service_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // guide_localization_service_properties_MAIN
#endif // guide_localization_service_properties_TEST
