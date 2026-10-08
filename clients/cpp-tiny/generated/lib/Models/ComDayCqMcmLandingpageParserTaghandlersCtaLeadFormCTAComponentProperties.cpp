

#include "ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties.h"

using namespace Tiny;

ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	tagpattern = ConfigNodePropertyString();
}

ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::~ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties()
{

}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::fromJson(std::string jsonObj)
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
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["tagpattern"] = getTagpattern().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::getServiceranking()
{
	return serviceranking;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::getTagpattern()
{
	return tagpattern;
}

void
ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties::setTagpattern(ConfigNodePropertyString tagpattern)
{
	this->tagpattern = tagpattern;
}



