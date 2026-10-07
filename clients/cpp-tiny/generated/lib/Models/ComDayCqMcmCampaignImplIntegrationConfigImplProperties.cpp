

#include "ComDayCqMcmCampaignImplIntegrationConfigImplProperties.h"

using namespace Tiny;

ComDayCqMcmCampaignImplIntegrationConfigImplProperties::ComDayCqMcmCampaignImplIntegrationConfigImplProperties()
{
	aemmcmcampaignformConstraints = ConfigNodePropertyArray();
	aemmcmcampaignpublicUrl = ConfigNodePropertyString();
	aemmcmcampaignrelaxedSSL = ConfigNodePropertyBoolean();
}

ComDayCqMcmCampaignImplIntegrationConfigImplProperties::ComDayCqMcmCampaignImplIntegrationConfigImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmCampaignImplIntegrationConfigImplProperties::~ComDayCqMcmCampaignImplIntegrationConfigImplProperties()
{

}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aemmcmcampaignformConstraintsKey = "aem.mcm.campaign.formConstraints";

    if(object.has_key(aemmcmcampaignformConstraintsKey))
    {
        bourne::json value = object[aemmcmcampaignformConstraintsKey];




        ConfigNodePropertyArray* obj = &aemmcmcampaignformConstraints;
		obj->fromJson(value.dump());

    }

    const char *aemmcmcampaignpublicUrlKey = "aem.mcm.campaign.publicUrl";

    if(object.has_key(aemmcmcampaignpublicUrlKey))
    {
        bourne::json value = object[aemmcmcampaignpublicUrlKey];




        ConfigNodePropertyString* obj = &aemmcmcampaignpublicUrl;
		obj->fromJson(value.dump());

    }

    const char *aemmcmcampaignrelaxedSSLKey = "aem.mcm.campaign.relaxedSSL";

    if(object.has_key(aemmcmcampaignrelaxedSSLKey))
    {
        bourne::json value = object[aemmcmcampaignrelaxedSSLKey];




        ConfigNodePropertyBoolean* obj = &aemmcmcampaignrelaxedSSL;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["aemmcmcampaignformConstraints"] = getAemmcmcampaignformConstraints().toJson();






	object["aemmcmcampaignpublicUrl"] = getAemmcmcampaignpublicUrl().toJson();






	object["aemmcmcampaignrelaxedSSL"] = getAemmcmcampaignrelaxedSSL().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::getAemmcmcampaignformConstraints()
{
	return aemmcmcampaignformConstraints;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::setAemmcmcampaignformConstraints(ConfigNodePropertyArray aemmcmcampaignformConstraints)
{
	this->aemmcmcampaignformConstraints = aemmcmcampaignformConstraints;
}

ConfigNodePropertyString
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::getAemmcmcampaignpublicUrl()
{
	return aemmcmcampaignpublicUrl;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::setAemmcmcampaignpublicUrl(ConfigNodePropertyString aemmcmcampaignpublicUrl)
{
	this->aemmcmcampaignpublicUrl = aemmcmcampaignpublicUrl;
}

ConfigNodePropertyBoolean
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::getAemmcmcampaignrelaxedSSL()
{
	return aemmcmcampaignrelaxedSSL;
}

void
ComDayCqMcmCampaignImplIntegrationConfigImplProperties::setAemmcmcampaignrelaxedSSL(ConfigNodePropertyBoolean aemmcmcampaignrelaxedSSL)
{
	this->aemmcmcampaignrelaxedSSL = aemmcmcampaignrelaxedSSL;
}



