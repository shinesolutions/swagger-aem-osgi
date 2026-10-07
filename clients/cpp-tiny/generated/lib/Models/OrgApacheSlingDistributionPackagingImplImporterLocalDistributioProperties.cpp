

#include "OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties()
{
	name = ConfigNodePropertyString();
	packageBuildertarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::~OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties()
{

}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::fromJson(std::string jsonObj)
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
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["packageBuildertarget"] = getPackageBuildertarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::getPackageBuildertarget()
{
	return packageBuildertarget;
}

void
OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties::setPackageBuildertarget(ConfigNodePropertyString packageBuildertarget)
{
	this->packageBuildertarget = packageBuildertarget;
}



