

#include "OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties()
{
	datasources = ConfigNodePropertyArray();
	step = ConfigNodePropertyInteger();
	archives = ConfigNodePropertyArray();
	path = ConfigNodePropertyString();
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::~OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties()
{

}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *datasourcesKey = "datasources";

    if(object.has_key(datasourcesKey))
    {
        bourne::json value = object[datasourcesKey];




        ConfigNodePropertyArray* obj = &datasources;
		obj->fromJson(value.dump());

    }

    const char *stepKey = "step";

    if(object.has_key(stepKey))
    {
        bourne::json value = object[stepKey];




        ConfigNodePropertyInteger* obj = &step;
		obj->fromJson(value.dump());

    }

    const char *archivesKey = "archives";

    if(object.has_key(archivesKey))
    {
        bourne::json value = object[archivesKey];




        ConfigNodePropertyArray* obj = &archives;
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
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["datasources"] = getDatasources().toJson();






	object["step"] = getStep().toJson();






	object["archives"] = getArchives().toJson();






	object["path"] = getPath().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getDatasources()
{
	return datasources;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setDatasources(ConfigNodePropertyArray datasources)
{
	this->datasources = datasources;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getStep()
{
	return step;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setStep(ConfigNodePropertyInteger step)
{
	this->step = step;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getArchives()
{
	return archives;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setArchives(ConfigNodePropertyArray archives)
{
	this->archives = archives;
}

ConfigNodePropertyString
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getPath()
{
	return path;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}



