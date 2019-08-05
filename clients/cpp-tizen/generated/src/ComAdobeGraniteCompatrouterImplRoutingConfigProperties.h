/*
 * ComAdobeGraniteCompatrouterImplRoutingConfigProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_
#define _ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_


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

class ComAdobeGraniteCompatrouterImplRoutingConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteCompatrouterImplRoutingConfigProperties();
	ComAdobeGraniteCompatrouterImplRoutingConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteCompatrouterImplRoutingConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getId();

	/*! \brief Set 
	 */
	void setId(ConfigNodePropertyString  id);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCompatPath();

	/*! \brief Set 
	 */
	void setCompatPath(ConfigNodePropertyString  compatPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getNewPath();

	/*! \brief Set 
	 */
	void setNewPath(ConfigNodePropertyString  newPath);

private:
	ConfigNodePropertyString id;
	ConfigNodePropertyString compatPath;
	ConfigNodePropertyString newPath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteCompatrouterImplRoutingConfigProperties_H_ */
