

#include "ComDayCqAuthImplCugCugSupportImplProperties.h"

using namespace Tiny;

ComDayCqAuthImplCugCugSupportImplProperties::ComDayCqAuthImplCugCugSupportImplProperties()
{
	cugexemptedprincipals = ConfigNodePropertyArray();
	cugenabled = ConfigNodePropertyBoolean();
	cugprincipalsregex = ConfigNodePropertyString();
	cugprincipalsreplacement = ConfigNodePropertyString();
}

ComDayCqAuthImplCugCugSupportImplProperties::ComDayCqAuthImplCugCugSupportImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAuthImplCugCugSupportImplProperties::~ComDayCqAuthImplCugCugSupportImplProperties()
{

}

void
ComDayCqAuthImplCugCugSupportImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cugexemptedprincipalsKey = "cug.exempted.principals";

    if(object.has_key(cugexemptedprincipalsKey))
    {
        bourne::json value = object[cugexemptedprincipalsKey];




        ConfigNodePropertyArray* obj = &cugexemptedprincipals;
		obj->fromJson(value.dump());

    }

    const char *cugenabledKey = "cug.enabled";

    if(object.has_key(cugenabledKey))
    {
        bourne::json value = object[cugenabledKey];




        ConfigNodePropertyBoolean* obj = &cugenabled;
		obj->fromJson(value.dump());

    }

    const char *cugprincipalsregexKey = "cug.principals.regex";

    if(object.has_key(cugprincipalsregexKey))
    {
        bourne::json value = object[cugprincipalsregexKey];




        ConfigNodePropertyString* obj = &cugprincipalsregex;
		obj->fromJson(value.dump());

    }

    const char *cugprincipalsreplacementKey = "cug.principals.replacement";

    if(object.has_key(cugprincipalsreplacementKey))
    {
        bourne::json value = object[cugprincipalsreplacementKey];




        ConfigNodePropertyString* obj = &cugprincipalsreplacement;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAuthImplCugCugSupportImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cugexemptedprincipals"] = getCugexemptedprincipals().toJson();






	object["cugenabled"] = getCugenabled().toJson();






	object["cugprincipalsregex"] = getCugprincipalsregex().toJson();






	object["cugprincipalsreplacement"] = getCugprincipalsreplacement().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqAuthImplCugCugSupportImplProperties::getCugexemptedprincipals()
{
	return cugexemptedprincipals;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugexemptedprincipals(ConfigNodePropertyArray cugexemptedprincipals)
{
	this->cugexemptedprincipals = cugexemptedprincipals;
}

ConfigNodePropertyBoolean
ComDayCqAuthImplCugCugSupportImplProperties::getCugenabled()
{
	return cugenabled;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugenabled(ConfigNodePropertyBoolean cugenabled)
{
	this->cugenabled = cugenabled;
}

ConfigNodePropertyString
ComDayCqAuthImplCugCugSupportImplProperties::getCugprincipalsregex()
{
	return cugprincipalsregex;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugprincipalsregex(ConfigNodePropertyString cugprincipalsregex)
{
	this->cugprincipalsregex = cugprincipalsregex;
}

ConfigNodePropertyString
ComDayCqAuthImplCugCugSupportImplProperties::getCugprincipalsreplacement()
{
	return cugprincipalsreplacement;
}

void
ComDayCqAuthImplCugCugSupportImplProperties::setCugprincipalsreplacement(ConfigNodePropertyString cugprincipalsreplacement)
{
	this->cugprincipalsreplacement = cugprincipalsreplacement;
}



