

#include "ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.h"

using namespace Tiny;

ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties()
{
	pipelinetype = ConfigNodePropertyString();
}

ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::~ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties()
{

}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pipelinetypeKey = "pipeline.type";

    if(object.has_key(pipelinetypeKey))
    {
        bourne::json value = object[pipelinetypeKey];




        ConfigNodePropertyString* obj = &pipelinetype;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pipelinetype"] = getPipelinetype().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::getPipelinetype()
{
	return pipelinetype;
}

void
ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties::setPipelinetype(ConfigNodePropertyString pipelinetype)
{
	this->pipelinetype = pipelinetype;
}



