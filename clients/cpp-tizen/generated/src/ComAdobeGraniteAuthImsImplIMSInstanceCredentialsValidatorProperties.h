/*
 * ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties_H_
#define _ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties_H_


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

class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties();
	ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOauthproviderid();

	/*! \brief Set 
	 */
	void setOauthproviderid(ConfigNodePropertyString  oauthproviderid);

private:
	ConfigNodePropertyString oauthproviderid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties_H_ */
