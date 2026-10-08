--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixHttpSslfilterSslFilterProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixHttpSslfilterSslFilterProperties`
--
SELECT `ssl-forward.header`, `ssl-forward.value`, `ssl-forward-cert.header`, `rewrite.absolute.urls` FROM `orgApacheFelixHttpSslfilterSslFilterProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixHttpSslfilterSslFilterProperties`
--
INSERT INTO `orgApacheFelixHttpSslfilterSslFilterProperties`(`ssl-forward.header`, `ssl-forward.value`, `ssl-forward-cert.header`, `rewrite.absolute.urls`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixHttpSslfilterSslFilterProperties`
--
UPDATE `orgApacheFelixHttpSslfilterSslFilterProperties` SET `ssl-forward.header` = ?, `ssl-forward.value` = ?, `ssl-forward-cert.header` = ?, `rewrite.absolute.urls` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixHttpSslfilterSslFilterProperties`
--
DELETE FROM `orgApacheFelixHttpSslfilterSslFilterProperties` WHERE 0;

