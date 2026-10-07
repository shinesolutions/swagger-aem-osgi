/*
 * ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties_H_
#define _ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties();
	ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRedirectenabled();

	/*! \brief Set 
	 */
	void setRedirectenabled(ConfigNodePropertyBoolean  redirectenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRedirectstatsenabled();

	/*! \brief Set 
	 */
	void setRedirectstatsenabled(ConfigNodePropertyBoolean  redirectstatsenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRedirectextensions();

	/*! \brief Set 
	 */
	void setRedirectextensions(ConfigNodePropertyArray  redirectextensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRedirectpaths();

	/*! \brief Set 
	 */
	void setRedirectpaths(ConfigNodePropertyArray  redirectpaths);

private:
	ConfigNodePropertyBoolean redirectenabled;
	ConfigNodePropertyBoolean redirectstatsenabled;
	ConfigNodePropertyArray redirectextensions;
	ConfigNodePropertyArray redirectpaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties_H_ */
