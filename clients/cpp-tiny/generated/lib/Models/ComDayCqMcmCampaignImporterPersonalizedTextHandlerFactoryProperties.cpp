

#include "ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.h"

using namespace Tiny;

ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::~ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties()
{

}

void
ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::fromJson(std::string jsonObj)
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
ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



