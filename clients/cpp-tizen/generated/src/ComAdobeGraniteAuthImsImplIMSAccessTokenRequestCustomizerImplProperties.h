/*
 * ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties_H_
#define _ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties_H_


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

class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties();
	ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthimsclientsecret();

	/*! \brief Set 
	 */
	void setAuthimsclientsecret(ConfigNodePropertyString  authimsclientsecret);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCustomizertype();

	/*! \brief Set 
	 */
	void setCustomizertype(ConfigNodePropertyString  customizertype);

private:
	ConfigNodePropertyString authimsclientsecret;
	ConfigNodePropertyString customizertype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties_H_ */
