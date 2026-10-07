

#include "OrgApacheFelixHttpSslfilterSslFilterProperties.h"

using namespace Tiny;

OrgApacheFelixHttpSslfilterSslFilterProperties::OrgApacheFelixHttpSslfilterSslFilterProperties()
{
	sslforwardheader = ConfigNodePropertyString();
	sslforwardvalue = ConfigNodePropertyString();
	sslforwardcertheader = ConfigNodePropertyString();
	rewriteabsoluteurls = ConfigNodePropertyBoolean();
}

OrgApacheFelixHttpSslfilterSslFilterProperties::OrgApacheFelixHttpSslfilterSslFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixHttpSslfilterSslFilterProperties::~OrgApacheFelixHttpSslfilterSslFilterProperties()
{

}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *sslforwardheaderKey = "ssl-forward.header";

    if(object.has_key(sslforwardheaderKey))
    {
        bourne::json value = object[sslforwardheaderKey];




        ConfigNodePropertyString* obj = &sslforwardheader;
		obj->fromJson(value.dump());

    }

    const char *sslforwardvalueKey = "ssl-forward.value";

    if(object.has_key(sslforwardvalueKey))
    {
        bourne::json value = object[sslforwardvalueKey];




        ConfigNodePropertyString* obj = &sslforwardvalue;
		obj->fromJson(value.dump());

    }

    const char *sslforwardcertheaderKey = "ssl-forward-cert.header";

    if(object.has_key(sslforwardcertheaderKey))
    {
        bourne::json value = object[sslforwardcertheaderKey];




        ConfigNodePropertyString* obj = &sslforwardcertheader;
		obj->fromJson(value.dump());

    }

    const char *rewriteabsoluteurlsKey = "rewrite.absolute.urls";

    if(object.has_key(rewriteabsoluteurlsKey))
    {
        bourne::json value = object[rewriteabsoluteurlsKey];




        ConfigNodePropertyBoolean* obj = &rewriteabsoluteurls;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixHttpSslfilterSslFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["sslforwardheader"] = getSslforwardheader().toJson();






	object["sslforwardvalue"] = getSslforwardvalue().toJson();






	object["sslforwardcertheader"] = getSslforwardcertheader().toJson();






	object["rewriteabsoluteurls"] = getRewriteabsoluteurls().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheFelixHttpSslfilterSslFilterProperties::getSslforwardheader()
{
	return sslforwardheader;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setSslforwardheader(ConfigNodePropertyString sslforwardheader)
{
	this->sslforwardheader = sslforwardheader;
}

ConfigNodePropertyString
OrgApacheFelixHttpSslfilterSslFilterProperties::getSslforwardvalue()
{
	return sslforwardvalue;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setSslforwardvalue(ConfigNodePropertyString sslforwardvalue)
{
	this->sslforwardvalue = sslforwardvalue;
}

ConfigNodePropertyString
OrgApacheFelixHttpSslfilterSslFilterProperties::getSslforwardcertheader()
{
	return sslforwardcertheader;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setSslforwardcertheader(ConfigNodePropertyString sslforwardcertheader)
{
	this->sslforwardcertheader = sslforwardcertheader;
}

ConfigNodePropertyBoolean
OrgApacheFelixHttpSslfilterSslFilterProperties::getRewriteabsoluteurls()
{
	return rewriteabsoluteurls;
}

void
OrgApacheFelixHttpSslfilterSslFilterProperties::setRewriteabsoluteurls(ConfigNodePropertyBoolean rewriteabsoluteurls)
{
	this->rewriteabsoluteurls = rewriteabsoluteurls;
}



