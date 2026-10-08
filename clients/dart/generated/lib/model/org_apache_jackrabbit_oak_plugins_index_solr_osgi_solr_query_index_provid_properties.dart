//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties {
  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties] instance.
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties({
    this.queryPeriodAggregation,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? queryPeriodAggregation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties &&
    other.queryPeriodAggregation == queryPeriodAggregation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (queryPeriodAggregation == null ? 0 : queryPeriodAggregation!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties[queryPeriodAggregation=$queryPeriodAggregation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.queryPeriodAggregation != null) {
      json[r'query.aggregation'] = this.queryPeriodAggregation;
    } else {
      json[r'query.aggregation'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties(
        queryPeriodAggregation: ConfigNodePropertyBoolean.fromJson(json[r'query.aggregation']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

