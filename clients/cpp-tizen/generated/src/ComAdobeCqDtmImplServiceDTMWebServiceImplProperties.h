/*
 * ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDtmImplServiceDTMWebServiceImplProperties_H_
#define _ComAdobeCqDtmImplServiceDTMWebServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDtmImplServiceDTMWebServiceImplProperties();
	ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDtmImplServiceDTMWebServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectiontimeout();

	/*! \brief Set 
	 */
	void setConnectiontimeout(ConfigNodePropertyInteger  connectiontimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSockettimeout();

	/*! \brief Set 
	 */
	void setSockettimeout(ConfigNodePropertyInteger  sockettimeout);

private:
	ConfigNodePropertyInteger connectiontimeout;
	ConfigNodePropertyInteger sockettimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDtmImplServiceDTMWebServiceImplProperties_H_ */
