#ifndef apache_sling_health_check_result_html_serializer_properties_TEST
#define apache_sling_health_check_result_html_serializer_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define apache_sling_health_check_result_html_serializer_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/apache_sling_health_check_result_html_serializer_properties.h"
apache_sling_health_check_result_html_serializer_properties_t* instantiate_apache_sling_health_check_result_html_serializer_properties(int include_optional);

#include "test_config_node_property_string.c"


apache_sling_health_check_result_html_serializer_properties_t* instantiate_apache_sling_health_check_result_html_serializer_properties(int include_optional) {
  apache_sling_health_check_result_html_serializer_properties_t* apache_sling_health_check_result_html_serializer_properties = NULL;
  if (include_optional) {
    apache_sling_health_check_result_html_serializer_properties = apache_sling_health_check_result_html_serializer_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0)
    );
  } else {
    apache_sling_health_check_result_html_serializer_properties = apache_sling_health_check_result_html_serializer_properties_create(
      NULL
    );
  }

  return apache_sling_health_check_result_html_serializer_properties;
}


#ifdef apache_sling_health_check_result_html_serializer_properties_MAIN

void test_apache_sling_health_check_result_html_serializer_properties(int include_optional) {
    apache_sling_health_check_result_html_serializer_properties_t* apache_sling_health_check_result_html_serializer_properties_1 = instantiate_apache_sling_health_check_result_html_serializer_properties(include_optional);

	cJSON* jsonapache_sling_health_check_result_html_serializer_properties_1 = apache_sling_health_check_result_html_serializer_properties_convertToJSON(apache_sling_health_check_result_html_serializer_properties_1);
	printf("apache_sling_health_check_result_html_serializer_properties :\n%s\n", cJSON_Print(jsonapache_sling_health_check_result_html_serializer_properties_1));
	apache_sling_health_check_result_html_serializer_properties_t* apache_sling_health_check_result_html_serializer_properties_2 = apache_sling_health_check_result_html_serializer_properties_parseFromJSON(jsonapache_sling_health_check_result_html_serializer_properties_1);
	cJSON* jsonapache_sling_health_check_result_html_serializer_properties_2 = apache_sling_health_check_result_html_serializer_properties_convertToJSON(apache_sling_health_check_result_html_serializer_properties_2);
	printf("repeating apache_sling_health_check_result_html_serializer_properties:\n%s\n", cJSON_Print(jsonapache_sling_health_check_result_html_serializer_properties_2));
}

int main() {
  test_apache_sling_health_check_result_html_serializer_properties(1);
  test_apache_sling_health_check_result_html_serializer_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // apache_sling_health_check_result_html_serializer_properties_MAIN
#endif // apache_sling_health_check_result_html_serializer_properties_TEST
