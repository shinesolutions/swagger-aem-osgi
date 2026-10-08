

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
	componentresourceType = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();






	object["componentresourceType"] = getComponentresourceType().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::getComponentresourceType()
{
	return componentresourceType;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties::setComponentresourceType(ConfigNodePropertyString componentresourceType)
{
	this->componentresourceType = componentresourceType;
}



