

#include "ComDayCqPollingImporterImplPollingImporterImplProperties.h"

using namespace Tiny;

ComDayCqPollingImporterImplPollingImporterImplProperties::ComDayCqPollingImporterImplPollingImporterImplProperties()
{
	importermininterval = ConfigNodePropertyInteger();
	importeruser = ConfigNodePropertyString();
	excludepaths = ConfigNodePropertyArray();
	includepaths = ConfigNodePropertyArray();
}

ComDayCqPollingImporterImplPollingImporterImplProperties::ComDayCqPollingImporterImplPollingImporterImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPollingImporterImplPollingImporterImplProperties::~ComDayCqPollingImporterImplPollingImporterImplProperties()
{

}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *importerminintervalKey = "importer.min.interval";

    if(object.has_key(importerminintervalKey))
    {
        bourne::json value = object[importerminintervalKey];




        ConfigNodePropertyInteger* obj = &importermininterval;
		obj->fromJson(value.dump());

    }

    const char *importeruserKey = "importer.user";

    if(object.has_key(importeruserKey))
    {
        bourne::json value = object[importeruserKey];




        ConfigNodePropertyString* obj = &importeruser;
		obj->fromJson(value.dump());

    }

    const char *excludepathsKey = "exclude.paths";

    if(object.has_key(excludepathsKey))
    {
        bourne::json value = object[excludepathsKey];




        ConfigNodePropertyArray* obj = &excludepaths;
		obj->fromJson(value.dump());

    }

    const char *includepathsKey = "include.paths";

    if(object.has_key(includepathsKey))
    {
        bourne::json value = object[includepathsKey];




        ConfigNodePropertyArray* obj = &includepaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPollingImporterImplPollingImporterImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["importermininterval"] = getImportermininterval().toJson();






	object["importeruser"] = getImporteruser().toJson();






	object["excludepaths"] = getExcludepaths().toJson();






	object["includepaths"] = getIncludepaths().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqPollingImporterImplPollingImporterImplProperties::getImportermininterval()
{
	return importermininterval;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setImportermininterval(ConfigNodePropertyInteger importermininterval)
{
	this->importermininterval = importermininterval;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplPollingImporterImplProperties::getImporteruser()
{
	return importeruser;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setImporteruser(ConfigNodePropertyString importeruser)
{
	this->importeruser = importeruser;
}

ConfigNodePropertyArray
ComDayCqPollingImporterImplPollingImporterImplProperties::getExcludepaths()
{
	return excludepaths;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setExcludepaths(ConfigNodePropertyArray excludepaths)
{
	this->excludepaths = excludepaths;
}

ConfigNodePropertyArray
ComDayCqPollingImporterImplPollingImporterImplProperties::getIncludepaths()
{
	return includepaths;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setIncludepaths(ConfigNodePropertyArray includepaths)
{
	this->includepaths = includepaths;
}



