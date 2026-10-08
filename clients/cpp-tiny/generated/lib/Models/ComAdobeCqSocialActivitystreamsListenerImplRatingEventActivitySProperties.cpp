

#include "ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties()
{
	ranking = ConfigNodePropertyInteger();
	enable = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::~ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties()
{

}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rankingKey = "ranking";

    if(object.has_key(rankingKey))
    {
        bourne::json value = object[rankingKey];




        ConfigNodePropertyInteger* obj = &ranking;
		obj->fromJson(value.dump());

    }

    const char *enableKey = "enable";

    if(object.has_key(enableKey))
    {
        bourne::json value = object[enableKey];




        ConfigNodePropertyBoolean* obj = &enable;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["ranking"] = getRanking().toJson();






	object["enable"] = getEnable().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::getRanking()
{
	return ranking;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::setRanking(ConfigNodePropertyInteger ranking)
{
	this->ranking = ranking;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties::setEnable(ConfigNodePropertyBoolean enable)
{
	this->enable = enable;
}



