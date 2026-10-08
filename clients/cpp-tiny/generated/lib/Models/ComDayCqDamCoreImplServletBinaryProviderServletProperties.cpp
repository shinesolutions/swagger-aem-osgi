

#include "ComDayCqDamCoreImplServletBinaryProviderServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletBinaryProviderServletProperties::ComDayCqDamCoreImplServletBinaryProviderServletProperties()
{
	slingservletresourceTypes = ConfigNodePropertyArray();
	slingservletmethods = ConfigNodePropertyArray();
	cqdamdrmenable = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplServletBinaryProviderServletProperties::ComDayCqDamCoreImplServletBinaryProviderServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletBinaryProviderServletProperties::~ComDayCqDamCoreImplServletBinaryProviderServletProperties()
{

}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletresourceTypesKey = "sling.servlet.resourceTypes";

    if(object.has_key(slingservletresourceTypesKey))
    {
        bourne::json value = object[slingservletresourceTypesKey];




        ConfigNodePropertyArray* obj = &slingservletresourceTypes;
		obj->fromJson(value.dump());

    }

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyArray* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }

    const char *cqdamdrmenableKey = "cq.dam.drm.enable";

    if(object.has_key(cqdamdrmenableKey))
    {
        bourne::json value = object[cqdamdrmenableKey];




        ConfigNodePropertyBoolean* obj = &cqdamdrmenable;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletBinaryProviderServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletresourceTypes"] = getSlingservletresourceTypes().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();






	object["cqdamdrmenable"] = getCqdamdrmenable().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBinaryProviderServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::setSlingservletresourceTypes(ConfigNodePropertyArray slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBinaryProviderServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::setSlingservletmethods(ConfigNodePropertyArray slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletBinaryProviderServletProperties::getCqdamdrmenable()
{
	return cqdamdrmenable;
}

void
ComDayCqDamCoreImplServletBinaryProviderServletProperties::setCqdamdrmenable(ConfigNodePropertyBoolean cqdamdrmenable)
{
	this->cqdamdrmenable = cqdamdrmenable;
}



