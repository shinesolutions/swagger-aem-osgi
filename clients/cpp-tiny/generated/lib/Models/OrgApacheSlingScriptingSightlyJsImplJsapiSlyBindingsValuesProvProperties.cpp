

#include "OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.h"

using namespace Tiny;

OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties()
{
	orgapacheslingscriptingsightlyjsbindings = ConfigNodePropertyArray();
}

OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::~OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties()
{

}

void
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslingscriptingsightlyjsbindingsKey = "org.apache.sling.scripting.sightly.js.bindings";

    if(object.has_key(orgapacheslingscriptingsightlyjsbindingsKey))
    {
        bourne::json value = object[orgapacheslingscriptingsightlyjsbindingsKey];




        ConfigNodePropertyArray* obj = &orgapacheslingscriptingsightlyjsbindings;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslingscriptingsightlyjsbindings"] = getOrgapacheslingscriptingsightlyjsbindings().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::getOrgapacheslingscriptingsightlyjsbindings()
{
	return orgapacheslingscriptingsightlyjsbindings;
}

void
OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties::setOrgapacheslingscriptingsightlyjsbindings(ConfigNodePropertyArray orgapacheslingscriptingsightlyjsbindings)
{
	this->orgapacheslingscriptingsightlyjsbindings = orgapacheslingscriptingsightlyjsbindings;
}



