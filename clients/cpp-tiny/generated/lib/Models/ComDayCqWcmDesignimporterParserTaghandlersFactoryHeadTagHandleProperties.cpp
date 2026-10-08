

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



