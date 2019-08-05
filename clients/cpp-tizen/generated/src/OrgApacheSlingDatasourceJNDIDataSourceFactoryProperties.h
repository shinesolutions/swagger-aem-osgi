/*
 * OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_
#define _OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_


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

class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties();
	OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcename();

	/*! \brief Set 
	 */
	void setDatasourcename(ConfigNodePropertyString  datasourcename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcesvcpropname();

	/*! \brief Set 
	 */
	void setDatasourcesvcpropname(ConfigNodePropertyString  datasourcesvcpropname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcejndiname();

	/*! \brief Set 
	 */
	void setDatasourcejndiname(ConfigNodePropertyString  datasourcejndiname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJndiproperties();

	/*! \brief Set 
	 */
	void setJndiproperties(ConfigNodePropertyArray  jndiproperties);

private:
	ConfigNodePropertyString datasourcename;
	ConfigNodePropertyString datasourcesvcpropname;
	ConfigNodePropertyString datasourcejndiname;
	ConfigNodePropertyArray jndiproperties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_ */
