/*
 * ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties_H_
#define _ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties_H_


#include <string>
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

class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties();
	ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqsearchpromoteconfigurationserveruri();

	/*! \brief Set 
	 */
	void setCqsearchpromoteconfigurationserveruri(ConfigNodePropertyString  cqsearchpromoteconfigurationserveruri);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqsearchpromoteconfigurationenvironment();

	/*! \brief Set 
	 */
	void setCqsearchpromoteconfigurationenvironment(ConfigNodePropertyString  cqsearchpromoteconfigurationenvironment);
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
	ConfigNodePropertyString cqsearchpromoteconfigurationserveruri;
	ConfigNodePropertyString cqsearchpromoteconfigurationenvironment;
	ConfigNodePropertyInteger connectiontimeout;
	ConfigNodePropertyInteger sockettimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties_H_ */
