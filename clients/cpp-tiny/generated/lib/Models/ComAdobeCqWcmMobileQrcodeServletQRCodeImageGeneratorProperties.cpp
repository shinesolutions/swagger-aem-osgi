

#include "ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties.h"

using namespace Tiny;

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties()
{
	cqwcmqrcodeservletwhitelist = ConfigNodePropertyArray();
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::~ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties()
{

}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqwcmqrcodeservletwhitelistKey = "cq.wcm.qrcode.servlet.whitelist";

    if(object.has_key(cqwcmqrcodeservletwhitelistKey))
    {
        bourne::json value = object[cqwcmqrcodeservletwhitelistKey];




        ConfigNodePropertyArray* obj = &cqwcmqrcodeservletwhitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqwcmqrcodeservletwhitelist"] = getCqwcmqrcodeservletwhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::getCqwcmqrcodeservletwhitelist()
{
	return cqwcmqrcodeservletwhitelist;
}

void
ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties::setCqwcmqrcodeservletwhitelist(ConfigNodePropertyArray cqwcmqrcodeservletwhitelist)
{
	this->cqwcmqrcodeservletwhitelist = cqwcmqrcodeservletwhitelist;
}



