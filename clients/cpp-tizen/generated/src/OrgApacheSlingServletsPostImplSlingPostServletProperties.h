/*
 * OrgApacheSlingServletsPostImplSlingPostServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingServletsPostImplSlingPostServletProperties_H_
#define _OrgApacheSlingServletsPostImplSlingPostServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingServletsPostImplSlingPostServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingServletsPostImplSlingPostServletProperties();
	OrgApacheSlingServletsPostImplSlingPostServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingServletsPostImplSlingPostServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletpostdateFormats();

	/*! \brief Set 
	 */
	void setServletpostdateFormats(ConfigNodePropertyArray  servletpostdateFormats);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServletpostnodeNameHints();

	/*! \brief Set 
	 */
	void setServletpostnodeNameHints(ConfigNodePropertyArray  servletpostnodeNameHints);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServletpostnodeNameMaxLength();

	/*! \brief Set 
	 */
	void setServletpostnodeNameMaxLength(ConfigNodePropertyInteger  servletpostnodeNameMaxLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletpostcheckinNewVersionableNodes();

	/*! \brief Set 
	 */
	void setServletpostcheckinNewVersionableNodes(ConfigNodePropertyBoolean  servletpostcheckinNewVersionableNodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletpostautoCheckout();

	/*! \brief Set 
	 */
	void setServletpostautoCheckout(ConfigNodePropertyBoolean  servletpostautoCheckout);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletpostautoCheckin();

	/*! \brief Set 
	 */
	void setServletpostautoCheckin(ConfigNodePropertyBoolean  servletpostautoCheckin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServletpostignorePattern();

	/*! \brief Set 
	 */
	void setServletpostignorePattern(ConfigNodePropertyString  servletpostignorePattern);

private:
	ConfigNodePropertyArray servletpostdateFormats;
	ConfigNodePropertyArray servletpostnodeNameHints;
	ConfigNodePropertyInteger servletpostnodeNameMaxLength;
	ConfigNodePropertyBoolean servletpostcheckinNewVersionableNodes;
	ConfigNodePropertyBoolean servletpostautoCheckout;
	ConfigNodePropertyBoolean servletpostautoCheckin;
	ConfigNodePropertyString servletpostignorePattern;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingServletsPostImplSlingPostServletProperties_H_ */
