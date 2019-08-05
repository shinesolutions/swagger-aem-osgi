/*
 * ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties_H_
#define _ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties_H_


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

class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties();
	ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDeviceinfotransformerenabled();

	/*! \brief Set 
	 */
	void setDeviceinfotransformerenabled(ConfigNodePropertyBoolean  deviceinfotransformerenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDeviceinfotransformercssstyle();

	/*! \brief Set 
	 */
	void setDeviceinfotransformercssstyle(ConfigNodePropertyString  deviceinfotransformercssstyle);

private:
	ConfigNodePropertyBoolean deviceinfotransformerenabled;
	ConfigNodePropertyString deviceinfotransformercssstyle;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties_H_ */
