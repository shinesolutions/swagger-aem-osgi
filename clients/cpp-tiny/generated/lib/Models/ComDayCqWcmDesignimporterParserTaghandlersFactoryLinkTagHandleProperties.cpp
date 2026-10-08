

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::fromJson(std::string jsonObj)
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


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



