

#include "ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties.h"

using namespace Tiny;

ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties::ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties()
{
	hctags = ConfigNodePropertyArray();
}

ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties::ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties::~ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties()
{

}

void
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}



