/*
 * OrgApacheSlingEventImplEventingThreadPoolProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEventImplEventingThreadPoolProperties_H_
#define _OrgApacheSlingEventImplEventingThreadPoolProperties_H_


#include <string>
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

class OrgApacheSlingEventImplEventingThreadPoolProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEventImplEventingThreadPoolProperties();
	OrgApacheSlingEventImplEventingThreadPoolProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEventImplEventingThreadPoolProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinPoolSize();

	/*! \brief Set 
	 */
	void setMinPoolSize(ConfigNodePropertyInteger  minPoolSize);

private:
	ConfigNodePropertyInteger minPoolSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEventImplEventingThreadPoolProperties_H_ */
