

#include "ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties()
{
	cqdamdrmenable = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::~ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties()
{

}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamdrmenableKey = "cq.dam.drm.enable";

    if(object.has_key(cqdamdrmenableKey))
    {
        bourne::json value = object[cqdamdrmenableKey];




        ConfigNodePropertyBoolean* obj = &cqdamdrmenable;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamdrmenable"] = getCqdamdrmenable().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::getCqdamdrmenable()
{
	return cqdamdrmenable;
}

void
ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties::setCqdamdrmenable(ConfigNodePropertyBoolean cqdamdrmenable)
{
	this->cqdamdrmenable = cqdamdrmenable;
}



