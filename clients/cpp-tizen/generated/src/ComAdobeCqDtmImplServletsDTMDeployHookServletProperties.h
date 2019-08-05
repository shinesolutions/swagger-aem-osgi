/*
 * ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDtmImplServletsDTMDeployHookServletProperties_H_
#define _ComAdobeCqDtmImplServletsDTMDeployHookServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDtmImplServletsDTMDeployHookServletProperties();
	ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDtmImplServletsDTMDeployHookServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDtmstagingipwhitelist();

	/*! \brief Set 
	 */
	void setDtmstagingipwhitelist(ConfigNodePropertyArray  dtmstagingipwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDtmproductionipwhitelist();

	/*! \brief Set 
	 */
	void setDtmproductionipwhitelist(ConfigNodePropertyArray  dtmproductionipwhitelist);

private:
	ConfigNodePropertyArray dtmstagingipwhitelist;
	ConfigNodePropertyArray dtmproductionipwhitelist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDtmImplServletsDTMDeployHookServletProperties_H_ */
