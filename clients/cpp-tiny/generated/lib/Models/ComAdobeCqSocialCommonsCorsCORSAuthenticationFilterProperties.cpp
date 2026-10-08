

#include "ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties()
{
	corsenabling = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::~ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties()
{

}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *corsenablingKey = "cors.enabling";

    if(object.has_key(corsenablingKey))
    {
        bourne::json value = object[corsenablingKey];




        ConfigNodePropertyBoolean* obj = &corsenabling;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["corsenabling"] = getCorsenabling().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::getCorsenabling()
{
	return corsenabling;
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::setCorsenabling(ConfigNodePropertyBoolean corsenabling)
{
	this->corsenabling = corsenabling;
}



