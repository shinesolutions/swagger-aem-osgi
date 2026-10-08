

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



