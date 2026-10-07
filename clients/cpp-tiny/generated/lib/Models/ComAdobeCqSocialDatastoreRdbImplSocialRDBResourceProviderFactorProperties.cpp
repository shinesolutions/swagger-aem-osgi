

#include "ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.h"

using namespace Tiny;

ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties()
{
	solrzktimeout = ConfigNodePropertyString();
	solrcommit = ConfigNodePropertyString();
	cacheon = ConfigNodePropertyBoolean();
	concurrencylevel = ConfigNodePropertyInteger();
	cachestartsize = ConfigNodePropertyInteger();
	cachettl = ConfigNodePropertyInteger();
	cachesize = ConfigNodePropertyInteger();
}

ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::~ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties()
{

}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *solrzktimeoutKey = "solr.zk.timeout";

    if(object.has_key(solrzktimeoutKey))
    {
        bourne::json value = object[solrzktimeoutKey];




        ConfigNodePropertyString* obj = &solrzktimeout;
		obj->fromJson(value.dump());

    }

    const char *solrcommitKey = "solr.commit";

    if(object.has_key(solrcommitKey))
    {
        bourne::json value = object[solrcommitKey];




        ConfigNodePropertyString* obj = &solrcommit;
		obj->fromJson(value.dump());

    }

    const char *cacheonKey = "cache.on";

    if(object.has_key(cacheonKey))
    {
        bourne::json value = object[cacheonKey];




        ConfigNodePropertyBoolean* obj = &cacheon;
		obj->fromJson(value.dump());

    }

    const char *concurrencylevelKey = "concurrency.level";

    if(object.has_key(concurrencylevelKey))
    {
        bourne::json value = object[concurrencylevelKey];




        ConfigNodePropertyInteger* obj = &concurrencylevel;
		obj->fromJson(value.dump());

    }

    const char *cachestartsizeKey = "cache.start.size";

    if(object.has_key(cachestartsizeKey))
    {
        bourne::json value = object[cachestartsizeKey];




        ConfigNodePropertyInteger* obj = &cachestartsize;
		obj->fromJson(value.dump());

    }

    const char *cachettlKey = "cache.ttl";

    if(object.has_key(cachettlKey))
    {
        bourne::json value = object[cachettlKey];




        ConfigNodePropertyInteger* obj = &cachettl;
		obj->fromJson(value.dump());

    }

    const char *cachesizeKey = "cache.size";

    if(object.has_key(cachesizeKey))
    {
        bourne::json value = object[cachesizeKey];




        ConfigNodePropertyInteger* obj = &cachesize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["solrzktimeout"] = getSolrzktimeout().toJson();






	object["solrcommit"] = getSolrcommit().toJson();






	object["cacheon"] = getCacheon().toJson();






	object["concurrencylevel"] = getConcurrencylevel().toJson();






	object["cachestartsize"] = getCachestartsize().toJson();






	object["cachettl"] = getCachettl().toJson();






	object["cachesize"] = getCachesize().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::getSolrzktimeout()
{
	return solrzktimeout;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::setSolrzktimeout(ConfigNodePropertyString solrzktimeout)
{
	this->solrzktimeout = solrzktimeout;
}

ConfigNodePropertyString
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::getSolrcommit()
{
	return solrcommit;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::setSolrcommit(ConfigNodePropertyString solrcommit)
{
	this->solrcommit = solrcommit;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::getCacheon()
{
	return cacheon;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::setCacheon(ConfigNodePropertyBoolean cacheon)
{
	this->cacheon = cacheon;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::getConcurrencylevel()
{
	return concurrencylevel;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::setConcurrencylevel(ConfigNodePropertyInteger concurrencylevel)
{
	this->concurrencylevel = concurrencylevel;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::getCachestartsize()
{
	return cachestartsize;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::setCachestartsize(ConfigNodePropertyInteger cachestartsize)
{
	this->cachestartsize = cachestartsize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::getCachettl()
{
	return cachettl;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::setCachettl(ConfigNodePropertyInteger cachettl)
{
	this->cachettl = cachettl;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::getCachesize()
{
	return cachesize;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties::setCachesize(ConfigNodePropertyInteger cachesize)
{
	this->cachesize = cachesize;
}



