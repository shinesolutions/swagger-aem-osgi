

#include "ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.h"

using namespace Tiny;

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties()
{
	path = ConfigNodePropertyArray();
	serviceranking = ConfigNodePropertyInteger();
}

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::~ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties()
{

}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyArray* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::getPath()
{
	return path;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::setPath(ConfigNodePropertyArray path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



