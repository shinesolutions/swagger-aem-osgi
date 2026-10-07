#ifndef com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_TEST
#define com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info.h"
com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_t* instantiate_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info(int include_optional);

#include "test_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_properties.c"


com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_t* instantiate_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info(int include_optional) {
  com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_t* com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info = NULL;
  if (include_optional) {
    com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info = com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_properties(0)
    );
  } else {
    com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info = com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info;
}


#ifdef com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_MAIN

void test_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info(int include_optional) {
    com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_t* com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_1 = instantiate_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info(include_optional);

	cJSON* jsoncom_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_1 = com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_convertToJSON(com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_1);
	printf("com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info :\n%s\n", cJSON_Print(jsoncom_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_1));
	com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_t* com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_2 = com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_parseFromJSON(jsoncom_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_1);
	cJSON* jsoncom_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_2 = com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_convertToJSON(com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_2);
	printf("repeating com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info:\n%s\n", cJSON_Print(jsoncom_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_2));
}

int main() {
  test_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info(1);
  test_com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_MAIN
#endif // com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_info_TEST
