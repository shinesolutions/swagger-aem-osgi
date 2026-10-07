//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixScrScrServiceProperties {
  /// Returns a new [OrgApacheFelixScrScrServiceProperties] instance.
  OrgApacheFelixScrScrServiceProperties({
    this.dsPeriodLoglevel,
    this.dsPeriodFactoryPeriodEnabled,
    this.dsPeriodDelayedPeriodKeepInstances,
    this.dsPeriodLockPeriodTimeoutPeriodMilliseconds,
    this.dsPeriodStopPeriodTimeoutPeriodMilliseconds,
    this.dsPeriodGlobalPeriodExtender,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? dsPeriodLoglevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? dsPeriodFactoryPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? dsPeriodDelayedPeriodKeepInstances;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? dsPeriodLockPeriodTimeoutPeriodMilliseconds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? dsPeriodStopPeriodTimeoutPeriodMilliseconds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? dsPeriodGlobalPeriodExtender;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixScrScrServiceProperties &&
    other.dsPeriodLoglevel == dsPeriodLoglevel &&
    other.dsPeriodFactoryPeriodEnabled == dsPeriodFactoryPeriodEnabled &&
    other.dsPeriodDelayedPeriodKeepInstances == dsPeriodDelayedPeriodKeepInstances &&
    other.dsPeriodLockPeriodTimeoutPeriodMilliseconds == dsPeriodLockPeriodTimeoutPeriodMilliseconds &&
    other.dsPeriodStopPeriodTimeoutPeriodMilliseconds == dsPeriodStopPeriodTimeoutPeriodMilliseconds &&
    other.dsPeriodGlobalPeriodExtender == dsPeriodGlobalPeriodExtender;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dsPeriodLoglevel == null ? 0 : dsPeriodLoglevel!.hashCode) +
    (dsPeriodFactoryPeriodEnabled == null ? 0 : dsPeriodFactoryPeriodEnabled!.hashCode) +
    (dsPeriodDelayedPeriodKeepInstances == null ? 0 : dsPeriodDelayedPeriodKeepInstances!.hashCode) +
    (dsPeriodLockPeriodTimeoutPeriodMilliseconds == null ? 0 : dsPeriodLockPeriodTimeoutPeriodMilliseconds!.hashCode) +
    (dsPeriodStopPeriodTimeoutPeriodMilliseconds == null ? 0 : dsPeriodStopPeriodTimeoutPeriodMilliseconds!.hashCode) +
    (dsPeriodGlobalPeriodExtender == null ? 0 : dsPeriodGlobalPeriodExtender!.hashCode);

  @override
  String toString() => 'OrgApacheFelixScrScrServiceProperties[dsPeriodLoglevel=$dsPeriodLoglevel, dsPeriodFactoryPeriodEnabled=$dsPeriodFactoryPeriodEnabled, dsPeriodDelayedPeriodKeepInstances=$dsPeriodDelayedPeriodKeepInstances, dsPeriodLockPeriodTimeoutPeriodMilliseconds=$dsPeriodLockPeriodTimeoutPeriodMilliseconds, dsPeriodStopPeriodTimeoutPeriodMilliseconds=$dsPeriodStopPeriodTimeoutPeriodMilliseconds, dsPeriodGlobalPeriodExtender=$dsPeriodGlobalPeriodExtender]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dsPeriodLoglevel != null) {
      json[r'ds.loglevel'] = this.dsPeriodLoglevel;
    } else {
      json[r'ds.loglevel'] = null;
    }
    if (this.dsPeriodFactoryPeriodEnabled != null) {
      json[r'ds.factory.enabled'] = this.dsPeriodFactoryPeriodEnabled;
    } else {
      json[r'ds.factory.enabled'] = null;
    }
    if (this.dsPeriodDelayedPeriodKeepInstances != null) {
      json[r'ds.delayed.keepInstances'] = this.dsPeriodDelayedPeriodKeepInstances;
    } else {
      json[r'ds.delayed.keepInstances'] = null;
    }
    if (this.dsPeriodLockPeriodTimeoutPeriodMilliseconds != null) {
      json[r'ds.lock.timeout.milliseconds'] = this.dsPeriodLockPeriodTimeoutPeriodMilliseconds;
    } else {
      json[r'ds.lock.timeout.milliseconds'] = null;
    }
    if (this.dsPeriodStopPeriodTimeoutPeriodMilliseconds != null) {
      json[r'ds.stop.timeout.milliseconds'] = this.dsPeriodStopPeriodTimeoutPeriodMilliseconds;
    } else {
      json[r'ds.stop.timeout.milliseconds'] = null;
    }
    if (this.dsPeriodGlobalPeriodExtender != null) {
      json[r'ds.global.extender'] = this.dsPeriodGlobalPeriodExtender;
    } else {
      json[r'ds.global.extender'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixScrScrServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixScrScrServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixScrScrServiceProperties(
        dsPeriodLoglevel: ConfigNodePropertyDropDown.fromJson(json[r'ds.loglevel']),
        dsPeriodFactoryPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'ds.factory.enabled']),
        dsPeriodDelayedPeriodKeepInstances: ConfigNodePropertyBoolean.fromJson(json[r'ds.delayed.keepInstances']),
        dsPeriodLockPeriodTimeoutPeriodMilliseconds: ConfigNodePropertyInteger.fromJson(json[r'ds.lock.timeout.milliseconds']),
        dsPeriodStopPeriodTimeoutPeriodMilliseconds: ConfigNodePropertyInteger.fromJson(json[r'ds.stop.timeout.milliseconds']),
        dsPeriodGlobalPeriodExtender: ConfigNodePropertyBoolean.fromJson(json[r'ds.global.extender']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixScrScrServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixScrScrServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixScrScrServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixScrScrServiceProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixScrScrServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixScrScrServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixScrScrServiceProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixScrScrServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixScrScrServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixScrScrServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

