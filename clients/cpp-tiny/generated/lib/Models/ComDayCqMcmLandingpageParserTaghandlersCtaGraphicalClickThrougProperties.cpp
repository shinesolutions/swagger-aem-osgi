

#include "ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
	componentresourceType = ConfigNodePropertyString();
}

ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::~ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::fromJson(std::string jsonObj)
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
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();






	object["componentresourceType"] = getComponentresourceType().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::getComponentresourceType()
{
	return componentresourceType;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties::setComponentresourceType(ConfigNodePropertyString componentresourceType)
{
	this->componentresourceType = componentresourceType;
}



