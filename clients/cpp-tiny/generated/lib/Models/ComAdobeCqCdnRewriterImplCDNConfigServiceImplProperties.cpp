

#include "ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties()
{
	cdnconfigdistributiondomain = ConfigNodePropertyString();
	cdnconfigenablerewriting = ConfigNodePropertyBoolean();
	cdnconfigpathprefixes = ConfigNodePropertyArray();
	cdnconfigcdnttl = ConfigNodePropertyInteger();
	cdnconfigapplicationprotocol = ConfigNodePropertyString();
}

ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::~ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties()
{

}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cdnconfigdistributiondomainKey = "cdn.config.distribution.domain";

    if(object.has_key(cdnconfigdistributiondomainKey))
    {
        bourne::json value = object[cdnconfigdistributiondomainKey];




        ConfigNodePropertyString* obj = &cdnconfigdistributiondomain;
		obj->fromJson(value.dump());

    }

    const char *cdnconfigenablerewritingKey = "cdn.config.enable.rewriting";

    if(object.has_key(cdnconfigenablerewritingKey))
    {
        bourne::json value = object[cdnconfigenablerewritingKey];




        ConfigNodePropertyBoolean* obj = &cdnconfigenablerewriting;
		obj->fromJson(value.dump());

    }

    const char *cdnconfigpathprefixesKey = "cdn.config.path.prefixes";

    if(object.has_key(cdnconfigpathprefixesKey))
    {
        bourne::json value = object[cdnconfigpathprefixesKey];




        ConfigNodePropertyArray* obj = &cdnconfigpathprefixes;
		obj->fromJson(value.dump());

    }

    const char *cdnconfigcdnttlKey = "cdn.config.cdnttl";

    if(object.has_key(cdnconfigcdnttlKey))
    {
        bourne::json value = object[cdnconfigcdnttlKey];




        ConfigNodePropertyInteger* obj = &cdnconfigcdnttl;
		obj->fromJson(value.dump());

    }

    const char *cdnconfigapplicationprotocolKey = "cdn.config.application.protocol";

    if(object.has_key(cdnconfigapplicationprotocolKey))
    {
        bourne::json value = object[cdnconfigapplicationprotocolKey];




        ConfigNodePropertyString* obj = &cdnconfigapplicationprotocol;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cdnconfigdistributiondomain"] = getCdnconfigdistributiondomain().toJson();






	object["cdnconfigenablerewriting"] = getCdnconfigenablerewriting().toJson();






	object["cdnconfigpathprefixes"] = getCdnconfigpathprefixes().toJson();






	object["cdnconfigcdnttl"] = getCdnconfigcdnttl().toJson();






	object["cdnconfigapplicationprotocol"] = getCdnconfigapplicationprotocol().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigdistributiondomain()
{
	return cdnconfigdistributiondomain;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigdistributiondomain(ConfigNodePropertyString cdnconfigdistributiondomain)
{
	this->cdnconfigdistributiondomain = cdnconfigdistributiondomain;
}

ConfigNodePropertyBoolean
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigenablerewriting()
{
	return cdnconfigenablerewriting;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigenablerewriting(ConfigNodePropertyBoolean cdnconfigenablerewriting)
{
	this->cdnconfigenablerewriting = cdnconfigenablerewriting;
}

ConfigNodePropertyArray
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigpathprefixes()
{
	return cdnconfigpathprefixes;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigpathprefixes(ConfigNodePropertyArray cdnconfigpathprefixes)
{
	this->cdnconfigpathprefixes = cdnconfigpathprefixes;
}

ConfigNodePropertyInteger
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigcdnttl()
{
	return cdnconfigcdnttl;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigcdnttl(ConfigNodePropertyInteger cdnconfigcdnttl)
{
	this->cdnconfigcdnttl = cdnconfigcdnttl;
}

ConfigNodePropertyString
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::getCdnconfigapplicationprotocol()
{
	return cdnconfigapplicationprotocol;
}

void
ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties::setCdnconfigapplicationprotocol(ConfigNodePropertyString cdnconfigapplicationprotocol)
{
	this->cdnconfigapplicationprotocol = cdnconfigapplicationprotocol;
}



