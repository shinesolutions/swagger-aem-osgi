
#include "ConfigNodePropertyFloat.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ConfigNodePropertyFloat_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ConfigNodePropertyFloat obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_ConfigNodePropertyFloat_optional_is_assigned_from_json()
{




    bourne::json input =
    {
        "optional", true
    };

    ConfigNodePropertyFloat obj(input.dump());

    TEST_ASSERT(true == obj.isOptional());




}


void test_ConfigNodePropertyFloat_is_set_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_set", true
    };

    ConfigNodePropertyFloat obj(input.dump());

    TEST_ASSERT(true == obj.isIsSet());




}


void test_ConfigNodePropertyFloat_type_is_assigned_from_json()
{
    bourne::json input =
    {
        "type", 1
    };

    ConfigNodePropertyFloat obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getType());








}


void test_ConfigNodePropertyFloat_value_is_assigned_from_json()
{








}


void test_ConfigNodePropertyFloat_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    ConfigNodePropertyFloat obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}



void test_ConfigNodePropertyFloat_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ConfigNodePropertyFloat obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_ConfigNodePropertyFloat_optional_is_converted_to_json()
{


    bourne::json input =
    {
        "optional", true
    };

    ConfigNodePropertyFloat obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["optional"] == output["optional"]);


}


void test_ConfigNodePropertyFloat_is_set_is_converted_to_json()
{


    bourne::json input =
    {
        "is_set", true
    };

    ConfigNodePropertyFloat obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_set"] == output["is_set"]);


}


void test_ConfigNodePropertyFloat_type_is_converted_to_json()
{
    bourne::json input =
    {
        "type", 1
    };

    ConfigNodePropertyFloat obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);




}


void test_ConfigNodePropertyFloat_value_is_converted_to_json()
{




}


void test_ConfigNodePropertyFloat_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    ConfigNodePropertyFloat obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


