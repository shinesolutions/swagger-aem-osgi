

#include "ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::ComDayCqDamCoreImplServletDamContentDispositionFilterProperties()
{
	cqmimetypeblacklist = ConfigNodePropertyArray();
	cqdamemptymime = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::~ComDayCqDamCoreImplServletDamContentDispositionFilterProperties()
{

}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqmimetypeblacklistKey = "cq.mime.type.blacklist";

    if(object.has_key(cqmimetypeblacklistKey))
    {
        bourne::json value = object[cqmimetypeblacklistKey];




        ConfigNodePropertyArray* obj = &cqmimetypeblacklist;
		obj->fromJson(value.dump());

    }

    const char *cqdamemptymimeKey = "cq.dam.empty.mime";

    if(object.has_key(cqdamemptymimeKey))
    {
        bourne::json value = object[cqdamemptymimeKey];




        ConfigNodePropertyBoolean* obj = &cqdamemptymime;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqmimetypeblacklist"] = getCqmimetypeblacklist().toJson();






	object["cqdamemptymime"] = getCqdamemptymime().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::getCqmimetypeblacklist()
{
	return cqmimetypeblacklist;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::setCqmimetypeblacklist(ConfigNodePropertyArray cqmimetypeblacklist)
{
	this->cqmimetypeblacklist = cqmimetypeblacklist;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::getCqdamemptymime()
{
	return cqdamemptymime;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::setCqdamemptymime(ConfigNodePropertyBoolean cqdamemptymime)
{
	this->cqdamemptymime = cqdamemptymime;
}



