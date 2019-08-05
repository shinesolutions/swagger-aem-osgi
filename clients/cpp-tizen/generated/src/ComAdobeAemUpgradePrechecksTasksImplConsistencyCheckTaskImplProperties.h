/*
 * ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties_H_
#define _ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties();
	ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRootpath();

	/*! \brief Set 
	 */
	void setRootpath(ConfigNodePropertyString  rootpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFixinconsistencies();

	/*! \brief Set 
	 */
	void setFixinconsistencies(ConfigNodePropertyBoolean  fixinconsistencies);

private:
	ConfigNodePropertyString rootpath;
	ConfigNodePropertyBoolean fixinconsistencies;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties_H_ */
