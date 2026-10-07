#ifndef guide_localization_service_info_TEST
#define guide_localization_service_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define guide_localization_service_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/guide_localization_service_info.h"
guide_localization_service_info_t* instantiate_guide_localization_service_info(int include_optional);

#include "test_guide_localization_service_properties.c"


guide_localization_service_info_t* instantiate_guide_localization_service_info(int include_optional) {
  guide_localization_service_info_t* guide_localization_service_info = NULL;
  if (include_optional) {
    guide_localization_service_info = guide_localization_service_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_guide_localization_service_properties(0)
    );
  } else {
    guide_localization_service_info = guide_localization_service_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return guide_localization_service_info;
}


#ifdef guide_localization_service_info_MAIN

void test_guide_localization_service_info(int include_optional) {
    guide_localization_service_info_t* guide_localization_service_info_1 = instantiate_guide_localization_service_info(include_optional);

	cJSON* jsonguide_localization_service_info_1 = guide_localization_service_info_convertToJSON(guide_localization_service_info_1);
	printf("guide_localization_service_info :\n%s\n", cJSON_Print(jsonguide_localization_service_info_1));
	guide_localization_service_info_t* guide_localization_service_info_2 = guide_localization_service_info_parseFromJSON(jsonguide_localization_service_info_1);
	cJSON* jsonguide_localization_service_info_2 = guide_localization_service_info_convertToJSON(guide_localization_service_info_2);
	printf("repeating guide_localization_service_info:\n%s\n", cJSON_Print(jsonguide_localization_service_info_2));
}

int main() {
  test_guide_localization_service_info(1);
  test_guide_localization_service_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // guide_localization_service_info_MAIN
#endif // guide_localization_service_info_TEST
