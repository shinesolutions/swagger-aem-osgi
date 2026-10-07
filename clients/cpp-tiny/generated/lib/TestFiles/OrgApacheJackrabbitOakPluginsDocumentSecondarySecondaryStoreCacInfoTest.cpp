
#include "OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo_pid_is_assigned_from_json()
{


    bourne::json input =
    {
        "pid", "hello"
    };

    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPid().c_str());






}


void test_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo_title_is_assigned_from_json()
{


    bourne::json input =
    {
        "title", "hello"
    };

    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTitle().c_str());






}


void test_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}




void test_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo_pid_is_converted_to_json()
{

    bourne::json input =
    {
        "pid", "hello"
    };

    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pid"] == output["pid"]);



}


void test_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo_title_is_converted_to_json()
{

    bourne::json input =
    {
        "title", "hello"
    };

    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["title"] == output["title"]);



}


void test_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



