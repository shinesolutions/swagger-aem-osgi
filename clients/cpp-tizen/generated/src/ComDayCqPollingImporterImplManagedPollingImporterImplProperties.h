/*
 * ComDayCqPollingImporterImplManagedPollingImporterImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqPollingImporterImplManagedPollingImporterImplProperties_H_
#define _ComDayCqPollingImporterImplManagedPollingImporterImplProperties_H_


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

class ComDayCqPollingImporterImplManagedPollingImporterImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqPollingImporterImplManagedPollingImporterImplProperties();
	ComDayCqPollingImporterImplManagedPollingImporterImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqPollingImporterImplManagedPollingImporterImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getImporteruser();

	/*! \brief Set 
	 */
	void setImporteruser(ConfigNodePropertyString  importeruser);

private:
	ConfigNodePropertyString importeruser;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqPollingImporterImplManagedPollingImporterImplProperties_H_ */
