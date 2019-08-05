/*
 * OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties_H_
#define _OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties();
	OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsermapping();

	/*! \brief Set 
	 */
	void setUsermapping(ConfigNodePropertyArray  usermapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserdefault();

	/*! \brief Set 
	 */
	void setUserdefault(ConfigNodePropertyString  userdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUserenabledefaultmapping();

	/*! \brief Set 
	 */
	void setUserenabledefaultmapping(ConfigNodePropertyBoolean  userenabledefaultmapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRequirevalidation();

	/*! \brief Set 
	 */
	void setRequirevalidation(ConfigNodePropertyBoolean  requirevalidation);

private:
	ConfigNodePropertyArray usermapping;
	ConfigNodePropertyString userdefault;
	ConfigNodePropertyBoolean userenabledefaultmapping;
	ConfigNodePropertyBoolean requirevalidation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties_H_ */
