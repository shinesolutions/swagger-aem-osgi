

#include "ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.h"

using namespace Tiny;

ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties()
{
	inboximpltypeproviderregistrypaths = ConfigNodePropertyArray();
	inboximpltypeproviderlegacypaths = ConfigNodePropertyArray();
	inboximpltypeproviderdefaulturlfailureitem = ConfigNodePropertyString();
	inboximpltypeproviderdefaulturlworkitem = ConfigNodePropertyString();
	inboximpltypeproviderdefaulturltask = ConfigNodePropertyString();
}

ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::~ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties()
{

}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *inboximpltypeproviderregistrypathsKey = "inbox.impl.typeprovider.registrypaths";

    if(object.has_key(inboximpltypeproviderregistrypathsKey))
    {
        bourne::json value = object[inboximpltypeproviderregistrypathsKey];




        ConfigNodePropertyArray* obj = &inboximpltypeproviderregistrypaths;
		obj->fromJson(value.dump());

    }

    const char *inboximpltypeproviderlegacypathsKey = "inbox.impl.typeprovider.legacypaths";

    if(object.has_key(inboximpltypeproviderlegacypathsKey))
    {
        bourne::json value = object[inboximpltypeproviderlegacypathsKey];




        ConfigNodePropertyArray* obj = &inboximpltypeproviderlegacypaths;
		obj->fromJson(value.dump());

    }

    const char *inboximpltypeproviderdefaulturlfailureitemKey = "inbox.impl.typeprovider.defaulturl.failureitem";

    if(object.has_key(inboximpltypeproviderdefaulturlfailureitemKey))
    {
        bourne::json value = object[inboximpltypeproviderdefaulturlfailureitemKey];




        ConfigNodePropertyString* obj = &inboximpltypeproviderdefaulturlfailureitem;
		obj->fromJson(value.dump());

    }

    const char *inboximpltypeproviderdefaulturlworkitemKey = "inbox.impl.typeprovider.defaulturl.workitem";

    if(object.has_key(inboximpltypeproviderdefaulturlworkitemKey))
    {
        bourne::json value = object[inboximpltypeproviderdefaulturlworkitemKey];




        ConfigNodePropertyString* obj = &inboximpltypeproviderdefaulturlworkitem;
		obj->fromJson(value.dump());

    }

    const char *inboximpltypeproviderdefaulturltaskKey = "inbox.impl.typeprovider.defaulturl.task";

    if(object.has_key(inboximpltypeproviderdefaulturltaskKey))
    {
        bourne::json value = object[inboximpltypeproviderdefaulturltaskKey];




        ConfigNodePropertyString* obj = &inboximpltypeproviderdefaulturltask;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["inboximpltypeproviderregistrypaths"] = getInboximpltypeproviderregistrypaths().toJson();






	object["inboximpltypeproviderlegacypaths"] = getInboximpltypeproviderlegacypaths().toJson();






	object["inboximpltypeproviderdefaulturlfailureitem"] = getInboximpltypeproviderdefaulturlfailureitem().toJson();






	object["inboximpltypeproviderdefaulturlworkitem"] = getInboximpltypeproviderdefaulturlworkitem().toJson();






	object["inboximpltypeproviderdefaulturltask"] = getInboximpltypeproviderdefaulturltask().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderregistrypaths()
{
	return inboximpltypeproviderregistrypaths;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderregistrypaths(ConfigNodePropertyArray inboximpltypeproviderregistrypaths)
{
	this->inboximpltypeproviderregistrypaths = inboximpltypeproviderregistrypaths;
}

ConfigNodePropertyArray
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderlegacypaths()
{
	return inboximpltypeproviderlegacypaths;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderlegacypaths(ConfigNodePropertyArray inboximpltypeproviderlegacypaths)
{
	this->inboximpltypeproviderlegacypaths = inboximpltypeproviderlegacypaths;
}

ConfigNodePropertyString
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderdefaulturlfailureitem()
{
	return inboximpltypeproviderdefaulturlfailureitem;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderdefaulturlfailureitem(ConfigNodePropertyString inboximpltypeproviderdefaulturlfailureitem)
{
	this->inboximpltypeproviderdefaulturlfailureitem = inboximpltypeproviderdefaulturlfailureitem;
}

ConfigNodePropertyString
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderdefaulturlworkitem()
{
	return inboximpltypeproviderdefaulturlworkitem;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderdefaulturlworkitem(ConfigNodePropertyString inboximpltypeproviderdefaulturlworkitem)
{
	this->inboximpltypeproviderdefaulturlworkitem = inboximpltypeproviderdefaulturlworkitem;
}

ConfigNodePropertyString
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderdefaulturltask()
{
	return inboximpltypeproviderdefaulturltask;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderdefaulturltask(ConfigNodePropertyString inboximpltypeproviderdefaulturltask)
{
	this->inboximpltypeproviderdefaulturltask = inboximpltypeproviderdefaulturltask;
}



