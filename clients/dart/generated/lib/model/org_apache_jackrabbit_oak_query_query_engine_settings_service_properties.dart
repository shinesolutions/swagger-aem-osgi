//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {
  /// Returns a new [OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties] instance.
  OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties({
    this.queryLimitInMemory,
    this.queryLimitReads,
    this.queryFailTraversal,
    this.fastQuerySize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queryLimitInMemory;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queryLimitReads;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? queryFailTraversal;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? fastQuerySize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties &&
    other.queryLimitInMemory == queryLimitInMemory &&
    other.queryLimitReads == queryLimitReads &&
    other.queryFailTraversal == queryFailTraversal &&
    other.fastQuerySize == fastQuerySize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (queryLimitInMemory == null ? 0 : queryLimitInMemory!.hashCode) +
    (queryLimitReads == null ? 0 : queryLimitReads!.hashCode) +
    (queryFailTraversal == null ? 0 : queryFailTraversal!.hashCode) +
    (fastQuerySize == null ? 0 : fastQuerySize!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties[queryLimitInMemory=$queryLimitInMemory, queryLimitReads=$queryLimitReads, queryFailTraversal=$queryFailTraversal, fastQuerySize=$fastQuerySize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.queryLimitInMemory != null) {
      json[r'queryLimitInMemory'] = this.queryLimitInMemory;
    } else {
      json[r'queryLimitInMemory'] = null;
    }
    if (this.queryLimitReads != null) {
      json[r'queryLimitReads'] = this.queryLimitReads;
    } else {
      json[r'queryLimitReads'] = null;
    }
    if (this.queryFailTraversal != null) {
      json[r'queryFailTraversal'] = this.queryFailTraversal;
    } else {
      json[r'queryFailTraversal'] = null;
    }
    if (this.fastQuerySize != null) {
      json[r'fastQuerySize'] = this.fastQuerySize;
    } else {
      json[r'fastQuerySize'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(
        queryLimitInMemory: ConfigNodePropertyInteger.fromJson(json[r'queryLimitInMemory']),
        queryLimitReads: ConfigNodePropertyInteger.fromJson(json[r'queryLimitReads']),
        queryFailTraversal: ConfigNodePropertyBoolean.fromJson(json[r'queryFailTraversal']),
        fastQuerySize: ConfigNodePropertyBoolean.fromJson(json[r'fastQuerySize']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

