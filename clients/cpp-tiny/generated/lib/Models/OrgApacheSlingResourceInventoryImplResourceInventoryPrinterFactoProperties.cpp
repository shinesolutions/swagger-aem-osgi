

#include "OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.h"

using namespace Tiny;

OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties()
{
	felixinventoryprintername = ConfigNodePropertyString();
	felixinventoryprintertitle = ConfigNodePropertyString();
	path = ConfigNodePropertyString();
}

OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::~OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties()
{

}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *felixinventoryprinternameKey = "felix.inventory.printer.name";

    if(object.has_key(felixinventoryprinternameKey))
    {
        bourne::json value = object[felixinventoryprinternameKey];




        ConfigNodePropertyString* obj = &felixinventoryprintername;
		obj->fromJson(value.dump());

    }

    const char *felixinventoryprintertitleKey = "felix.inventory.printer.title";

    if(object.has_key(felixinventoryprintertitleKey))
    {
        bourne::json value = object[felixinventoryprintertitleKey];




        ConfigNodePropertyString* obj = &felixinventoryprintertitle;
		obj->fromJson(value.dump());

    }

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["felixinventoryprintername"] = getFelixinventoryprintername().toJson();






	object["felixinventoryprintertitle"] = getFelixinventoryprintertitle().toJson();






	object["path"] = getPath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getFelixinventoryprintername()
{
	return felixinventoryprintername;
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setFelixinventoryprintername(ConfigNodePropertyString felixinventoryprintername)
{
	this->felixinventoryprintername = felixinventoryprintername;
}

ConfigNodePropertyString
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getFelixinventoryprintertitle()
{
	return felixinventoryprintertitle;
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setFelixinventoryprintertitle(ConfigNodePropertyString felixinventoryprintertitle)
{
	this->felixinventoryprintertitle = felixinventoryprintertitle;
}

ConfigNodePropertyString
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getPath()
{
	return path;
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}



