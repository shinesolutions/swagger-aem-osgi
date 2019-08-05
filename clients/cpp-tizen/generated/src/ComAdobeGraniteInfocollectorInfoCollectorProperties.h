/*
 * ComAdobeGraniteInfocollectorInfoCollectorProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteInfocollectorInfoCollectorProperties_H_
#define _ComAdobeGraniteInfocollectorInfoCollectorProperties_H_


#include <string>
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

class ComAdobeGraniteInfocollectorInfoCollectorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteInfocollectorInfoCollectorProperties();
	ComAdobeGraniteInfocollectorInfoCollectorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteInfocollectorInfoCollectorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteinfocollectorincludeThreadDumps();

	/*! \brief Set 
	 */
	void setGraniteinfocollectorincludeThreadDumps(ConfigNodePropertyBoolean  graniteinfocollectorincludeThreadDumps);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGraniteinfocollectorincludeHeapDump();

	/*! \brief Set 
	 */
	void setGraniteinfocollectorincludeHeapDump(ConfigNodePropertyBoolean  graniteinfocollectorincludeHeapDump);

private:
	ConfigNodePropertyBoolean graniteinfocollectorincludeThreadDumps;
	ConfigNodePropertyBoolean graniteinfocollectorincludeHeapDump;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteInfocollectorInfoCollectorProperties_H_ */
