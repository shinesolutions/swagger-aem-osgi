//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties {
  /// Returns a new [OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties] instance.
  OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties({
    this.name,
    this.path,
    this.seconds,
    this.serviceName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? seconds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? serviceName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties &&
    other.name == name &&
    other.path == path &&
    other.seconds == seconds &&
    other.serviceName == serviceName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (path == null ? 0 : path!.hashCode) +
    (seconds == null ? 0 : seconds!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties[name=$name, path=$path, seconds=$seconds, serviceName=$serviceName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.seconds != null) {
      json[r'seconds'] = this.seconds;
    } else {
      json[r'seconds'] = null;
    }
    if (this.serviceName != null) {
      json[r'serviceName'] = this.serviceName;
    } else {
      json[r'serviceName'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        seconds: ConfigNodePropertyString.fromJson(json[r'seconds']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

