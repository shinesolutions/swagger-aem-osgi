/*
 * ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties_H_
#define _ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties_H_


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

class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties();
	ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitemaintenancemandatory();

	/*! \brief Set 
	 */
	void setGranitemaintenancemandatory(ConfigNodePropertyBoolean  granitemaintenancemandatory);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getJobtopics();

	/*! \brief Set 
	 */
	void setJobtopics(ConfigNodePropertyString  jobtopics);

private:
	ConfigNodePropertyBoolean granitemaintenancemandatory;
	ConfigNodePropertyString jobtopics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties_H_ */
