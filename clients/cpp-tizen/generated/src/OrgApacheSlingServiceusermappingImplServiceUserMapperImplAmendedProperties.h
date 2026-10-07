/*
 * OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties_H_
#define _OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties();
	OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsermapping();

	/*! \brief Set 
	 */
	void setUsermapping(ConfigNodePropertyArray  usermapping);

private:
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyArray usermapping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties_H_ */
