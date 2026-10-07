

#include "ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.h"

using namespace Tiny;

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties()
{
	solrzktimeout = ConfigNodePropertyString();
	solrcommit = ConfigNodePropertyString();
	cacheon = ConfigNodePropertyBoolean();
	concurrencylevel = ConfigNodePropertyInteger();
	cachestartsize = ConfigNodePropertyInteger();
	cachettl = ConfigNodePropertyInteger();
	cachesize = ConfigNodePropertyInteger();
}

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::~ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties()
{

}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::toJson()
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
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getSolrzktimeout()
{
	return solrzktimeout;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setSolrzktimeout(ConfigNodePropertyString solrzktimeout)
{
	this->solrzktimeout = solrzktimeout;
}

ConfigNodePropertyString
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getSolrcommit()
{
	return solrcommit;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setSolrcommit(ConfigNodePropertyString solrcommit)
{
	this->solrcommit = solrcommit;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCacheon()
{
	return cacheon;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCacheon(ConfigNodePropertyBoolean cacheon)
{
	this->cacheon = cacheon;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getConcurrencylevel()
{
	return concurrencylevel;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setConcurrencylevel(ConfigNodePropertyInteger concurrencylevel)
{
	this->concurrencylevel = concurrencylevel;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCachestartsize()
{
	return cachestartsize;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCachestartsize(ConfigNodePropertyInteger cachestartsize)
{
	this->cachestartsize = cachestartsize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCachettl()
{
	return cachettl;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCachettl(ConfigNodePropertyInteger cachettl)
{
	this->cachettl = cachettl;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::getCachesize()
{
	return cachesize;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties::setCachesize(ConfigNodePropertyInteger cachesize)
{
	this->cachesize = cachesize;
}



