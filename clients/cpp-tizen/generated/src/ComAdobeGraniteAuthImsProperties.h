/*
 * ComAdobeGraniteAuthImsProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthImsProperties_H_
#define _ComAdobeGraniteAuthImsProperties_H_


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

class ComAdobeGraniteAuthImsProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthImsProperties();
	ComAdobeGraniteAuthImsProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthImsProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getConfigid();

	/*! \brief Set 
	 */
	void setConfigid(ConfigNodePropertyString  configid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScope();

	/*! \brief Set 
	 */
	void setScope(ConfigNodePropertyString  scope);

private:
	ConfigNodePropertyString configid;
	ConfigNodePropertyString scope;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthImsProperties_H_ */
