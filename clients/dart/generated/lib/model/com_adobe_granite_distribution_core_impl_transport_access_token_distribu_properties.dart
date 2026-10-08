//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {
  /// Returns a new [ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties] instance.
  ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties({
    this.name,
    this.serviceName,
    this.userId,
    this.accessTokenProviderPeriodTarget,
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
  ConfigNodePropertyString? serviceName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? userId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? accessTokenProviderPeriodTarget;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties &&
    other.name == name &&
    other.serviceName == serviceName &&
    other.userId == userId &&
    other.accessTokenProviderPeriodTarget == accessTokenProviderPeriodTarget;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (accessTokenProviderPeriodTarget == null ? 0 : accessTokenProviderPeriodTarget!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties[name=$name, serviceName=$serviceName, userId=$userId, accessTokenProviderPeriodTarget=$accessTokenProviderPeriodTarget]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.serviceName != null) {
      json[r'serviceName'] = this.serviceName;
    } else {
      json[r'serviceName'] = null;
    }
    if (this.userId != null) {
      json[r'userId'] = this.userId;
    } else {
      json[r'userId'] = null;
    }
    if (this.accessTokenProviderPeriodTarget != null) {
      json[r'accessTokenProvider.target'] = this.accessTokenProviderPeriodTarget;
    } else {
      json[r'accessTokenProvider.target'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
        userId: ConfigNodePropertyString.fromJson(json[r'userId']),
        accessTokenProviderPeriodTarget: ConfigNodePropertyString.fromJson(json[r'accessTokenProvider.target']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

