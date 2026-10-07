

#include "ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties()
{
	jmxobjectname = ConfigNodePropertyString();
}

ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::~ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties()
{

}

void
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jmxobjectnameKey = "jmx.objectname";

    if(object.has_key(jmxobjectnameKey))
    {
        bourne::json value = object[jmxobjectnameKey];




        ConfigNodePropertyString* obj = &jmxobjectname;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jmxobjectname"] = getJmxobjectname().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::setJmxobjectname(ConfigNodePropertyString jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}



