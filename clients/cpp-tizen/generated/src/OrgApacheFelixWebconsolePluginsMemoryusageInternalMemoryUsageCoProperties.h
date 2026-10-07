/*
 * OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties_H_
#define _OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties();
	OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFelixmemoryusagedumpthreshold();

	/*! \brief Set 
	 */
	void setFelixmemoryusagedumpthreshold(ConfigNodePropertyInteger  felixmemoryusagedumpthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFelixmemoryusagedumpinterval();

	/*! \brief Set 
	 */
	void setFelixmemoryusagedumpinterval(ConfigNodePropertyInteger  felixmemoryusagedumpinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFelixmemoryusagedumplocation();

	/*! \brief Set 
	 */
	void setFelixmemoryusagedumplocation(ConfigNodePropertyString  felixmemoryusagedumplocation);

private:
	ConfigNodePropertyInteger felixmemoryusagedumpthreshold;
	ConfigNodePropertyInteger felixmemoryusagedumpinterval;
	ConfigNodePropertyString felixmemoryusagedumplocation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties_H_ */
