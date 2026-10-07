--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi'
--
SELECT codeupgradetasks, codeupgradetaskfilters FROM com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi'
--
INSERT INTO com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi (codeupgradetasks, codeupgradetaskfilters) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi'
--
UPDATE com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi SET codeupgradetasks = ?, codeupgradetaskfilters = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi'
--
DELETE FROM com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condi WHERE 1=2;

