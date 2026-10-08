

#include "ComDayCqReportingImplConfigServiceImplProperties.h"

using namespace Tiny;

ComDayCqReportingImplConfigServiceImplProperties::ComDayCqReportingImplConfigServiceImplProperties()
{
	repconftimezone = ConfigNodePropertyString();
	repconflocale = ConfigNodePropertyString();
	repconfsnapshots = ConfigNodePropertyString();
	repconfrepdir = ConfigNodePropertyString();
	repconfhourofday = ConfigNodePropertyInteger();
	repconfminofhour = ConfigNodePropertyInteger();
	repconfmaxrows = ConfigNodePropertyInteger();
	repconffakedata = ConfigNodePropertyBoolean();
	repconfsnapshotuser = ConfigNodePropertyString();
	repconfenforcesnapshotuser = ConfigNodePropertyBoolean();
}

ComDayCqReportingImplConfigServiceImplProperties::ComDayCqReportingImplConfigServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReportingImplConfigServiceImplProperties::~ComDayCqReportingImplConfigServiceImplProperties()
{

}

void
ComDayCqReportingImplConfigServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *repconftimezoneKey = "repconf.timezone";

    if(object.has_key(repconftimezoneKey))
    {
        bourne::json value = object[repconftimezoneKey];




        ConfigNodePropertyString* obj = &repconftimezone;
		obj->fromJson(value.dump());

    }

    const char *repconflocaleKey = "repconf.locale";

    if(object.has_key(repconflocaleKey))
    {
        bourne::json value = object[repconflocaleKey];




        ConfigNodePropertyString* obj = &repconflocale;
		obj->fromJson(value.dump());

    }

    const char *repconfsnapshotsKey = "repconf.snapshots";

    if(object.has_key(repconfsnapshotsKey))
    {
        bourne::json value = object[repconfsnapshotsKey];




        ConfigNodePropertyString* obj = &repconfsnapshots;
		obj->fromJson(value.dump());

    }

    const char *repconfrepdirKey = "repconf.repdir";

    if(object.has_key(repconfrepdirKey))
    {
        bourne::json value = object[repconfrepdirKey];




        ConfigNodePropertyString* obj = &repconfrepdir;
		obj->fromJson(value.dump());

    }

    const char *repconfhourofdayKey = "repconf.hourofday";

    if(object.has_key(repconfhourofdayKey))
    {
        bourne::json value = object[repconfhourofdayKey];




        ConfigNodePropertyInteger* obj = &repconfhourofday;
		obj->fromJson(value.dump());

    }

    const char *repconfminofhourKey = "repconf.minofhour";

    if(object.has_key(repconfminofhourKey))
    {
        bourne::json value = object[repconfminofhourKey];




        ConfigNodePropertyInteger* obj = &repconfminofhour;
		obj->fromJson(value.dump());

    }

    const char *repconfmaxrowsKey = "repconf.maxrows";

    if(object.has_key(repconfmaxrowsKey))
    {
        bourne::json value = object[repconfmaxrowsKey];




        ConfigNodePropertyInteger* obj = &repconfmaxrows;
		obj->fromJson(value.dump());

    }

    const char *repconffakedataKey = "repconf.fakedata";

    if(object.has_key(repconffakedataKey))
    {
        bourne::json value = object[repconffakedataKey];




        ConfigNodePropertyBoolean* obj = &repconffakedata;
		obj->fromJson(value.dump());

    }

    const char *repconfsnapshotuserKey = "repconf.snapshotuser";

    if(object.has_key(repconfsnapshotuserKey))
    {
        bourne::json value = object[repconfsnapshotuserKey];




        ConfigNodePropertyString* obj = &repconfsnapshotuser;
		obj->fromJson(value.dump());

    }

    const char *repconfenforcesnapshotuserKey = "repconf.enforcesnapshotuser";

    if(object.has_key(repconfenforcesnapshotuserKey))
    {
        bourne::json value = object[repconfenforcesnapshotuserKey];




        ConfigNodePropertyBoolean* obj = &repconfenforcesnapshotuser;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReportingImplConfigServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["repconftimezone"] = getRepconftimezone().toJson();






	object["repconflocale"] = getRepconflocale().toJson();






	object["repconfsnapshots"] = getRepconfsnapshots().toJson();






	object["repconfrepdir"] = getRepconfrepdir().toJson();






	object["repconfhourofday"] = getRepconfhourofday().toJson();






	object["repconfminofhour"] = getRepconfminofhour().toJson();






	object["repconfmaxrows"] = getRepconfmaxrows().toJson();






	object["repconffakedata"] = getRepconffakedata().toJson();






	object["repconfsnapshotuser"] = getRepconfsnapshotuser().toJson();






	object["repconfenforcesnapshotuser"] = getRepconfenforcesnapshotuser().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconftimezone()
{
	return repconftimezone;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconftimezone(ConfigNodePropertyString repconftimezone)
{
	this->repconftimezone = repconftimezone;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconflocale()
{
	return repconflocale;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconflocale(ConfigNodePropertyString repconflocale)
{
	this->repconflocale = repconflocale;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconfsnapshots()
{
	return repconfsnapshots;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfsnapshots(ConfigNodePropertyString repconfsnapshots)
{
	this->repconfsnapshots = repconfsnapshots;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconfrepdir()
{
	return repconfrepdir;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfrepdir(ConfigNodePropertyString repconfrepdir)
{
	this->repconfrepdir = repconfrepdir;
}

ConfigNodePropertyInteger
ComDayCqReportingImplConfigServiceImplProperties::getRepconfhourofday()
{
	return repconfhourofday;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfhourofday(ConfigNodePropertyInteger repconfhourofday)
{
	this->repconfhourofday = repconfhourofday;
}

ConfigNodePropertyInteger
ComDayCqReportingImplConfigServiceImplProperties::getRepconfminofhour()
{
	return repconfminofhour;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfminofhour(ConfigNodePropertyInteger repconfminofhour)
{
	this->repconfminofhour = repconfminofhour;
}

ConfigNodePropertyInteger
ComDayCqReportingImplConfigServiceImplProperties::getRepconfmaxrows()
{
	return repconfmaxrows;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfmaxrows(ConfigNodePropertyInteger repconfmaxrows)
{
	this->repconfmaxrows = repconfmaxrows;
}

ConfigNodePropertyBoolean
ComDayCqReportingImplConfigServiceImplProperties::getRepconffakedata()
{
	return repconffakedata;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconffakedata(ConfigNodePropertyBoolean repconffakedata)
{
	this->repconffakedata = repconffakedata;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconfsnapshotuser()
{
	return repconfsnapshotuser;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfsnapshotuser(ConfigNodePropertyString repconfsnapshotuser)
{
	this->repconfsnapshotuser = repconfsnapshotuser;
}

ConfigNodePropertyBoolean
ComDayCqReportingImplConfigServiceImplProperties::getRepconfenforcesnapshotuser()
{
	return repconfenforcesnapshotuser;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfenforcesnapshotuser(ConfigNodePropertyBoolean repconfenforcesnapshotuser)
{
	this->repconfenforcesnapshotuser = repconfenforcesnapshotuser;
}



