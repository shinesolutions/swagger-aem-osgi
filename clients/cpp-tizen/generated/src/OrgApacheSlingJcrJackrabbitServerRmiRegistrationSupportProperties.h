/*
 * OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_
#define _OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();
	OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPort();

	/*! \brief Set 
	 */
	void setPort(ConfigNodePropertyInteger  port);

private:
	ConfigNodePropertyInteger port;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_ */
