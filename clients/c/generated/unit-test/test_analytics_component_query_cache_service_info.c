#ifndef analytics_component_query_cache_service_info_TEST
#define analytics_component_query_cache_service_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define analytics_component_query_cache_service_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/analytics_component_query_cache_service_info.h"
analytics_component_query_cache_service_info_t* instantiate_analytics_component_query_cache_service_info(int include_optional);

#include "test_analytics_component_query_cache_service_properties.c"


analytics_component_query_cache_service_info_t* instantiate_analytics_component_query_cache_service_info(int include_optional) {
  analytics_component_query_cache_service_info_t* analytics_component_query_cache_service_info = NULL;
  if (include_optional) {
    analytics_component_query_cache_service_info = analytics_component_query_cache_service_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_analytics_component_query_cache_service_properties(0)
    );
  } else {
    analytics_component_query_cache_service_info = analytics_component_query_cache_service_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return analytics_component_query_cache_service_info;
}


#ifdef analytics_component_query_cache_service_info_MAIN

void test_analytics_component_query_cache_service_info(int include_optional) {
    analytics_component_query_cache_service_info_t* analytics_component_query_cache_service_info_1 = instantiate_analytics_component_query_cache_service_info(include_optional);

	cJSON* jsonanalytics_component_query_cache_service_info_1 = analytics_component_query_cache_service_info_convertToJSON(analytics_component_query_cache_service_info_1);
	printf("analytics_component_query_cache_service_info :\n%s\n", cJSON_Print(jsonanalytics_component_query_cache_service_info_1));
	analytics_component_query_cache_service_info_t* analytics_component_query_cache_service_info_2 = analytics_component_query_cache_service_info_parseFromJSON(jsonanalytics_component_query_cache_service_info_1);
	cJSON* jsonanalytics_component_query_cache_service_info_2 = analytics_component_query_cache_service_info_convertToJSON(analytics_component_query_cache_service_info_2);
	printf("repeating analytics_component_query_cache_service_info:\n%s\n", cJSON_Print(jsonanalytics_component_query_cache_service_info_2));
}

int main() {
  test_analytics_component_query_cache_service_info(1);
  test_analytics_component_query_cache_service_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // analytics_component_query_cache_service_info_MAIN
#endif // analytics_component_query_cache_service_info_TEST
