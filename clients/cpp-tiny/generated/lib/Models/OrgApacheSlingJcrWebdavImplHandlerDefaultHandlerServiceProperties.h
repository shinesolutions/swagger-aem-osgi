
/*
 * OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties();
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties();


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
	ConfigNodePropertyString getTypecollections();

	/*! \brief Set 
	 */
	void setTypecollections(ConfigNodePropertyString typecollections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypenoncollections();

	/*! \brief Set 
	 */
	void setTypenoncollections(ConfigNodePropertyString typenoncollections);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTypecontent();

	/*! \brief Set 
	 */
	void setTypecontent(ConfigNodePropertyString typecontent);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyString typecollections;
    ConfigNodePropertyString typenoncollections;
    ConfigNodePropertyString typecontent;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties_H_ */
