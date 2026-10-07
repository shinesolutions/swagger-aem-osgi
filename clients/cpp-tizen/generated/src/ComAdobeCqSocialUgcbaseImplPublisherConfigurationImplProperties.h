/*
 * ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties_H_
#define _ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties_H_


#include <string>
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

class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties();
	ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIsPrimaryPublisher();

	/*! \brief Set 
	 */
	void setIsPrimaryPublisher(ConfigNodePropertyBoolean  isPrimaryPublisher);

private:
	ConfigNodePropertyBoolean isPrimaryPublisher;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties_H_ */
