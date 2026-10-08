

#include "ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.h"

using namespace Tiny;

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties()
{
	cqcommercepromotionroot = ConfigNodePropertyString();
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::~ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties()
{

}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqcommercepromotionrootKey = "cq.commerce.promotion.root";

    if(object.has_key(cqcommercepromotionrootKey))
    {
        bourne::json value = object[cqcommercepromotionrootKey];




        ConfigNodePropertyString* obj = &cqcommercepromotionroot;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcommercepromotionroot"] = getCqcommercepromotionroot().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::getCqcommercepromotionroot()
{
	return cqcommercepromotionroot;
}

void
ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties::setCqcommercepromotionroot(ConfigNodePropertyString cqcommercepromotionroot)
{
	this->cqcommercepromotionroot = cqcommercepromotionroot;
}



