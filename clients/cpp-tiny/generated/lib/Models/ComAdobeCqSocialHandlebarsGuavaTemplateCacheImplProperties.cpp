

#include "ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties()
{
	parameterguavacacheenabled = ConfigNodePropertyBoolean();
	parameterguavacacheparams = ConfigNodePropertyString();
	parameterguavacachereload = ConfigNodePropertyBoolean();
	serviceranking = ConfigNodePropertyInteger();
}

ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::~ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties()
{

}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *parameterguavacacheenabledKey = "parameter.guava.cache.enabled";

    if(object.has_key(parameterguavacacheenabledKey))
    {
        bourne::json value = object[parameterguavacacheenabledKey];




        ConfigNodePropertyBoolean* obj = &parameterguavacacheenabled;
		obj->fromJson(value.dump());

    }

    const char *parameterguavacacheparamsKey = "parameter.guava.cache.params";

    if(object.has_key(parameterguavacacheparamsKey))
    {
        bourne::json value = object[parameterguavacacheparamsKey];




        ConfigNodePropertyString* obj = &parameterguavacacheparams;
		obj->fromJson(value.dump());

    }

    const char *parameterguavacachereloadKey = "parameter.guava.cache.reload";

    if(object.has_key(parameterguavacachereloadKey))
    {
        bourne::json value = object[parameterguavacachereloadKey];




        ConfigNodePropertyBoolean* obj = &parameterguavacachereload;
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
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["parameterguavacacheenabled"] = getParameterguavacacheenabled().toJson();






	object["parameterguavacacheparams"] = getParameterguavacacheparams().toJson();






	object["parameterguavacachereload"] = getParameterguavacachereload().toJson();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getParameterguavacacheenabled()
{
	return parameterguavacacheenabled;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setParameterguavacacheenabled(ConfigNodePropertyBoolean parameterguavacacheenabled)
{
	this->parameterguavacacheenabled = parameterguavacacheenabled;
}

ConfigNodePropertyString
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getParameterguavacacheparams()
{
	return parameterguavacacheparams;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setParameterguavacacheparams(ConfigNodePropertyString parameterguavacacheparams)
{
	this->parameterguavacacheparams = parameterguavacacheparams;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getParameterguavacachereload()
{
	return parameterguavacachereload;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setParameterguavacachereload(ConfigNodePropertyBoolean parameterguavacachereload)
{
	this->parameterguavacachereload = parameterguavacachereload;
}

ConfigNodePropertyInteger
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



