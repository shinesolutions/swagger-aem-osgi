//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {
  /// Returns a new [OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties] instance.
  OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties({
    this.maxItems,
    this.maxPathDepth,
    this.enabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxItems;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxPathDepth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties &&
    other.maxItems == maxItems &&
    other.maxPathDepth == maxPathDepth &&
    other.enabled == enabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxItems == null ? 0 : maxItems!.hashCode) +
    (maxPathDepth == null ? 0 : maxPathDepth!.hashCode) +
    (enabled == null ? 0 : enabled!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties[maxItems=$maxItems, maxPathDepth=$maxPathDepth, enabled=$enabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxItems != null) {
      json[r'maxItems'] = this.maxItems;
    } else {
      json[r'maxItems'] = null;
    }
    if (this.maxPathDepth != null) {
      json[r'maxPathDepth'] = this.maxPathDepth;
    } else {
      json[r'maxPathDepth'] = null;
    }
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(
        maxItems: ConfigNodePropertyInteger.fromJson(json[r'maxItems']),
        maxPathDepth: ConfigNodePropertyInteger.fromJson(json[r'maxPathDepth']),
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

