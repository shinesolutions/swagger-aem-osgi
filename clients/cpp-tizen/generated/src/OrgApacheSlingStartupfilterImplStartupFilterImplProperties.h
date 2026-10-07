/*
 * OrgApacheSlingStartupfilterImplStartupFilterImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_
#define _OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingStartupfilterImplStartupFilterImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingStartupfilterImplStartupFilterImplProperties();
	OrgApacheSlingStartupfilterImplStartupFilterImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingStartupfilterImplStartupFilterImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getActivebydefault();

	/*! \brief Set 
	 */
	void setActivebydefault(ConfigNodePropertyBoolean  activebydefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultmessage();

	/*! \brief Set 
	 */
	void setDefaultmessage(ConfigNodePropertyString  defaultmessage);

private:
	ConfigNodePropertyBoolean activebydefault;
	ConfigNodePropertyString defaultmessage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_ */
