
/*
 * OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties();
    OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcename();

	/*! \brief Set 
	 */
	void setDatasourcename(ConfigNodePropertyString datasourcename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcesvcpropname();

	/*! \brief Set 
	 */
	void setDatasourcesvcpropname(ConfigNodePropertyString datasourcesvcpropname);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDatasourcejndiname();

	/*! \brief Set 
	 */
	void setDatasourcejndiname(ConfigNodePropertyString datasourcejndiname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getJndiproperties();

	/*! \brief Set 
	 */
	void setJndiproperties(ConfigNodePropertyArray jndiproperties);


    private:
    ConfigNodePropertyString datasourcename;
    ConfigNodePropertyString datasourcesvcpropname;
    ConfigNodePropertyString datasourcejndiname;
    ConfigNodePropertyArray jndiproperties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_ */
