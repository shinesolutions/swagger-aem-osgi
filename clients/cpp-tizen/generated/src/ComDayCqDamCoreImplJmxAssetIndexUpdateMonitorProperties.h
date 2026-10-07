/*
 * ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties_H_
#define _ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyFloat.h"
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

class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties();
	ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties();

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
	ConfigNodePropertyBoolean getPropertymeasureenabled();

	/*! \brief Set 
	 */
	void setPropertymeasureenabled(ConfigNodePropertyBoolean  propertymeasureenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPropertyname();

	/*! \brief Set 
	 */
	void setPropertyname(ConfigNodePropertyString  propertyname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPropertymaxwaitms();

	/*! \brief Set 
	 */
	void setPropertymaxwaitms(ConfigNodePropertyInteger  propertymaxwaitms);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getPropertymaxrate();

	/*! \brief Set 
	 */
	void setPropertymaxrate(ConfigNodePropertyFloat  propertymaxrate);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFulltextmeasureenabled();

	/*! \brief Set 
	 */
	void setFulltextmeasureenabled(ConfigNodePropertyBoolean  fulltextmeasureenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFulltextname();

	/*! \brief Set 
	 */
	void setFulltextname(ConfigNodePropertyString  fulltextname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getFulltextmaxwaitms();

	/*! \brief Set 
	 */
	void setFulltextmaxwaitms(ConfigNodePropertyInteger  fulltextmaxwaitms);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getFulltextmaxrate();

	/*! \brief Set 
	 */
	void setFulltextmaxrate(ConfigNodePropertyFloat  fulltextmaxrate);

private:
	ConfigNodePropertyString jmxobjectname;
	ConfigNodePropertyBoolean propertymeasureenabled;
	ConfigNodePropertyString propertyname;
	ConfigNodePropertyInteger propertymaxwaitms;
	ConfigNodePropertyFloat propertymaxrate;
	ConfigNodePropertyBoolean fulltextmeasureenabled;
	ConfigNodePropertyString fulltextname;
	ConfigNodePropertyInteger fulltextmaxwaitms;
	ConfigNodePropertyFloat fulltextmaxrate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties_H_ */
