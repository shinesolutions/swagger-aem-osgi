/*
 * ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties_H_
#define _ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties_H_


#include <string>
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

class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties();
	ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFromaddress();

	/*! \brief Set 
	 */
	void setFromaddress(ConfigNodePropertyString  fromaddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSenderhost();

	/*! \brief Set 
	 */
	void setSenderhost(ConfigNodePropertyString  senderhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxbouncecount();

	/*! \brief Set 
	 */
	void setMaxbouncecount(ConfigNodePropertyString  maxbouncecount);

private:
	ConfigNodePropertyString fromaddress;
	ConfigNodePropertyString senderhost;
	ConfigNodePropertyString maxbouncecount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties_H_ */
