

#include "ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.h"

using namespace Tiny;

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties()
{
	cqcontentsyncpathrewritertransformermappinglinks = ConfigNodePropertyArray();
	cqcontentsyncpathrewritertransformermappingclientlibs = ConfigNodePropertyArray();
	cqcontentsyncpathrewritertransformermappingimages = ConfigNodePropertyArray();
	cqcontentsyncpathrewritertransformerattributepattern = ConfigNodePropertyString();
	cqcontentsyncpathrewritertransformerclientlibrarypattern = ConfigNodePropertyString();
	cqcontentsyncpathrewritertransformerclientlibraryreplace = ConfigNodePropertyString();
}

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::~ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties()
{

}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqcontentsyncpathrewritertransformermappinglinksKey = "cq.contentsync.pathrewritertransformer.mapping.links";

    if(object.has_key(cqcontentsyncpathrewritertransformermappinglinksKey))
    {
        bourne::json value = object[cqcontentsyncpathrewritertransformermappinglinksKey];




        ConfigNodePropertyArray* obj = &cqcontentsyncpathrewritertransformermappinglinks;
		obj->fromJson(value.dump());

    }

    const char *cqcontentsyncpathrewritertransformermappingclientlibsKey = "cq.contentsync.pathrewritertransformer.mapping.clientlibs";

    if(object.has_key(cqcontentsyncpathrewritertransformermappingclientlibsKey))
    {
        bourne::json value = object[cqcontentsyncpathrewritertransformermappingclientlibsKey];




        ConfigNodePropertyArray* obj = &cqcontentsyncpathrewritertransformermappingclientlibs;
		obj->fromJson(value.dump());

    }

    const char *cqcontentsyncpathrewritertransformermappingimagesKey = "cq.contentsync.pathrewritertransformer.mapping.images";

    if(object.has_key(cqcontentsyncpathrewritertransformermappingimagesKey))
    {
        bourne::json value = object[cqcontentsyncpathrewritertransformermappingimagesKey];




        ConfigNodePropertyArray* obj = &cqcontentsyncpathrewritertransformermappingimages;
		obj->fromJson(value.dump());

    }

    const char *cqcontentsyncpathrewritertransformerattributepatternKey = "cq.contentsync.pathrewritertransformer.attribute.pattern";

    if(object.has_key(cqcontentsyncpathrewritertransformerattributepatternKey))
    {
        bourne::json value = object[cqcontentsyncpathrewritertransformerattributepatternKey];




        ConfigNodePropertyString* obj = &cqcontentsyncpathrewritertransformerattributepattern;
		obj->fromJson(value.dump());

    }

    const char *cqcontentsyncpathrewritertransformerclientlibrarypatternKey = "cq.contentsync.pathrewritertransformer.clientlibrary.pattern";

    if(object.has_key(cqcontentsyncpathrewritertransformerclientlibrarypatternKey))
    {
        bourne::json value = object[cqcontentsyncpathrewritertransformerclientlibrarypatternKey];




        ConfigNodePropertyString* obj = &cqcontentsyncpathrewritertransformerclientlibrarypattern;
		obj->fromJson(value.dump());

    }

    const char *cqcontentsyncpathrewritertransformerclientlibraryreplaceKey = "cq.contentsync.pathrewritertransformer.clientlibrary.replace";

    if(object.has_key(cqcontentsyncpathrewritertransformerclientlibraryreplaceKey))
    {
        bourne::json value = object[cqcontentsyncpathrewritertransformerclientlibraryreplaceKey];




        ConfigNodePropertyString* obj = &cqcontentsyncpathrewritertransformerclientlibraryreplace;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcontentsyncpathrewritertransformermappinglinks"] = getCqcontentsyncpathrewritertransformermappinglinks().toJson();






	object["cqcontentsyncpathrewritertransformermappingclientlibs"] = getCqcontentsyncpathrewritertransformermappingclientlibs().toJson();






	object["cqcontentsyncpathrewritertransformermappingimages"] = getCqcontentsyncpathrewritertransformermappingimages().toJson();






	object["cqcontentsyncpathrewritertransformerattributepattern"] = getCqcontentsyncpathrewritertransformerattributepattern().toJson();






	object["cqcontentsyncpathrewritertransformerclientlibrarypattern"] = getCqcontentsyncpathrewritertransformerclientlibrarypattern().toJson();






	object["cqcontentsyncpathrewritertransformerclientlibraryreplace"] = getCqcontentsyncpathrewritertransformerclientlibraryreplace().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformermappinglinks()
{
	return cqcontentsyncpathrewritertransformermappinglinks;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformermappinglinks(ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappinglinks)
{
	this->cqcontentsyncpathrewritertransformermappinglinks = cqcontentsyncpathrewritertransformermappinglinks;
}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformermappingclientlibs()
{
	return cqcontentsyncpathrewritertransformermappingclientlibs;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformermappingclientlibs(ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingclientlibs)
{
	this->cqcontentsyncpathrewritertransformermappingclientlibs = cqcontentsyncpathrewritertransformermappingclientlibs;
}

ConfigNodePropertyArray
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformermappingimages()
{
	return cqcontentsyncpathrewritertransformermappingimages;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformermappingimages(ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingimages)
{
	this->cqcontentsyncpathrewritertransformermappingimages = cqcontentsyncpathrewritertransformermappingimages;
}

ConfigNodePropertyString
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformerattributepattern()
{
	return cqcontentsyncpathrewritertransformerattributepattern;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformerattributepattern(ConfigNodePropertyString cqcontentsyncpathrewritertransformerattributepattern)
{
	this->cqcontentsyncpathrewritertransformerattributepattern = cqcontentsyncpathrewritertransformerattributepattern;
}

ConfigNodePropertyString
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformerclientlibrarypattern()
{
	return cqcontentsyncpathrewritertransformerclientlibrarypattern;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformerclientlibrarypattern(ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibrarypattern)
{
	this->cqcontentsyncpathrewritertransformerclientlibrarypattern = cqcontentsyncpathrewritertransformerclientlibrarypattern;
}

ConfigNodePropertyString
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::getCqcontentsyncpathrewritertransformerclientlibraryreplace()
{
	return cqcontentsyncpathrewritertransformerclientlibraryreplace;
}

void
ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties::setCqcontentsyncpathrewritertransformerclientlibraryreplace(ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibraryreplace)
{
	this->cqcontentsyncpathrewritertransformerclientlibraryreplace = cqcontentsyncpathrewritertransformerclientlibraryreplace;
}



