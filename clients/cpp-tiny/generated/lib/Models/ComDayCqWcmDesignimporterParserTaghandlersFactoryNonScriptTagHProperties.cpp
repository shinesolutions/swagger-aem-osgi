

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::fromJson(std::string jsonObj)
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
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



