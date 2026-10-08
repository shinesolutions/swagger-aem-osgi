

#include "OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo.h"

using namespace Tiny;

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties();
	bundle_location = std::string();
	service_location = std::string();
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::~OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo()
{

}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }

    const char *bundle_locationKey = "bundle_location";

    if(object.has_key(bundle_locationKey))
    {
        bourne::json value = object[bundle_locationKey];



        jsonToValue(&bundle_location, value, "std::string");


    }

    const char *service_locationKey = "service_location";

    if(object.has_key(service_locationKey))
    {
        bourne::json value = object[service_locationKey];



        jsonToValue(&service_location, value, "std::string");


    }


}

bourne::json
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();





    object["bundle_location"] = getBundleLocation();






    object["service_location"] = getServiceLocation();



    return object;

}

std::string
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::setProperties(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties properties)
{
	this->properties = properties;
}

std::string
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::getBundleLocation()
{
	return bundle_location;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::setBundleLocation(std::string bundle_location)
{
	this->bundle_location = bundle_location;
}

std::string
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::getServiceLocation()
{
	return service_location;
}

void
OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo::setServiceLocation(std::string service_location)
{
	this->service_location = service_location;
}



