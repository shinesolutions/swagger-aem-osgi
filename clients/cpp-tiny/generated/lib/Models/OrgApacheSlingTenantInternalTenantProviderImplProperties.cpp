

#include "OrgApacheSlingTenantInternalTenantProviderImplProperties.h"

using namespace Tiny;

OrgApacheSlingTenantInternalTenantProviderImplProperties::OrgApacheSlingTenantInternalTenantProviderImplProperties()
{
	tenantroot = ConfigNodePropertyString();
	tenantpathmatcher = ConfigNodePropertyArray();
}

OrgApacheSlingTenantInternalTenantProviderImplProperties::OrgApacheSlingTenantInternalTenantProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingTenantInternalTenantProviderImplProperties::~OrgApacheSlingTenantInternalTenantProviderImplProperties()
{

}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *tenantrootKey = "tenant.root";

    if(object.has_key(tenantrootKey))
    {
        bourne::json value = object[tenantrootKey];




        ConfigNodePropertyString* obj = &tenantroot;
		obj->fromJson(value.dump());

    }

    const char *tenantpathmatcherKey = "tenant.path.matcher";

    if(object.has_key(tenantpathmatcherKey))
    {
        bourne::json value = object[tenantpathmatcherKey];




        ConfigNodePropertyArray* obj = &tenantpathmatcher;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingTenantInternalTenantProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["tenantroot"] = getTenantroot().toJson();






	object["tenantpathmatcher"] = getTenantpathmatcher().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingTenantInternalTenantProviderImplProperties::getTenantroot()
{
	return tenantroot;
}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::setTenantroot(ConfigNodePropertyString tenantroot)
{
	this->tenantroot = tenantroot;
}

ConfigNodePropertyArray
OrgApacheSlingTenantInternalTenantProviderImplProperties::getTenantpathmatcher()
{
	return tenantpathmatcher;
}

void
OrgApacheSlingTenantInternalTenantProviderImplProperties::setTenantpathmatcher(ConfigNodePropertyArray tenantpathmatcher)
{
	this->tenantpathmatcher = tenantpathmatcher;
}



