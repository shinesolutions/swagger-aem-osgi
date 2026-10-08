

#include "OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.h"

using namespace Tiny;

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties()
{
	references = ConfigNodePropertyArray();
}

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::~OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties()
{

}

void
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *referencesKey = "references";

    if(object.has_key(referencesKey))
    {
        bourne::json value = object[referencesKey];




        ConfigNodePropertyArray* obj = &references;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["references"] = getReferences().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::getReferences()
{
	return references;
}

void
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::setReferences(ConfigNodePropertyArray references)
{
	this->references = references;
}



