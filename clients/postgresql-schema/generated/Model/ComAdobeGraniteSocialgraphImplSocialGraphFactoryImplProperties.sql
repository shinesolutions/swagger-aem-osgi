--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr'
--
SELECT group2member/relationship/outgoing, group2member/excluded/outgoing, group2member/relationship/incoming, group2member/excluded/incoming FROM com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr'
--
INSERT INTO com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr (group2member/relationship/outgoing, group2member/excluded/outgoing, group2member/relationship/incoming, group2member/excluded/incoming) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr'
--
UPDATE com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr SET group2member/relationship/outgoing = ?, group2member/excluded/outgoing = ?, group2member/relationship/incoming = ?, group2member/excluded/incoming = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr'
--
DELETE FROM com_adobe_granite_socialgraph_impl_social_graph_factory_impl_pr WHERE 1=2;

