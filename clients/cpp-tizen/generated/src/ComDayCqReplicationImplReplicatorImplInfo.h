/*
 * ComDayCqReplicationImplReplicatorImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplReplicatorImplInfo_H_
#define _ComDayCqReplicationImplReplicatorImplInfo_H_


#include <string>
#include "ComDayCqReplicationImplReplicatorImplProperties.h"
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

class ComDayCqReplicationImplReplicatorImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplReplicatorImplInfo();
	ComDayCqReplicationImplReplicatorImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplReplicatorImplInfo();

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
	ComDayCqReplicationImplReplicatorImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqReplicationImplReplicatorImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqReplicationImplReplicatorImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplReplicatorImplInfo_H_ */
