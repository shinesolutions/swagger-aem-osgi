/*
 * ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties_H_
#define _ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties();
	ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathPrefix();

	/*! \brief Set 
	 */
	void setPathPrefix(ConfigNodePropertyString  pathPrefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCreateVersion();

	/*! \brief Set 
	 */
	void setCreateVersion(ConfigNodePropertyBoolean  createVersion);

private:
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyString pathPrefix;
	ConfigNodePropertyBoolean createVersion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties_H_ */
