/*
 * ComAdobeGraniteRepositoryServiceUserConfigurationProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRepositoryServiceUserConfigurationProperties_H_
#define _ComAdobeGraniteRepositoryServiceUserConfigurationProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteRepositoryServiceUserConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRepositoryServiceUserConfigurationProperties();
	ComAdobeGraniteRepositoryServiceUserConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRepositoryServiceUserConfigurationProperties();

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
	ConfigNodePropertyBoolean getServiceuserssimpleSubjectPopulation();

	/*! \brief Set 
	 */
	void setServiceuserssimpleSubjectPopulation(ConfigNodePropertyBoolean  serviceuserssimpleSubjectPopulation);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServiceuserslist();

	/*! \brief Set 
	 */
	void setServiceuserslist(ConfigNodePropertyArray  serviceuserslist);

private:
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyBoolean serviceuserssimpleSubjectPopulation;
	ConfigNodePropertyArray serviceuserslist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRepositoryServiceUserConfigurationProperties_H_ */
