

#include "ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.h"

using namespace Tiny;

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties()
{
	isMemberCheck = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::~ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties()
{

}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *isMemberCheckKey = "isMemberCheck";

    if(object.has_key(isMemberCheckKey))
    {
        bourne::json value = object[isMemberCheckKey];




        ConfigNodePropertyBoolean* obj = &isMemberCheck;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["isMemberCheck"] = getIsMemberCheck().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::getIsMemberCheck()
{
	return isMemberCheck;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::setIsMemberCheck(ConfigNodePropertyBoolean isMemberCheck)
{
	this->isMemberCheck = isMemberCheck;
}



