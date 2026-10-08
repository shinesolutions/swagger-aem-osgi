
/*
 * OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties();
    OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServicename();

	/*! \brief Set 
	 */
	void setServicename(ConfigNodePropertyString servicename);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPrivilegename();

	/*! \brief Set 
	 */
	void setPrivilegename(ConfigNodePropertyString privilegename);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString servicename;
    ConfigNodePropertyString path;
    ConfigNodePropertyString privilegename;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_ */
