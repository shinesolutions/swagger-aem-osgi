

#include "ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties()
{
	ranking = ConfigNodePropertyInteger();
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::~ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties()
{

}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rankingKey = "ranking";

    if(object.has_key(rankingKey))
    {
        bourne::json value = object[rankingKey];




        ConfigNodePropertyInteger* obj = &ranking;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["ranking"] = getRanking().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::getRanking()
{
	return ranking;
}

void
ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties::setRanking(ConfigNodePropertyInteger ranking)
{
	this->ranking = ranking;
}



