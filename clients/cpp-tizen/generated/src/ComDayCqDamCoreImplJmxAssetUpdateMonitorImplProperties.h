/*
 * ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties_H_
#define _ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties_H_


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

class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties();
	ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJmxobjectname();

	/*! \brief Set 
	 */
	void setJmxobjectname(ConfigNodePropertyString  jmxobjectname);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getActive();

	/*! \brief Set 
	 */
	void setActive(ConfigNodePropertyBoolean  active);

private:
	ConfigNodePropertyString jmxobjectname;
	ConfigNodePropertyBoolean active;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties_H_ */
