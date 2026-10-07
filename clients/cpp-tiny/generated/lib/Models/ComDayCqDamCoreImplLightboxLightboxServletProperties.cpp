

#include "ComDayCqDamCoreImplLightboxLightboxServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplLightboxLightboxServletProperties::ComDayCqDamCoreImplLightboxLightboxServletProperties()
{
	slingservletpaths = ConfigNodePropertyString();
	slingservletmethods = ConfigNodePropertyArray();
	cqdamenableanonymous = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplLightboxLightboxServletProperties::ComDayCqDamCoreImplLightboxLightboxServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplLightboxLightboxServletProperties::~ComDayCqDamCoreImplLightboxLightboxServletProperties()
{

}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletpathsKey = "sling.servlet.paths";

    if(object.has_key(slingservletpathsKey))
    {
        bourne::json value = object[slingservletpathsKey];




        ConfigNodePropertyString* obj = &slingservletpaths;
		obj->fromJson(value.dump());

    }

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyArray* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }

    const char *cqdamenableanonymousKey = "cq.dam.enable.anonymous";

    if(object.has_key(cqdamenableanonymousKey))
    {
        bourne::json value = object[cqdamenableanonymousKey];




        ConfigNodePropertyBoolean* obj = &cqdamenableanonymous;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplLightboxLightboxServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletpaths"] = getSlingservletpaths().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();






	object["cqdamenableanonymous"] = getCqdamenableanonymous().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplLightboxLightboxServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::setSlingservletpaths(ConfigNodePropertyString slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplLightboxLightboxServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::setSlingservletmethods(ConfigNodePropertyArray slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplLightboxLightboxServletProperties::getCqdamenableanonymous()
{
	return cqdamenableanonymous;
}

void
ComDayCqDamCoreImplLightboxLightboxServletProperties::setCqdamenableanonymous(ConfigNodePropertyBoolean cqdamenableanonymous)
{
	this->cqdamenableanonymous = cqdamenableanonymous;
}



