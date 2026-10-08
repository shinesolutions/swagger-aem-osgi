
/*
 * ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties_H_


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

class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties();
    ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties();


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
	ConfigNodePropertyString getPathPrefix();

	/*! \brief Set 
	 */
	void setPathPrefix(ConfigNodePropertyString pathPrefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCreateVersion();

	/*! \brief Set 
	 */
	void setCreateVersion(ConfigNodePropertyBoolean createVersion);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyString pathPrefix;
    ConfigNodePropertyBoolean createVersion;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties_H_ */
