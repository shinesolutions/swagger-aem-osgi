

#include "OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.h"

using namespace Tiny;

OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitRepositoryInitializerProperties()
{
	references = ConfigNodePropertyArray();
	scripts = ConfigNodePropertyArray();
}

OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::~OrgApacheSlingJcrRepoinitRepositoryInitializerProperties()
{

}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *referencesKey = "references";

    if(object.has_key(referencesKey))
    {
        bourne::json value = object[referencesKey];




        ConfigNodePropertyArray* obj = &references;
		obj->fromJson(value.dump());

    }

    const char *scriptsKey = "scripts";

    if(object.has_key(scriptsKey))
    {
        bourne::json value = object[scriptsKey];




        ConfigNodePropertyArray* obj = &scripts;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["references"] = getReferences().toJson();






	object["scripts"] = getScripts().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::getReferences()
{
	return references;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::setReferences(ConfigNodePropertyArray references)
{
	this->references = references;
}

ConfigNodePropertyArray
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::getScripts()
{
	return scripts;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::setScripts(ConfigNodePropertyArray scripts)
{
	this->scripts = scripts;
}



