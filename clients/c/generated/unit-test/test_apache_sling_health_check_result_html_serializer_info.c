#ifndef apache_sling_health_check_result_html_serializer_info_TEST
#define apache_sling_health_check_result_html_serializer_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define apache_sling_health_check_result_html_serializer_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/apache_sling_health_check_result_html_serializer_info.h"
apache_sling_health_check_result_html_serializer_info_t* instantiate_apache_sling_health_check_result_html_serializer_info(int include_optional);

#include "test_apache_sling_health_check_result_html_serializer_properties.c"


apache_sling_health_check_result_html_serializer_info_t* instantiate_apache_sling_health_check_result_html_serializer_info(int include_optional) {
  apache_sling_health_check_result_html_serializer_info_t* apache_sling_health_check_result_html_serializer_info = NULL;
  if (include_optional) {
    apache_sling_health_check_result_html_serializer_info = apache_sling_health_check_result_html_serializer_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_apache_sling_health_check_result_html_serializer_properties(0)
    );
  } else {
    apache_sling_health_check_result_html_serializer_info = apache_sling_health_check_result_html_serializer_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return apache_sling_health_check_result_html_serializer_info;
}


#ifdef apache_sling_health_check_result_html_serializer_info_MAIN

void test_apache_sling_health_check_result_html_serializer_info(int include_optional) {
    apache_sling_health_check_result_html_serializer_info_t* apache_sling_health_check_result_html_serializer_info_1 = instantiate_apache_sling_health_check_result_html_serializer_info(include_optional);

	cJSON* jsonapache_sling_health_check_result_html_serializer_info_1 = apache_sling_health_check_result_html_serializer_info_convertToJSON(apache_sling_health_check_result_html_serializer_info_1);
	printf("apache_sling_health_check_result_html_serializer_info :\n%s\n", cJSON_Print(jsonapache_sling_health_check_result_html_serializer_info_1));
	apache_sling_health_check_result_html_serializer_info_t* apache_sling_health_check_result_html_serializer_info_2 = apache_sling_health_check_result_html_serializer_info_parseFromJSON(jsonapache_sling_health_check_result_html_serializer_info_1);
	cJSON* jsonapache_sling_health_check_result_html_serializer_info_2 = apache_sling_health_check_result_html_serializer_info_convertToJSON(apache_sling_health_check_result_html_serializer_info_2);
	printf("repeating apache_sling_health_check_result_html_serializer_info:\n%s\n", cJSON_Print(jsonapache_sling_health_check_result_html_serializer_info_2));
}

int main() {
  test_apache_sling_health_check_result_html_serializer_info(1);
  test_apache_sling_health_check_result_html_serializer_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // apache_sling_health_check_result_html_serializer_info_MAIN
#endif // apache_sling_health_check_result_html_serializer_info_TEST
