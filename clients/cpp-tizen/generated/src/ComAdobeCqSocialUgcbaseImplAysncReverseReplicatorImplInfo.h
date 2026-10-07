/*
 * ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo_H_
#define _ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo_H_


#include <string>
#include "ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.h"
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

class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo();
	ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo_H_ */
