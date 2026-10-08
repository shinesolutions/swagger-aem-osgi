

#include "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties()
{
	contextpath = ConfigNodePropertyString();
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contextpathKey = "context.path";

    if(object.has_key(contextpathKey))
    {
        bourne::json value = object[contextpathKey];




        ConfigNodePropertyString* obj = &contextpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["contextpath"] = getContextpath().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::getContextpath()
{
	return contextpath;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties::setContextpath(ConfigNodePropertyString contextpath)
{
	this->contextpath = contextpath;
}



