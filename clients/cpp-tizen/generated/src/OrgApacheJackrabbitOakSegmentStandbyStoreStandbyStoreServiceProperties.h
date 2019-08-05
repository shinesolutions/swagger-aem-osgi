/*
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties_H_
#define _OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties();
	OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslinginstallerconfigurationpersist();

	/*! \brief Set 
	 */
	void setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean  orgapacheslinginstallerconfigurationpersist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getMode();

	/*! \brief Set 
	 */
	void setMode(ConfigNodePropertyDropDown  mode);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPort();

	/*! \brief Set 
	 */
	void setPort(ConfigNodePropertyInteger  port);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPrimaryhost();

	/*! \brief Set 
	 */
	void setPrimaryhost(ConfigNodePropertyString  primaryhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInterval();

	/*! \brief Set 
	 */
	void setInterval(ConfigNodePropertyInteger  interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPrimaryallowedclientipranges();

	/*! \brief Set 
	 */
	void setPrimaryallowedclientipranges(ConfigNodePropertyArray  primaryallowedclientipranges);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSecure();

	/*! \brief Set 
	 */
	void setSecure(ConfigNodePropertyBoolean  secure);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStandbyreadtimeout();

	/*! \brief Set 
	 */
	void setStandbyreadtimeout(ConfigNodePropertyInteger  standbyreadtimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getStandbyautoclean();

	/*! \brief Set 
	 */
	void setStandbyautoclean(ConfigNodePropertyBoolean  standbyautoclean);

private:
	ConfigNodePropertyBoolean orgapacheslinginstallerconfigurationpersist;
	ConfigNodePropertyDropDown mode;
	ConfigNodePropertyInteger port;
	ConfigNodePropertyString primaryhost;
	ConfigNodePropertyInteger interval;
	ConfigNodePropertyArray primaryallowedclientipranges;
	ConfigNodePropertyBoolean secure;
	ConfigNodePropertyInteger standbyreadtimeout;
	ConfigNodePropertyBoolean standbyautoclean;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties_H_ */
