
/*
 * OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrRepoinitRepositoryInitializerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrRepoinitRepositoryInitializerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrRepoinitRepositoryInitializerProperties();
    OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrRepoinitRepositoryInitializerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReferences();

	/*! \brief Set 
	 */
	void setReferences(ConfigNodePropertyArray references);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getScripts();

	/*! \brief Set 
	 */
	void setScripts(ConfigNodePropertyArray scripts);


    private:
    ConfigNodePropertyArray references;
    ConfigNodePropertyArray scripts;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrRepoinitRepositoryInitializerProperties_H_ */
