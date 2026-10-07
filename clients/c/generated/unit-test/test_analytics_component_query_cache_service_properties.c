#ifndef analytics_component_query_cache_service_properties_TEST
#define analytics_component_query_cache_service_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define analytics_component_query_cache_service_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/analytics_component_query_cache_service_properties.h"
analytics_component_query_cache_service_properties_t* instantiate_analytics_component_query_cache_service_properties(int include_optional);

#include "test_config_node_property_integer.c"


analytics_component_query_cache_service_properties_t* instantiate_analytics_component_query_cache_service_properties(int include_optional) {
  analytics_component_query_cache_service_properties_t* analytics_component_query_cache_service_properties = NULL;
  if (include_optional) {
    analytics_component_query_cache_service_properties = analytics_component_query_cache_service_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_integer(0)
    );
  } else {
    analytics_component_query_cache_service_properties = analytics_component_query_cache_service_properties_create(
      NULL
    );
  }

  return analytics_component_query_cache_service_properties;
}


#ifdef analytics_component_query_cache_service_properties_MAIN

void test_analytics_component_query_cache_service_properties(int include_optional) {
    analytics_component_query_cache_service_properties_t* analytics_component_query_cache_service_properties_1 = instantiate_analytics_component_query_cache_service_properties(include_optional);

	cJSON* jsonanalytics_component_query_cache_service_properties_1 = analytics_component_query_cache_service_properties_convertToJSON(analytics_component_query_cache_service_properties_1);
	printf("analytics_component_query_cache_service_properties :\n%s\n", cJSON_Print(jsonanalytics_component_query_cache_service_properties_1));
	analytics_component_query_cache_service_properties_t* analytics_component_query_cache_service_properties_2 = analytics_component_query_cache_service_properties_parseFromJSON(jsonanalytics_component_query_cache_service_properties_1);
	cJSON* jsonanalytics_component_query_cache_service_properties_2 = analytics_component_query_cache_service_properties_convertToJSON(analytics_component_query_cache_service_properties_2);
	printf("repeating analytics_component_query_cache_service_properties:\n%s\n", cJSON_Print(jsonanalytics_component_query_cache_service_properties_2));
}

int main() {
  test_analytics_component_query_cache_service_properties(1);
  test_analytics_component_query_cache_service_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // analytics_component_query_cache_service_properties_MAIN
#endif // analytics_component_query_cache_service_properties_TEST
