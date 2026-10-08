//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {
  /// Returns a new [ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties] instance.
  ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties({
    this.devicePeriodInfoPeriodTransformerPeriodEnabled,
    this.devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? devicePeriodInfoPeriodTransformerPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties &&
    other.devicePeriodInfoPeriodTransformerPeriodEnabled == devicePeriodInfoPeriodTransformerPeriodEnabled &&
    other.devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle == devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (devicePeriodInfoPeriodTransformerPeriodEnabled == null ? 0 : devicePeriodInfoPeriodTransformerPeriodEnabled!.hashCode) +
    (devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle == null ? 0 : devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle!.hashCode);

  @override
  String toString() => 'ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties[devicePeriodInfoPeriodTransformerPeriodEnabled=$devicePeriodInfoPeriodTransformerPeriodEnabled, devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle=$devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.devicePeriodInfoPeriodTransformerPeriodEnabled != null) {
      json[r'device.info.transformer.enabled'] = this.devicePeriodInfoPeriodTransformerPeriodEnabled;
    } else {
      json[r'device.info.transformer.enabled'] = null;
    }
    if (this.devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle != null) {
      json[r'device.info.transformer.css.style'] = this.devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle;
    } else {
      json[r'device.info.transformer.css.style'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(
        devicePeriodInfoPeriodTransformerPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'device.info.transformer.enabled']),
        devicePeriodInfoPeriodTransformerPeriodCssPeriodStyle: ConfigNodePropertyString.fromJson(json[r'device.info.transformer.css.style']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

