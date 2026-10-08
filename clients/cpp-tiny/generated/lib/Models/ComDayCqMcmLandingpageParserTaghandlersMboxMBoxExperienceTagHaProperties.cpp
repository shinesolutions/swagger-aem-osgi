

#include "ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::~ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::fromJson(std::string jsonObj)
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
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



