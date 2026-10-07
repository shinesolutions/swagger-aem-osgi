/*
 * OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties_H_
#define _OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties_H_


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

class OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties();
	OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDescription();

	/*! \brief Set 
	 */
	void setDescription(ConfigNodePropertyString  description);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString description;
	ConfigNodePropertyBoolean enabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties_H_ */
