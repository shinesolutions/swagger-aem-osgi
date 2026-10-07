

#include "ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.h"

using namespace Tiny;

ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::ComAdobeGraniteHttpcacheFileFileCacheStoreProperties()
{
	comadobegranitehttpcachefiledocumentRoot = ConfigNodePropertyString();
	comadobegranitehttpcachefileincludeHost = ConfigNodePropertyString();
}

ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::~ComAdobeGraniteHttpcacheFileFileCacheStoreProperties()
{

}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobegranitehttpcachefiledocumentRootKey = "com.adobe.granite.httpcache.file.documentRoot";

    if(object.has_key(comadobegranitehttpcachefiledocumentRootKey))
    {
        bourne::json value = object[comadobegranitehttpcachefiledocumentRootKey];




        ConfigNodePropertyString* obj = &comadobegranitehttpcachefiledocumentRoot;
		obj->fromJson(value.dump());

    }

    const char *comadobegranitehttpcachefileincludeHostKey = "com.adobe.granite.httpcache.file.includeHost";

    if(object.has_key(comadobegranitehttpcachefileincludeHostKey))
    {
        bourne::json value = object[comadobegranitehttpcachefileincludeHostKey];




        ConfigNodePropertyString* obj = &comadobegranitehttpcachefileincludeHost;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobegranitehttpcachefiledocumentRoot"] = getComadobegranitehttpcachefiledocumentRoot().toJson();






	object["comadobegranitehttpcachefileincludeHost"] = getComadobegranitehttpcachefileincludeHost().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::getComadobegranitehttpcachefiledocumentRoot()
{
	return comadobegranitehttpcachefiledocumentRoot;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::setComadobegranitehttpcachefiledocumentRoot(ConfigNodePropertyString comadobegranitehttpcachefiledocumentRoot)
{
	this->comadobegranitehttpcachefiledocumentRoot = comadobegranitehttpcachefiledocumentRoot;
}

ConfigNodePropertyString
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::getComadobegranitehttpcachefileincludeHost()
{
	return comadobegranitehttpcachefileincludeHost;
}

void
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties::setComadobegranitehttpcachefileincludeHost(ConfigNodePropertyString comadobegranitehttpcachefileincludeHost)
{
	this->comadobegranitehttpcachefileincludeHost = comadobegranitehttpcachefileincludeHost;
}



