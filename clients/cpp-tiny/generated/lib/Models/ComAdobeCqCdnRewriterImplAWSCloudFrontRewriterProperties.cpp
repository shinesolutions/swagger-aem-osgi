

#include "ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.h"

using namespace Tiny;

ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	keypairid = ConfigNodePropertyString();
	keypairalias = ConfigNodePropertyString();
	cdnrewriterattributes = ConfigNodePropertyArray();
	cdnrewriterdistributiondomain = ConfigNodePropertyString();
}

ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::~ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties()
{

}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *keypairidKey = "keypair.id";

    if(object.has_key(keypairidKey))
    {
        bourne::json value = object[keypairidKey];




        ConfigNodePropertyString* obj = &keypairid;
		obj->fromJson(value.dump());

    }

    const char *keypairaliasKey = "keypair.alias";

    if(object.has_key(keypairaliasKey))
    {
        bourne::json value = object[keypairaliasKey];




        ConfigNodePropertyString* obj = &keypairalias;
		obj->fromJson(value.dump());

    }

    const char *cdnrewriterattributesKey = "cdnrewriter.attributes";

    if(object.has_key(cdnrewriterattributesKey))
    {
        bourne::json value = object[cdnrewriterattributesKey];




        ConfigNodePropertyArray* obj = &cdnrewriterattributes;
		obj->fromJson(value.dump());

    }

    const char *cdnrewriterdistributiondomainKey = "cdn.rewriter.distribution.domain";

    if(object.has_key(cdnrewriterdistributiondomainKey))
    {
        bourne::json value = object[cdnrewriterdistributiondomainKey];




        ConfigNodePropertyString* obj = &cdnrewriterdistributiondomain;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["keypairid"] = getKeypairid().toJson();






	object["keypairalias"] = getKeypairalias().toJson();






	object["cdnrewriterattributes"] = getCdnrewriterattributes().toJson();






	object["cdnrewriterdistributiondomain"] = getCdnrewriterdistributiondomain().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getKeypairid()
{
	return keypairid;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setKeypairid(ConfigNodePropertyString keypairid)
{
	this->keypairid = keypairid;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getKeypairalias()
{
	return keypairalias;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setKeypairalias(ConfigNodePropertyString keypairalias)
{
	this->keypairalias = keypairalias;
}

ConfigNodePropertyArray
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getCdnrewriterattributes()
{
	return cdnrewriterattributes;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setCdnrewriterattributes(ConfigNodePropertyArray cdnrewriterattributes)
{
	this->cdnrewriterattributes = cdnrewriterattributes;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getCdnrewriterdistributiondomain()
{
	return cdnrewriterdistributiondomain;
}

void
ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setCdnrewriterdistributiondomain(ConfigNodePropertyString cdnrewriterdistributiondomain)
{
	this->cdnrewriterdistributiondomain = cdnrewriterdistributiondomain;
}



