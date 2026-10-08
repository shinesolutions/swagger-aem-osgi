

#include "ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
	componentresourceType = ConfigNodePropertyString();
}

ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::~ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::fromJson(std::string jsonObj)
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
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();






	object["componentresourceType"] = getComponentresourceType().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::getComponentresourceType()
{
	return componentresourceType;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties::setComponentresourceType(ConfigNodePropertyString componentresourceType)
{
	this->componentresourceType = componentresourceType;
}



