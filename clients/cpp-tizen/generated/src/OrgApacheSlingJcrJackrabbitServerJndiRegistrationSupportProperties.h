/*
 * OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties_H_
#define _OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties_H_


#include <string>
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

class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties();
	OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavanamingfactoryinitial();

	/*! \brief Set 
	 */
	void setJavanamingfactoryinitial(ConfigNodePropertyString  javanamingfactoryinitial);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJavanamingproviderurl();

	/*! \brief Set 
	 */
	void setJavanamingproviderurl(ConfigNodePropertyString  javanamingproviderurl);

private:
	ConfigNodePropertyString javanamingfactoryinitial;
	ConfigNodePropertyString javanamingproviderurl;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties_H_ */
