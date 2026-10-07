/*
 * OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties_H_
#define _OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties_H_


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

class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties();
	OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReferences();

	/*! \brief Set 
	 */
	void setReferences(ConfigNodePropertyArray  references);

private:
	ConfigNodePropertyArray references;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties_H_ */
