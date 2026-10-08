//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties] instance.
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties({
    this.solrPeriodHomePeriodPath,
    this.solrPeriodCorePeriodName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodHomePeriodPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodCorePeriodName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties &&
    other.solrPeriodHomePeriodPath == solrPeriodHomePeriodPath &&
    other.solrPeriodCorePeriodName == solrPeriodCorePeriodName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (solrPeriodHomePeriodPath == null ? 0 : solrPeriodHomePeriodPath!.hashCode) +
    (solrPeriodCorePeriodName == null ? 0 : solrPeriodCorePeriodName!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties[solrPeriodHomePeriodPath=$solrPeriodHomePeriodPath, solrPeriodCorePeriodName=$solrPeriodCorePeriodName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.solrPeriodHomePeriodPath != null) {
      json[r'solr.home.path'] = this.solrPeriodHomePeriodPath;
    } else {
      json[r'solr.home.path'] = null;
    }
    if (this.solrPeriodCorePeriodName != null) {
      json[r'solr.core.name'] = this.solrPeriodCorePeriodName;
    } else {
      json[r'solr.core.name'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(
        solrPeriodHomePeriodPath: ConfigNodePropertyString.fromJson(json[r'solr.home.path']),
        solrPeriodCorePeriodName: ConfigNodePropertyString.fromJson(json[r'solr.core.name']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

