/*
 * ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.h
 *
 * 
 */

#ifndef _ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties_H_
#define _ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties_H_


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

class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties();
	ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcname();

	/*! \brief Set 
	 */
	void setHcname(ConfigNodePropertyString  hcname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcmbeanname();

	/*! \brief Set 
	 */
	void setHcmbeanname(ConfigNodePropertyString  hcmbeanname);

private:
	ConfigNodePropertyString hcname;
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyString hcmbeanname;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties_H_ */
