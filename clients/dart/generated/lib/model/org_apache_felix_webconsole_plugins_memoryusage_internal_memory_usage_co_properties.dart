//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {
  /// Returns a new [OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties] instance.
  OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties({
    this.felixPeriodMemoryusagePeriodDumpPeriodThreshold,
    this.felixPeriodMemoryusagePeriodDumpPeriodInterval,
    this.felixPeriodMemoryusagePeriodDumpPeriodLocation,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? felixPeriodMemoryusagePeriodDumpPeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? felixPeriodMemoryusagePeriodDumpPeriodInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? felixPeriodMemoryusagePeriodDumpPeriodLocation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties &&
    other.felixPeriodMemoryusagePeriodDumpPeriodThreshold == felixPeriodMemoryusagePeriodDumpPeriodThreshold &&
    other.felixPeriodMemoryusagePeriodDumpPeriodInterval == felixPeriodMemoryusagePeriodDumpPeriodInterval &&
    other.felixPeriodMemoryusagePeriodDumpPeriodLocation == felixPeriodMemoryusagePeriodDumpPeriodLocation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (felixPeriodMemoryusagePeriodDumpPeriodThreshold == null ? 0 : felixPeriodMemoryusagePeriodDumpPeriodThreshold!.hashCode) +
    (felixPeriodMemoryusagePeriodDumpPeriodInterval == null ? 0 : felixPeriodMemoryusagePeriodDumpPeriodInterval!.hashCode) +
    (felixPeriodMemoryusagePeriodDumpPeriodLocation == null ? 0 : felixPeriodMemoryusagePeriodDumpPeriodLocation!.hashCode);

  @override
  String toString() => 'OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties[felixPeriodMemoryusagePeriodDumpPeriodThreshold=$felixPeriodMemoryusagePeriodDumpPeriodThreshold, felixPeriodMemoryusagePeriodDumpPeriodInterval=$felixPeriodMemoryusagePeriodDumpPeriodInterval, felixPeriodMemoryusagePeriodDumpPeriodLocation=$felixPeriodMemoryusagePeriodDumpPeriodLocation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.felixPeriodMemoryusagePeriodDumpPeriodThreshold != null) {
      json[r'felix.memoryusage.dump.threshold'] = this.felixPeriodMemoryusagePeriodDumpPeriodThreshold;
    } else {
      json[r'felix.memoryusage.dump.threshold'] = null;
    }
    if (this.felixPeriodMemoryusagePeriodDumpPeriodInterval != null) {
      json[r'felix.memoryusage.dump.interval'] = this.felixPeriodMemoryusagePeriodDumpPeriodInterval;
    } else {
      json[r'felix.memoryusage.dump.interval'] = null;
    }
    if (this.felixPeriodMemoryusagePeriodDumpPeriodLocation != null) {
      json[r'felix.memoryusage.dump.location'] = this.felixPeriodMemoryusagePeriodDumpPeriodLocation;
    } else {
      json[r'felix.memoryusage.dump.location'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(
        felixPeriodMemoryusagePeriodDumpPeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'felix.memoryusage.dump.threshold']),
        felixPeriodMemoryusagePeriodDumpPeriodInterval: ConfigNodePropertyInteger.fromJson(json[r'felix.memoryusage.dump.interval']),
        felixPeriodMemoryusagePeriodDumpPeriodLocation: ConfigNodePropertyString.fromJson(json[r'felix.memoryusage.dump.location']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

