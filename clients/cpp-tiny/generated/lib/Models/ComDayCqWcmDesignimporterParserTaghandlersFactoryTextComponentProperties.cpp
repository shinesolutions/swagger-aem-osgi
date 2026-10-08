

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
	componentresourceType = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();






	object["componentresourceType"] = getComponentresourceType().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::getComponentresourceType()
{
	return componentresourceType;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties::setComponentresourceType(ConfigNodePropertyString componentresourceType)
{
	this->componentresourceType = componentresourceType;
}



