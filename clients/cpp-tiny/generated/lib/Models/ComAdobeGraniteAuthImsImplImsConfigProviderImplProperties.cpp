

#include "ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties()
{
	oauthconfigmanagerimsconfigid = ConfigNodePropertyString();
	imsowningEntity = ConfigNodePropertyString();
	aeminstanceId = ConfigNodePropertyString();
	imsserviceCode = ConfigNodePropertyString();
}

ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::~ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties()
{

}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthconfigmanagerimsconfigidKey = "oauth.configmanager.ims.configid";

    if(object.has_key(oauthconfigmanagerimsconfigidKey))
    {
        bourne::json value = object[oauthconfigmanagerimsconfigidKey];




        ConfigNodePropertyString* obj = &oauthconfigmanagerimsconfigid;
		obj->fromJson(value.dump());

    }

    const char *imsowningEntityKey = "ims.owningEntity";

    if(object.has_key(imsowningEntityKey))
    {
        bourne::json value = object[imsowningEntityKey];




        ConfigNodePropertyString* obj = &imsowningEntity;
		obj->fromJson(value.dump());

    }

    const char *aeminstanceIdKey = "aem.instanceId";

    if(object.has_key(aeminstanceIdKey))
    {
        bourne::json value = object[aeminstanceIdKey];




        ConfigNodePropertyString* obj = &aeminstanceId;
		obj->fromJson(value.dump());

    }

    const char *imsserviceCodeKey = "ims.serviceCode";

    if(object.has_key(imsserviceCodeKey))
    {
        bourne::json value = object[imsserviceCodeKey];




        ConfigNodePropertyString* obj = &imsserviceCode;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthconfigmanagerimsconfigid"] = getOauthconfigmanagerimsconfigid().toJson();






	object["imsowningEntity"] = getImsowningEntity().toJson();






	object["aeminstanceId"] = getAeminstanceId().toJson();






	object["imsserviceCode"] = getImsserviceCode().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getOauthconfigmanagerimsconfigid()
{
	return oauthconfigmanagerimsconfigid;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setOauthconfigmanagerimsconfigid(ConfigNodePropertyString oauthconfigmanagerimsconfigid)
{
	this->oauthconfigmanagerimsconfigid = oauthconfigmanagerimsconfigid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getImsowningEntity()
{
	return imsowningEntity;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setImsowningEntity(ConfigNodePropertyString imsowningEntity)
{
	this->imsowningEntity = imsowningEntity;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getAeminstanceId()
{
	return aeminstanceId;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setAeminstanceId(ConfigNodePropertyString aeminstanceId)
{
	this->aeminstanceId = aeminstanceId;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::getImsserviceCode()
{
	return imsserviceCode;
}

void
ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties::setImsserviceCode(ConfigNodePropertyString imsserviceCode)
{
	this->imsserviceCode = imsserviceCode;
}



