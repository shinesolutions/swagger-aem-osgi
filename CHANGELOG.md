# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## Unreleased
### Added
- Publish Java client swaggeraemosgi4j to Maven Central

### Fixed
- Fix metadata-lint failure on publishing by upgrading release-action to 2.1.0
- Fix metadata-lint failure on publishing via workflow runner 6.4.1
- Fix Java client pom.xml version not following the release version

## 2.0.1 - 2026-10-28
### Fixed
- Ruby API client no longer follows redirects by default, so 302 responses are returned to the caller again; the post-generate hooks in Makefile-extras keep this when the clients are regenerated

## 2.0.0 - 2026-10-08
### Added
- Add examples and test

### Changed
- Restructure project to use Swaggy C 6.7.0
- Upgrade OpenAPI Generator to 7.24.0

## 1.0.0 - 2019-07-31
### Added
- Initial version
- Renamed tags to configmgr
- Generate Java client
- Generate JavaScript client
- Generate Python client
- Generate Ruby client
- Add Gemfile
- Reduce operation id to 70 chars
- Generate all clients supported by OpenAPI Generator
- Add new FAQ item to define own AEM host parameters

### Changed
- Changed api template file
- Update OpenAPI spec generator tool
- Update OpenAPI spec generator tool to pass ruby_aem environment variables
- Update OpenAPI spec generator tool to allow to disable ssl verification
