

#include "OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties()
{
	name = ConfigNodePropertyString();
	servicename = ConfigNodePropertyString();
	path = ConfigNodePropertyString();
	privilegename = ConfigNodePropertyString();
}

OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::~OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties()
{

}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *servicenameKey = "service.name";

    if(object.has_key(servicenameKey))
    {
        bourne::json value = object[servicenameKey];




        ConfigNodePropertyString* obj = &servicename;
		obj->fromJson(value.dump());

    }

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *privilegenameKey = "privilege.name";

    if(object.has_key(privilegenameKey))
    {
        bourne::json value = object[privilegenameKey];




        ConfigNodePropertyString* obj = &privilegename;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["servicename"] = getServicename().toJson();






	object["path"] = getPath().toJson();






	object["privilegename"] = getPrivilegename().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::getServicename()
{
	return servicename;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::setServicename(ConfigNodePropertyString servicename)
{
	this->servicename = servicename;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::getPrivilegename()
{
	return privilegename;
}

void
OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties::setPrivilegename(ConfigNodePropertyString privilegename)
{
	this->privilegename = privilegename;
}



