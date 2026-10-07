/*
 * ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteLicenseImplLicenseCheckFilterProperties_H_
#define _ComAdobeGraniteLicenseImplLicenseCheckFilterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteLicenseImplLicenseCheckFilterProperties();
	ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteLicenseImplLicenseCheckFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCheckInternval();

	/*! \brief Set 
	 */
	void setCheckInternval(ConfigNodePropertyInteger  checkInternval);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludeIds();

	/*! \brief Set 
	 */
	void setExcludeIds(ConfigNodePropertyArray  excludeIds);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEncryptPing();

	/*! \brief Set 
	 */
	void setEncryptPing(ConfigNodePropertyBoolean  encryptPing);

private:
	ConfigNodePropertyInteger checkInternval;
	ConfigNodePropertyArray excludeIds;
	ConfigNodePropertyBoolean encryptPing;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteLicenseImplLicenseCheckFilterProperties_H_ */
