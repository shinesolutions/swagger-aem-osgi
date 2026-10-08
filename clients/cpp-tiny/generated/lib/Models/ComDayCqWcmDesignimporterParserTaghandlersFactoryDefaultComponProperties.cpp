

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



