
/*
 * OrgApacheSlingI18nImplI18NFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingI18nImplI18NFilterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingI18nImplI18NFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingI18nImplI18NFilterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingI18nImplI18NFilterProperties();
    OrgApacheSlingI18nImplI18NFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingI18nImplI18NFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingfilterscope();

	/*! \brief Set 
	 */
	void setSlingfilterscope(ConfigNodePropertyArray slingfilterscope);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyArray slingfilterscope;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingI18nImplI18NFilterProperties_H_ */
