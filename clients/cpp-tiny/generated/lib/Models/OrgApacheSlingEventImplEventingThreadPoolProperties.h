
/*
 * OrgApacheSlingEventImplEventingThreadPoolProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEventImplEventingThreadPoolProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEventImplEventingThreadPoolProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingEventImplEventingThreadPoolProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEventImplEventingThreadPoolProperties();
    OrgApacheSlingEventImplEventingThreadPoolProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEventImplEventingThreadPoolProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinPoolSize();

	/*! \brief Set 
	 */
	void setMinPoolSize(ConfigNodePropertyInteger minPoolSize);


    private:
    ConfigNodePropertyInteger minPoolSize;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEventImplEventingThreadPoolProperties_H_ */
