/*
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.h
 *
 * 
 */

#ifndef _ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo_H_
#define _ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo_H_


#include <string>
#include "ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.h"
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

class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo();
	ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo();

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
	ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo_H_ */
