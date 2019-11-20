/*
 * OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties_H_
#define _OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties();
	OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcname();

	/*! \brief Set 
	 */
	void setHcname(ConfigNodePropertyString  hcname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHcmbeanname();

	/*! \brief Set 
	 */
	void setHcmbeanname(ConfigNodePropertyString  hcmbeanname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMbeanname();

	/*! \brief Set 
	 */
	void setMbeanname(ConfigNodePropertyString  mbeanname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAttributename();

	/*! \brief Set 
	 */
	void setAttributename(ConfigNodePropertyString  attributename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAttributevalueconstraint();

	/*! \brief Set 
	 */
	void setAttributevalueconstraint(ConfigNodePropertyString  attributevalueconstraint);

private:
	ConfigNodePropertyString hcname;
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyString hcmbeanname;
	ConfigNodePropertyString mbeanname;
	ConfigNodePropertyString attributename;
	ConfigNodePropertyString attributevalueconstraint;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties_H_ */