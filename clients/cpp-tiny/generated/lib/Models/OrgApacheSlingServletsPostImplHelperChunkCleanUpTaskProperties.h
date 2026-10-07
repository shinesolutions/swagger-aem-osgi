
/*
 * OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties();
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getChunkcleanupage();

	/*! \brief Set 
	 */
	void setChunkcleanupage(ConfigNodePropertyInteger chunkcleanupage);


    private:
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyBoolean schedulerconcurrent;
    ConfigNodePropertyInteger chunkcleanupage;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties_H_ */
