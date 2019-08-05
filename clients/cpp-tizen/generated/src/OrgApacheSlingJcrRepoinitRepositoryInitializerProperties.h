/*
 * OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrRepoinitRepositoryInitializerProperties_H_
#define _OrgApacheSlingJcrRepoinitRepositoryInitializerProperties_H_


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

class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrRepoinitRepositoryInitializerProperties();
	OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrRepoinitRepositoryInitializerProperties();

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
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScripts();

	/*! \brief Set 
	 */
	void setScripts(ConfigNodePropertyArray  scripts);

private:
	ConfigNodePropertyArray references;
	ConfigNodePropertyArray scripts;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrRepoinitRepositoryInitializerProperties_H_ */
