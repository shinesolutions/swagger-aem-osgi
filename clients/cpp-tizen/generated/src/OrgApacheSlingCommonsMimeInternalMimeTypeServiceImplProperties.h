/*
 * OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties_H_
#define _OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties();
	OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimetypes();

	/*! \brief Set 
	 */
	void setMimetypes(ConfigNodePropertyArray  mimetypes);

private:
	ConfigNodePropertyArray mimetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties_H_ */
