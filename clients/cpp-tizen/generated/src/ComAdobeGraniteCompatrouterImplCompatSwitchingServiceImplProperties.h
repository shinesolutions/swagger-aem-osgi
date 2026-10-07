/*
 * ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties_H_
#define _ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties();
	ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCompatgroups();

	/*! \brief Set 
	 */
	void setCompatgroups(ConfigNodePropertyArray  compatgroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);

private:
	ConfigNodePropertyArray compatgroups;
	ConfigNodePropertyBoolean enabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties_H_ */
