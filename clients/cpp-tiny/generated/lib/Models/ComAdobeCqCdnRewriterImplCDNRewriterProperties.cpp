

#include "ComAdobeCqCdnRewriterImplCDNRewriterProperties.h"

using namespace Tiny;

ComAdobeCqCdnRewriterImplCDNRewriterProperties::ComAdobeCqCdnRewriterImplCDNRewriterProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	cdnrewriterattributes = ConfigNodePropertyArray();
	cdnrewriterdistributiondomain = ConfigNodePropertyString();
}

ComAdobeCqCdnRewriterImplCDNRewriterProperties::ComAdobeCqCdnRewriterImplCDNRewriterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCdnRewriterImplCDNRewriterProperties::~ComAdobeCqCdnRewriterImplCDNRewriterProperties()
{

}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
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
ComAdobeCqCdnRewriterImplCDNRewriterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["cdnrewriterattributes"] = getCdnrewriterattributes().toJson();






	object["cdnrewriterdistributiondomain"] = getCdnrewriterdistributiondomain().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqCdnRewriterImplCDNRewriterProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
ComAdobeCqCdnRewriterImplCDNRewriterProperties::getCdnrewriterattributes()
{
	return cdnrewriterattributes;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::setCdnrewriterattributes(ConfigNodePropertyArray cdnrewriterattributes)
{
	this->cdnrewriterattributes = cdnrewriterattributes;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplCDNRewriterProperties::getCdnrewriterdistributiondomain()
{
	return cdnrewriterdistributiondomain;
}

void
ComAdobeCqCdnRewriterImplCDNRewriterProperties::setCdnrewriterdistributiondomain(ConfigNodePropertyString cdnrewriterdistributiondomain)
{
	this->cdnrewriterdistributiondomain = cdnrewriterdistributiondomain;
}



