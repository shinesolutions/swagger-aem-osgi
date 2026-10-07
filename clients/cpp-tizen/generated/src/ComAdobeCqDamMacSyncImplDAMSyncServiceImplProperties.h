/*
 * ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties_H_
#define _ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties();
	ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobecqdammacsyncdamsyncserviceregisteredPaths();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncserviceregisteredPaths(ConfigNodePropertyArray  comadobecqdammacsyncdamsyncserviceregistered_paths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobecqdammacsyncdamsyncservicesyncrenditions();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncservicesyncrenditions(ConfigNodePropertyBoolean  comadobecqdammacsyncdamsyncservicesyncrenditions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobecqdammacsyncdamsyncservicereplicatethreadwaitms();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncservicereplicatethreadwaitms(ConfigNodePropertyInteger  comadobecqdammacsyncdamsyncservicereplicatethreadwaitms);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getComadobecqdammacsyncdamsyncserviceplatform();

	/*! \brief Set 
	 */
	void setComadobecqdammacsyncdamsyncserviceplatform(ConfigNodePropertyDropDown  comadobecqdammacsyncdamsyncserviceplatform);

private:
	ConfigNodePropertyArray comadobecqdammacsyncdamsyncserviceregistered_paths;
	ConfigNodePropertyBoolean comadobecqdammacsyncdamsyncservicesyncrenditions;
	ConfigNodePropertyInteger comadobecqdammacsyncdamsyncservicereplicatethreadwaitms;
	ConfigNodePropertyDropDown comadobecqdammacsyncdamsyncserviceplatform;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties_H_ */
