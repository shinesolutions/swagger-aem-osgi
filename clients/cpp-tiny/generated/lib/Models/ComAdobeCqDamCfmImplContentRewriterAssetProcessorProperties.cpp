

#include "ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.h"

using namespace Tiny;

ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties::ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties()
{
	pipelinetype = ConfigNodePropertyString();
}

ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties::ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties::~ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties()
{

}

void
ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties::fromJson(std::string jsonObj)
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
ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pipelinetype"] = getPipelinetype().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties::getPipelinetype()
{
	return pipelinetype;
}

void
ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties::setPipelinetype(ConfigNodePropertyString pipelinetype)
{
	this->pipelinetype = pipelinetype;
}



