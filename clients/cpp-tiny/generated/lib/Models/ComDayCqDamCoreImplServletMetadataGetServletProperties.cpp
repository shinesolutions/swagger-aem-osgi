

#include "ComDayCqDamCoreImplServletMetadataGetServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletMetadataGetServletProperties::ComDayCqDamCoreImplServletMetadataGetServletProperties()
{
	slingservletresourceTypes = ConfigNodePropertyString();
	slingservletmethods = ConfigNodePropertyString();
	slingservletextensions = ConfigNodePropertyString();
	slingservletselectors = ConfigNodePropertyString();
}

ComDayCqDamCoreImplServletMetadataGetServletProperties::ComDayCqDamCoreImplServletMetadataGetServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletMetadataGetServletProperties::~ComDayCqDamCoreImplServletMetadataGetServletProperties()
{

}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletresourceTypesKey = "sling.servlet.resourceTypes";

    if(object.has_key(slingservletresourceTypesKey))
    {
        bourne::json value = object[slingservletresourceTypesKey];




        ConfigNodePropertyString* obj = &slingservletresourceTypes;
		obj->fromJson(value.dump());

    }

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyString* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }

    const char *slingservletextensionsKey = "sling.servlet.extensions";

    if(object.has_key(slingservletextensionsKey))
    {
        bourne::json value = object[slingservletextensionsKey];




        ConfigNodePropertyString* obj = &slingservletextensions;
		obj->fromJson(value.dump());

    }

    const char *slingservletselectorsKey = "sling.servlet.selectors";

    if(object.has_key(slingservletselectorsKey))
    {
        bourne::json value = object[slingservletselectorsKey];




        ConfigNodePropertyString* obj = &slingservletselectors;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletMetadataGetServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletresourceTypes"] = getSlingservletresourceTypes().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();






	object["slingservletextensions"] = getSlingservletextensions().toJson();






	object["slingservletselectors"] = getSlingservletselectors().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletresourceTypes(ConfigNodePropertyString slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletmethods(ConfigNodePropertyString slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletextensions()
{
	return slingservletextensions;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletextensions(ConfigNodePropertyString slingservletextensions)
{
	this->slingservletextensions = slingservletextensions;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletMetadataGetServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqDamCoreImplServletMetadataGetServletProperties::setSlingservletselectors(ConfigNodePropertyString slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}



