

#include "ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.h"

using namespace Tiny;

ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties::ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties()
{
	pipelinetype = ConfigNodePropertyString();
}

ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties::ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties::~ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties()
{

}

void
ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties::fromJson(std::string jsonObj)
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
ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pipelinetype"] = getPipelinetype().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties::getPipelinetype()
{
	return pipelinetype;
}

void
ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties::setPipelinetype(ConfigNodePropertyString pipelinetype)
{
	this->pipelinetype = pipelinetype;
}



