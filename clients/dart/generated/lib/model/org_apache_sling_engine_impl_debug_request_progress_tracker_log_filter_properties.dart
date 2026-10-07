//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {
  /// Returns a new [OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties] instance.
  OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties({
    this.extensions,
    this.minDurationMs,
    this.maxDurationMs,
    this.compactLogFormat,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? extensions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? minDurationMs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxDurationMs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? compactLogFormat;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties &&
    other.extensions == extensions &&
    other.minDurationMs == minDurationMs &&
    other.maxDurationMs == maxDurationMs &&
    other.compactLogFormat == compactLogFormat;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (extensions == null ? 0 : extensions!.hashCode) +
    (minDurationMs == null ? 0 : minDurationMs!.hashCode) +
    (maxDurationMs == null ? 0 : maxDurationMs!.hashCode) +
    (compactLogFormat == null ? 0 : compactLogFormat!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties[extensions=$extensions, minDurationMs=$minDurationMs, maxDurationMs=$maxDurationMs, compactLogFormat=$compactLogFormat]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.extensions != null) {
      json[r'extensions'] = this.extensions;
    } else {
      json[r'extensions'] = null;
    }
    if (this.minDurationMs != null) {
      json[r'minDurationMs'] = this.minDurationMs;
    } else {
      json[r'minDurationMs'] = null;
    }
    if (this.maxDurationMs != null) {
      json[r'maxDurationMs'] = this.maxDurationMs;
    } else {
      json[r'maxDurationMs'] = null;
    }
    if (this.compactLogFormat != null) {
      json[r'compactLogFormat'] = this.compactLogFormat;
    } else {
      json[r'compactLogFormat'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(
        extensions: ConfigNodePropertyArray.fromJson(json[r'extensions']),
        minDurationMs: ConfigNodePropertyInteger.fromJson(json[r'minDurationMs']),
        maxDurationMs: ConfigNodePropertyInteger.fromJson(json[r'maxDurationMs']),
        compactLogFormat: ConfigNodePropertyBoolean.fromJson(json[r'compactLogFormat']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

