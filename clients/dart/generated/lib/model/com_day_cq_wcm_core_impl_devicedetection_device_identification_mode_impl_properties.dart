//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {
  /// Returns a new [ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties] instance.
  ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties({
    this.dimPeriodDefaultPeriodMode,
    this.dimPeriodAppcachePeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? dimPeriodDefaultPeriodMode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? dimPeriodAppcachePeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties &&
    other.dimPeriodDefaultPeriodMode == dimPeriodDefaultPeriodMode &&
    other.dimPeriodAppcachePeriodEnabled == dimPeriodAppcachePeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dimPeriodDefaultPeriodMode == null ? 0 : dimPeriodDefaultPeriodMode!.hashCode) +
    (dimPeriodAppcachePeriodEnabled == null ? 0 : dimPeriodAppcachePeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties[dimPeriodDefaultPeriodMode=$dimPeriodDefaultPeriodMode, dimPeriodAppcachePeriodEnabled=$dimPeriodAppcachePeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dimPeriodDefaultPeriodMode != null) {
      json[r'dim.default.mode'] = this.dimPeriodDefaultPeriodMode;
    } else {
      json[r'dim.default.mode'] = null;
    }
    if (this.dimPeriodAppcachePeriodEnabled != null) {
      json[r'dim.appcache.enabled'] = this.dimPeriodAppcachePeriodEnabled;
    } else {
      json[r'dim.appcache.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(
        dimPeriodDefaultPeriodMode: ConfigNodePropertyDropDown.fromJson(json[r'dim.default.mode']),
        dimPeriodAppcachePeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'dim.appcache.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

