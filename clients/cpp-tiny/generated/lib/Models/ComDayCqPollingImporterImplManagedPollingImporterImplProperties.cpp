

#include "ComDayCqPollingImporterImplManagedPollingImporterImplProperties.h"

using namespace Tiny;

ComDayCqPollingImporterImplManagedPollingImporterImplProperties::ComDayCqPollingImporterImplManagedPollingImporterImplProperties()
{
	importeruser = ConfigNodePropertyString();
}

ComDayCqPollingImporterImplManagedPollingImporterImplProperties::ComDayCqPollingImporterImplManagedPollingImporterImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPollingImporterImplManagedPollingImporterImplProperties::~ComDayCqPollingImporterImplManagedPollingImporterImplProperties()
{

}

void
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *importeruserKey = "importer.user";

    if(object.has_key(importeruserKey))
    {
        bourne::json value = object[importeruserKey];




        ConfigNodePropertyString* obj = &importeruser;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["importeruser"] = getImporteruser().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::getImporteruser()
{
	return importeruser;
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::setImporteruser(ConfigNodePropertyString importeruser)
{
	this->importeruser = importeruser;
}



