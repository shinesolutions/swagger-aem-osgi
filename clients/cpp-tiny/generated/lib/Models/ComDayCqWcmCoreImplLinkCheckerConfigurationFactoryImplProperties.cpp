

#include "ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties()
{
	linkexpiredprefix = ConfigNodePropertyString();
	linkexpiredremove = ConfigNodePropertyBoolean();
	linkexpiredsuffix = ConfigNodePropertyString();
	linkinvalidprefix = ConfigNodePropertyString();
	linkinvalidremove = ConfigNodePropertyBoolean();
	linkinvalidsuffix = ConfigNodePropertyString();
	linkpredatedprefix = ConfigNodePropertyString();
	linkpredatedremove = ConfigNodePropertyBoolean();
	linkpredatedsuffix = ConfigNodePropertyString();
	linkwcmmodes = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::~ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties()
{

}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *linkexpiredprefixKey = "link.expired.prefix";

    if(object.has_key(linkexpiredprefixKey))
    {
        bourne::json value = object[linkexpiredprefixKey];




        ConfigNodePropertyString* obj = &linkexpiredprefix;
		obj->fromJson(value.dump());

    }

    const char *linkexpiredremoveKey = "link.expired.remove";

    if(object.has_key(linkexpiredremoveKey))
    {
        bourne::json value = object[linkexpiredremoveKey];




        ConfigNodePropertyBoolean* obj = &linkexpiredremove;
		obj->fromJson(value.dump());

    }

    const char *linkexpiredsuffixKey = "link.expired.suffix";

    if(object.has_key(linkexpiredsuffixKey))
    {
        bourne::json value = object[linkexpiredsuffixKey];




        ConfigNodePropertyString* obj = &linkexpiredsuffix;
		obj->fromJson(value.dump());

    }

    const char *linkinvalidprefixKey = "link.invalid.prefix";

    if(object.has_key(linkinvalidprefixKey))
    {
        bourne::json value = object[linkinvalidprefixKey];




        ConfigNodePropertyString* obj = &linkinvalidprefix;
		obj->fromJson(value.dump());

    }

    const char *linkinvalidremoveKey = "link.invalid.remove";

    if(object.has_key(linkinvalidremoveKey))
    {
        bourne::json value = object[linkinvalidremoveKey];




        ConfigNodePropertyBoolean* obj = &linkinvalidremove;
		obj->fromJson(value.dump());

    }

    const char *linkinvalidsuffixKey = "link.invalid.suffix";

    if(object.has_key(linkinvalidsuffixKey))
    {
        bourne::json value = object[linkinvalidsuffixKey];




        ConfigNodePropertyString* obj = &linkinvalidsuffix;
		obj->fromJson(value.dump());

    }

    const char *linkpredatedprefixKey = "link.predated.prefix";

    if(object.has_key(linkpredatedprefixKey))
    {
        bourne::json value = object[linkpredatedprefixKey];




        ConfigNodePropertyString* obj = &linkpredatedprefix;
		obj->fromJson(value.dump());

    }

    const char *linkpredatedremoveKey = "link.predated.remove";

    if(object.has_key(linkpredatedremoveKey))
    {
        bourne::json value = object[linkpredatedremoveKey];




        ConfigNodePropertyBoolean* obj = &linkpredatedremove;
		obj->fromJson(value.dump());

    }

    const char *linkpredatedsuffixKey = "link.predated.suffix";

    if(object.has_key(linkpredatedsuffixKey))
    {
        bourne::json value = object[linkpredatedsuffixKey];




        ConfigNodePropertyString* obj = &linkpredatedsuffix;
		obj->fromJson(value.dump());

    }

    const char *linkwcmmodesKey = "link.wcmmodes";

    if(object.has_key(linkwcmmodesKey))
    {
        bourne::json value = object[linkwcmmodesKey];




        ConfigNodePropertyArray* obj = &linkwcmmodes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["linkexpiredprefix"] = getLinkexpiredprefix().toJson();






	object["linkexpiredremove"] = getLinkexpiredremove().toJson();






	object["linkexpiredsuffix"] = getLinkexpiredsuffix().toJson();






	object["linkinvalidprefix"] = getLinkinvalidprefix().toJson();






	object["linkinvalidremove"] = getLinkinvalidremove().toJson();






	object["linkinvalidsuffix"] = getLinkinvalidsuffix().toJson();






	object["linkpredatedprefix"] = getLinkpredatedprefix().toJson();






	object["linkpredatedremove"] = getLinkpredatedremove().toJson();






	object["linkpredatedsuffix"] = getLinkpredatedsuffix().toJson();






	object["linkwcmmodes"] = getLinkwcmmodes().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkexpiredprefix()
{
	return linkexpiredprefix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkexpiredprefix(ConfigNodePropertyString linkexpiredprefix)
{
	this->linkexpiredprefix = linkexpiredprefix;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkexpiredremove()
{
	return linkexpiredremove;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkexpiredremove(ConfigNodePropertyBoolean linkexpiredremove)
{
	this->linkexpiredremove = linkexpiredremove;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkexpiredsuffix()
{
	return linkexpiredsuffix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkexpiredsuffix(ConfigNodePropertyString linkexpiredsuffix)
{
	this->linkexpiredsuffix = linkexpiredsuffix;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkinvalidprefix()
{
	return linkinvalidprefix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkinvalidprefix(ConfigNodePropertyString linkinvalidprefix)
{
	this->linkinvalidprefix = linkinvalidprefix;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkinvalidremove()
{
	return linkinvalidremove;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkinvalidremove(ConfigNodePropertyBoolean linkinvalidremove)
{
	this->linkinvalidremove = linkinvalidremove;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkinvalidsuffix()
{
	return linkinvalidsuffix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkinvalidsuffix(ConfigNodePropertyString linkinvalidsuffix)
{
	this->linkinvalidsuffix = linkinvalidsuffix;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkpredatedprefix()
{
	return linkpredatedprefix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkpredatedprefix(ConfigNodePropertyString linkpredatedprefix)
{
	this->linkpredatedprefix = linkpredatedprefix;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkpredatedremove()
{
	return linkpredatedremove;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkpredatedremove(ConfigNodePropertyBoolean linkpredatedremove)
{
	this->linkpredatedremove = linkpredatedremove;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkpredatedsuffix()
{
	return linkpredatedsuffix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkpredatedsuffix(ConfigNodePropertyString linkpredatedsuffix)
{
	this->linkpredatedsuffix = linkpredatedsuffix;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkwcmmodes()
{
	return linkwcmmodes;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkwcmmodes(ConfigNodePropertyArray linkwcmmodes)
{
	this->linkwcmmodes = linkwcmmodes;
}



