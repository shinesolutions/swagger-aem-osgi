/*
 * ComAdobeGraniteOptoutImplOptOutServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOptoutImplOptOutServiceImplProperties_H_
#define _ComAdobeGraniteOptoutImplOptOutServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteOptoutImplOptOutServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOptoutImplOptOutServiceImplProperties();
	ComAdobeGraniteOptoutImplOptOutServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOptoutImplOptOutServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOptoutcookies();

	/*! \brief Set 
	 */
	void setOptoutcookies(ConfigNodePropertyArray  optoutcookies);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOptoutheaders();

	/*! \brief Set 
	 */
	void setOptoutheaders(ConfigNodePropertyArray  optoutheaders);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOptoutwhitelistcookies();

	/*! \brief Set 
	 */
	void setOptoutwhitelistcookies(ConfigNodePropertyArray  optoutwhitelistcookies);

private:
	ConfigNodePropertyArray optoutcookies;
	ConfigNodePropertyArray optoutheaders;
	ConfigNodePropertyArray optoutwhitelistcookies;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOptoutImplOptOutServiceImplProperties_H_ */
