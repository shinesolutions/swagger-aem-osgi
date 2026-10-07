

#include "OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.h"

using namespace Tiny;

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties()
{
	orgapacheslingscriptingjavascriptrhinooptLevel = ConfigNodePropertyInteger();
}

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::~OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties()
{

}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslingscriptingjavascriptrhinooptLevelKey = "org.apache.sling.scripting.javascript.rhino.optLevel";

    if(object.has_key(orgapacheslingscriptingjavascriptrhinooptLevelKey))
    {
        bourne::json value = object[orgapacheslingscriptingjavascriptrhinooptLevelKey];




        ConfigNodePropertyInteger* obj = &orgapacheslingscriptingjavascriptrhinooptLevel;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslingscriptingjavascriptrhinooptLevel"] = getOrgapacheslingscriptingjavascriptrhinooptLevel().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::getOrgapacheslingscriptingjavascriptrhinooptLevel()
{
	return orgapacheslingscriptingjavascriptrhinooptLevel;
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties::setOrgapacheslingscriptingjavascriptrhinooptLevel(ConfigNodePropertyInteger orgapacheslingscriptingjavascriptrhinooptLevel)
{
	this->orgapacheslingscriptingjavascriptrhinooptLevel = orgapacheslingscriptingjavascriptrhinooptLevel;
}



