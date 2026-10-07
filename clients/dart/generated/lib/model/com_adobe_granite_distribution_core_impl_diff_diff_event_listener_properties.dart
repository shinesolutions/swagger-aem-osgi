//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {
  /// Returns a new [ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties] instance.
  ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties({
    this.diffPath,
    this.serviceName,
    this.serviceUserPeriodTarget,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? diffPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? serviceName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? serviceUserPeriodTarget;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties &&
    other.diffPath == diffPath &&
    other.serviceName == serviceName &&
    other.serviceUserPeriodTarget == serviceUserPeriodTarget;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (diffPath == null ? 0 : diffPath!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode) +
    (serviceUserPeriodTarget == null ? 0 : serviceUserPeriodTarget!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties[diffPath=$diffPath, serviceName=$serviceName, serviceUserPeriodTarget=$serviceUserPeriodTarget]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.diffPath != null) {
      json[r'diffPath'] = this.diffPath;
    } else {
      json[r'diffPath'] = null;
    }
    if (this.serviceName != null) {
      json[r'serviceName'] = this.serviceName;
    } else {
      json[r'serviceName'] = null;
    }
    if (this.serviceUserPeriodTarget != null) {
      json[r'serviceUser.target'] = this.serviceUserPeriodTarget;
    } else {
      json[r'serviceUser.target'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(
        diffPath: ConfigNodePropertyString.fromJson(json[r'diffPath']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
        serviceUserPeriodTarget: ConfigNodePropertyString.fromJson(json[r'serviceUser.target']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

