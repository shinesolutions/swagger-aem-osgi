//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {
  /// Returns a new [ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties] instance.
  ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties({
    this.offloadingPeriodTransporter,
    this.offloadingPeriodCleanupPeriodPayload,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? offloadingPeriodTransporter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? offloadingPeriodCleanupPeriodPayload;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties &&
    other.offloadingPeriodTransporter == offloadingPeriodTransporter &&
    other.offloadingPeriodCleanupPeriodPayload == offloadingPeriodCleanupPeriodPayload;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (offloadingPeriodTransporter == null ? 0 : offloadingPeriodTransporter!.hashCode) +
    (offloadingPeriodCleanupPeriodPayload == null ? 0 : offloadingPeriodCleanupPeriodPayload!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties[offloadingPeriodTransporter=$offloadingPeriodTransporter, offloadingPeriodCleanupPeriodPayload=$offloadingPeriodCleanupPeriodPayload]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.offloadingPeriodTransporter != null) {
      json[r'offloading.transporter'] = this.offloadingPeriodTransporter;
    } else {
      json[r'offloading.transporter'] = null;
    }
    if (this.offloadingPeriodCleanupPeriodPayload != null) {
      json[r'offloading.cleanup.payload'] = this.offloadingPeriodCleanupPeriodPayload;
    } else {
      json[r'offloading.cleanup.payload'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(
        offloadingPeriodTransporter: ConfigNodePropertyString.fromJson(json[r'offloading.transporter']),
        offloadingPeriodCleanupPeriodPayload: ConfigNodePropertyBoolean.fromJson(json[r'offloading.cleanup.payload']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

