/*
 * ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties_H_
#define _ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties();
	ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroup();

	/*! \brief Set 
	 */
	void setGroup(ConfigNodePropertyString  group);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIds();

	/*! \brief Set 
	 */
	void setIds(ConfigNodePropertyArray  ids);

private:
	ConfigNodePropertyString group;
	ConfigNodePropertyArray ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties_H_ */
