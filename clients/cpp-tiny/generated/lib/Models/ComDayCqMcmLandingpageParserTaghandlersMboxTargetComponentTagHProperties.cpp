

#include "ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
	componentresourceType = ConfigNodePropertyString();
}

ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::~ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *tagpatternKey = "tagpattern";

    if(object.has_key(tagpatternKey))
    {
        bourne::json value = object[tagpatternKey];




        ConfigNodePropertyString* obj = &tagpattern;
		obj->fromJson(value.dump());

    }

    const char *componentresourceTypeKey = "component.resourceType";

    if(object.has_key(componentresourceTypeKey))
    {
        bourne::json value = object[componentresourceTypeKey];




        ConfigNodePropertyString* obj = &componentresourceType;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();






	object["componentresourceType"] = getComponentresourceType().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::getComponentresourceType()
{
	return componentresourceType;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties::setComponentresourceType(ConfigNodePropertyString componentresourceType)
{
	this->componentresourceType = componentresourceType;
}



