

#include "ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.h"

using namespace Tiny;

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties()
{
	versionid = ConfigNodePropertyString();
	cacheon = ConfigNodePropertyBoolean();
	concurrencylevel = ConfigNodePropertyInteger();
	cachestartsize = ConfigNodePropertyInteger();
	cachettl = ConfigNodePropertyInteger();
	cachesize = ConfigNodePropertyInteger();
	timelimit = ConfigNodePropertyInteger();
}

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::~ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties()
{

}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *versionidKey = "version.id";

    if(object.has_key(versionidKey))
    {
        bourne::json value = object[versionidKey];




        ConfigNodePropertyString* obj = &versionid;
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

    const char *timelimitKey = "time.limit";

    if(object.has_key(timelimitKey))
    {
        bourne::json value = object[timelimitKey];




        ConfigNodePropertyInteger* obj = &timelimit;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["versionid"] = getVersionid().toJson();






	object["cacheon"] = getCacheon().toJson();






	object["concurrencylevel"] = getConcurrencylevel().toJson();






	object["cachestartsize"] = getCachestartsize().toJson();






	object["cachettl"] = getCachettl().toJson();






	object["cachesize"] = getCachesize().toJson();






	object["timelimit"] = getTimelimit().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getVersionid()
{
	return versionid;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setVersionid(ConfigNodePropertyString versionid)
{
	this->versionid = versionid;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCacheon()
{
	return cacheon;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCacheon(ConfigNodePropertyBoolean cacheon)
{
	this->cacheon = cacheon;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getConcurrencylevel()
{
	return concurrencylevel;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setConcurrencylevel(ConfigNodePropertyInteger concurrencylevel)
{
	this->concurrencylevel = concurrencylevel;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCachestartsize()
{
	return cachestartsize;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCachestartsize(ConfigNodePropertyInteger cachestartsize)
{
	this->cachestartsize = cachestartsize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCachettl()
{
	return cachettl;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCachettl(ConfigNodePropertyInteger cachettl)
{
	this->cachettl = cachettl;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getCachesize()
{
	return cachesize;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setCachesize(ConfigNodePropertyInteger cachesize)
{
	this->cachesize = cachesize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::getTimelimit()
{
	return timelimit;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties::setTimelimit(ConfigNodePropertyInteger timelimit)
{
	this->timelimit = timelimit;
}



