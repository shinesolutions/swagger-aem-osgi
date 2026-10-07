

#include "OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties()
{
	name = ConfigNodePropertyString();
	packageBuildertarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::~OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties()
{

}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *packageBuildertargetKey = "packageBuilder.target";

    if(object.has_key(packageBuildertargetKey))
    {
        bourne::json value = object[packageBuildertargetKey];




        ConfigNodePropertyString* obj = &packageBuildertarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["packageBuildertarget"] = getPackageBuildertarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties::setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}



