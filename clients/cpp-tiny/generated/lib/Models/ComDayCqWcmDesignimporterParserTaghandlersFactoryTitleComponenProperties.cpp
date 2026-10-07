

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
	componentresourceType = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();






	object["componentresourceType"] = getComponentresourceType().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::getComponentresourceType()
{
	return componentresourceType;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties::setComponentresourceType(ConfigNodePropertyString componentresourceType)
{
	this->componentresourceType = componentresourceType;
}



