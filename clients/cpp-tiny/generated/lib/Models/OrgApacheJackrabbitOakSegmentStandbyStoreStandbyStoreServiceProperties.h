
/*
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties();
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapacheslinginstallerconfigurationpersist();

	/*! \brief Set 
	 */
	void setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean orgapacheslinginstallerconfigurationpersist);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getMode();

	/*! \brief Set 
	 */
	void setMode(ConfigNodePropertyDropDown mode);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPort();

	/*! \brief Set 
	 */
	void setPort(ConfigNodePropertyInteger port);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPrimaryhost();

	/*! \brief Set 
	 */
	void setPrimaryhost(ConfigNodePropertyString primaryhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getInterval();

	/*! \brief Set 
	 */
	void setInterval(ConfigNodePropertyInteger interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPrimaryallowedclientipranges();

	/*! \brief Set 
	 */
	void setPrimaryallowedclientipranges(ConfigNodePropertyArray primaryallowedclientipranges);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSecure();

	/*! \brief Set 
	 */
	void setSecure(ConfigNodePropertyBoolean secure);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getStandbyreadtimeout();

	/*! \brief Set 
	 */
	void setStandbyreadtimeout(ConfigNodePropertyInteger standbyreadtimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getStandbyautoclean();

	/*! \brief Set 
	 */
	void setStandbyautoclean(ConfigNodePropertyBoolean standbyautoclean);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties_H_ */
